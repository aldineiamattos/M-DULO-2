package sistema.exception;

public class ValorInvalidoException extends Exception {
    //mensagem de erro + campo + exception (erro original)
    private String nomeCampo = "";

    //Sobrecarga de construtor
    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem); // this chama o construtor da própria classe
        this.nomeCampo = nomeCampo;
    } // poderia fazer tudo no construtor acima.

    //Sobrecarga de construtor
    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem);//super se refere a SuperClasse (PAI) Exception
    //super(); chama o construtor da superClasse
    //this.nomeCampo = ""; => ao invés disso posso colocar lá em cima =>private String nomeCampo = "";
    }
    
}
//this é sempre a classe onde estou -> this(sig me)

        