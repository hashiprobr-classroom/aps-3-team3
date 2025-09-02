package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {

    @Override
    //"se o primeiro usuário deu like no segundo e vice-versa e, além disso, eles gostam de pelo menos uma música em comum, devolve true;"-pagina da disciplina
    public boolean deuMatch(Usuario u1, Usuario u2) {

        if (!super.deuMatch(u1, u2)) {
            return false;
        }

        for (Musica m : u1.getMusicas()) {
            if (u2.jaAdicionou(m)) {
                return true;
            }
        }

        return false;
    }
}
