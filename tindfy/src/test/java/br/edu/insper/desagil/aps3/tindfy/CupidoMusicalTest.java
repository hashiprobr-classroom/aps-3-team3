package br.edu.insper.desagil.aps3.tindfy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CupidoMusicalTest {

    @Test
    public void semLikesComMusicas() {

        Artista a = new Artista(1, "a");
        Musica comum = new Musica(a, "b");
        // u1 e u2 msm musica fav
        List<Musica> fav1 = new ArrayList<>();
        fav1.add(comum);
        Usuario u1 = new Usuario(10, "paula", fav1);

        List<Musica> fav2 = new ArrayList<>();
        fav2.add(comum);
        Usuario u2 = new Usuario(20, "helo", fav2);
        CupidoMusical c = new CupidoMusical();

        assertFalse(c.deuMatch(u1, u2));

    }

    @Test
    public void comLikesSemMusicas() {
        Artista a1 = new Artista(1, "a");
        Artista a2 = new Artista(2, "b");
        List<Musica> fav1 = new ArrayList<>();
        fav1.add(new Musica(a1, "x"));
        Usuario u1 = new Usuario(11, "paula", fav1);

        List<Musica> fav2 = new ArrayList<>();
        fav2.add(new Musica(a2, "Y"));
        Usuario u2 = new Usuario(22, "helo", fav2);

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());
        assertFalse(c.deuMatch(u1, u2));


    }

    @Test
    public void comLikesComMusicas() {

        Artista a = new Artista(1, "a");
        Musica comum = new Musica(a, "b");
        List<Musica> fav1 = new ArrayList<>();
        fav1.add(comum);
        Usuario u1 = new Usuario(33, "paula", fav1);
        List<Musica> fav2 = new ArrayList<>();
        fav2.add(comum);
        Usuario u2 = new Usuario(44, "helo", fav2);

        CupidoMusical c = new CupidoMusical();
        c.darLike(u1.getId(), u2.getId());
        c.darLike(u2.getId(), u1.getId());


        assertTrue(c.deuMatch(u1, u2));
    }
}
