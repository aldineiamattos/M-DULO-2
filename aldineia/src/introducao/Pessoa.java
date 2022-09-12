package introducao;

public class Pessoa { 
    //Atributos (variaveis) automaticamente inicializados com o valor padrão
    //escopo de vida de instancia
    //ENCAPSULAMENTO - POJO - Plain old Java object
    private String nomeCompleto; 
    private int idade; 
    private String CPF;
    private float altura; 
    private static String raca; //static compartilham informações
    
    /*
        {
        //válido no java
    }
    static{
        //válido no java
    }

    //inner class não pode ser public
    class Corpo{ //qualquer metodo vai ser estatico, não precisa colocar static

    }
    */
    public static void mostraRaca(){
        System.out.println(raca);
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getAltura() {
        return altura;
    }
        
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //GETTER e SETTER  
    public String getNome(){
        return this.nomeCompleto;
    }
    public void setNome(String nome){
        if(!nome.equals("")){
            this.nomeCompleto = nome;
        }
    }

    //comportamento
    //CONSTRUTOR - inicializar um objeto e definir valores obrigatorios
    public Pessoa(String nome){ //escopo de vida local
        System.out.println("CONSTRUTOR:" + nome); 
         //this.nomeCompleto = nome;
         setNome(nome);
        }//ate aqui

    // metodo (função)
    // assinatura de um método
    // modificadordeacesso tipoderetorno nomedometodo (parametros) { corpo }
    public String podeDirigir(){ 
        if (this.idade >= 18){
            return "Pode dirigir";
        }else{
            return "Não pode dirigir"; // return não faz System.out.
        }
        
    }
    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}
// O CATÁLAGO DOS PADRÕES DE PROJETO- Singleton (fala sobre static)
//- instance:Singleton
//- Singleton()
//+ getSingleton

//têm static na variável, no método e talvez na classe
//public static class -> o java não deixa

// não posso ter METODO dentro de METODO;
// posso ter CLASSE dentro de CLASSE;

//garante unico objeto na memoria não importa onde eu esteja
//metodo e variavel andam juntos.

//Livros: Codigo limpo e Arquitetura limpa
//as vezes a empresa pergunta se vc já leu esses livros
//O controle remoto é um exemplo de encapsulamento 
//encapsulamento (esconder os detalhes dentro do objeto).
//botão direito-> ação de origem -> gerar Gets e Seters vai ser subst. por 
//abaixo:
//public record Pessoa(String nome, int idade)
//public String nome; => atributo de classe 
//no momento de troca public para private, ninguém consegue acessar o nome
//A clase é a forma e o new é o ato de criar o objeto
// PUBLIC => modificador de acesso
//CONSTRUTOR - inicializar um objeto e definir valores obrigatorios:
//1º padrão, precisa ter o mesmo nome da classe;
//não pode produzir e nem devolver nada;
//CONSTRUTOR qdo usa new (criar)
//GETTER (precisa receber o que ele vai alterar) e SETTER (altera o valor)
//GETTER e SETTER - POJO - Plain old Java object
//Posso pedir nome e idade - public Pessoa(String nome, int idade)
//Posso incluir var qqcoisa = 10; não preciso dizer o tipo da variável 
//(int) porque estou colocando um valor nela
//nome = nome; não funciona porque as duas variáveis está com o mesmo nome
//trocar por nome = pnome ou p/continuar com o mesmo nome incluir o this. 
//(dessa forma o java entende)
//this. O ponto é um operador de acesso a alguma coisa na frente dele, 
//quando eu uso this estou referenciando ao objeto
//String = função
/*
f(x) = x+2
f(1) = 1+2 =3   
public int f(int x)
return x + 2;
*/   


