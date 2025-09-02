package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;


public class UsuarioTest {

    @Test
    public void naoAdiciona() {
        Artista a1 = new Artista(1, "A");
        Artista a2 = new Artista(2, "B");

        Musica m1 = new Musica(a1, "X");
        Musica m2 = new Musica(a1, "Y");
        Musica m3 = new Musica(a2, "Z");

        List<Musica> favoritas = new ArrayList<>();
        favoritas.add(m1);
        favoritas.add(m2);
        favoritas.add(m3);


        Usuario u = new Usuario(10, "paula", favoritas);
        int antes = u.getMusicas().size();
        u.adiciona(m2);
        assertEquals(antes, u.getMusicas().size());
    }

    @Test
    public void adiciona() {
        Artista a1 = new Artista(1, "A");
        Artista a2 = new Artista(2, "B");

        Musica m1 = new Musica(a1, "X");
        Musica m2 = new Musica(a1, "Y");
        Musica m3 = new Musica(a2, "Z");
        Musica m4 = new Musica(a2, "W");

        List<Musica> favoritas = new ArrayList<>();
        favoritas.add(m1);
        favoritas.add(m2);
        favoritas.add(m3);

        Usuario u = new Usuario(11, "helo", favoritas);
        int antes = u.getMusicas().size();
        u.adiciona(m4); // nova
        assertEquals(antes + 1, u.getMusicas().size());
        assertTrue(u.jaAdicionou(m4));
    }
}
