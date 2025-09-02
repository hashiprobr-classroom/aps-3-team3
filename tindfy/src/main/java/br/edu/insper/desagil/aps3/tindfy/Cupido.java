package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    //'registra um like do primeiro no segundo'-pagina da disciplina
    public void darLike(int id1, int id2) {
        if (!likes.containsKey(id1)) {
            likes.put(id1, new ArrayList<>());
        }
        List<Integer> lista = likes.get(id1);
        if (!lista.contains(id2)) {
            lista.add(id2);
        }
    }

    public boolean deuMatch(Usuario u1, Usuario u2) {
        List<Integer> lista1 = likes.get(u1.getId());
        List<Integer> lista2 = likes.get(u2.getId());

        if (lista1 == null || lista2 == null) {
            return false;
        }

        return lista1.contains(u2.getId()) && lista2.contains(u1.getId());
    }
}
