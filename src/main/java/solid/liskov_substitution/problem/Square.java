package solid.liskov_substitution.problem;

/*
* Problema: um subtipo não pode substituir o tipo base sem quebrar expectativas
* (ex.: Square que muda largura/altura “magicamente” quando ajusta um lado).
*
* */

// Violação clássica
public class Square extends Rectangle {
    @Override
    public void setWidth(int w) {
        this.width = this.height = w; // quebra expectativa de retângulo
    }

    @Override
    public void setHeight(int h) {
        this.width = this.height = h; // idem
    }
}
