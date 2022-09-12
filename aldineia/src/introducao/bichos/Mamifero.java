package introducao.bichos;

public class Mamifero extends Animal{
    private boolean geraLeite;

    // quando a variável é booleana o Get vira is
    public boolean isGeraLeite() {
        return geraLeite;
    }

    public void setGeraLeite(boolean geraLeite) {
        this.geraLeite = geraLeite;
    }

    
    
}

//mamifero herdeu tudo de animal

//sempre a subclasse aponta para superclasse

//herança não vira variavel vira uma parte da declarção da extensão