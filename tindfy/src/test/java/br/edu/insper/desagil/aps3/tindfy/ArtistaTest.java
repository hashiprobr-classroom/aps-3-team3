package br.edu.insper.desagil.aps3.tindfy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {

    @Test
    public void constroi() {
        Artista a = new Artista(1, "paula");
        assertEquals(1, a.getId());
        assertEquals("paula", a.getNome());
    }

    @Test
    public void mudaNome() {
        Artista a = new Artista(2, "paula");
        a.setNome("helo");
        assertEquals("helo", a.getNome());
    }
}
