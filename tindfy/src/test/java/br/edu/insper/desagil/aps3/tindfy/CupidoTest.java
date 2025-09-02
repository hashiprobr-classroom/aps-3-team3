package br.edu.insper.desagil.aps3.tindfy;


import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;


public class CupidoTest {

    @Test
    public void ninguemDaLike() {
        Cupido c = new Cupido();
        Usuario u1 = new Usuario(1, "paula", new ArrayList<>());
        Usuario u2 = new Usuario(2, "helo", new ArrayList<>());
        assertFalse(c.deuMatch(u1, u2));

    }

    @Test
    public void primeiroDaLike() {

        Cupido c = new Cupido();
        Usuario u1 = new Usuario(1, "paula", new ArrayList<>());
        Usuario u2 = new Usuario(2, "helo", new ArrayList<>());
        c.darLike(u1.getId(), u2.getId());
        assertFalse(c.deuMatch(u1, u2));


    }

    @Test
    public void segundoDaLike() {
        Cupido c = new Cupido();
        Usuario u1 = new Usuario(1, "paula", new ArrayList<>());
        Usuario u2 = new Usuario(2, "helo", new ArrayList<>());

        c.darLike(u2.getId(), u1.getId());
        assertFalse(c.deuMatch(u1, u2));
    }
}
