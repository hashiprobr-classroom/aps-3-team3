package br.edu.insper.desagil.aps3.tindfy;

import java.util.List;

public class Usuario extends Pessoa {
    private List<Musica> musicas;

    public Usuario(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void jaAdicionou() {

    }

    public void adiciona() {

    }
}