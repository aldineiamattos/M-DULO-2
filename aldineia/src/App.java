import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;
import static introducao.Pessoa.mostraRaca;//economiza no código

public class App {
    public static void main(String[] args) throws Exception { //observar static
        //Criando uma variável do tipo Pessoa
        //Criando uma instância de objeto a partir da 
                    
        //passagem parametros
        //instanciação
        Pessoa zezinho = new Pessoa("Laranja");
        zezinho.setNome("Zezinho da silva Sauro");
        zezinho.setCPF("555.555.555-55");
        zezinho.setAltura(1.8f);
        zezinho.setIdade (22);
        zezinho.setRaca("A");
        System.out.println(zezinho.getNome() + "Raça:" + zezinho.getRaca());
        zezinho.mostraRaca(); //vai dar erro
        Pessoa.mostraRaca(); //o java entende

        Pessoa luizinho = new Pessoa("Limão");
        //luizinho.setRaca("B");
        System.out.println(luizinho.getNome() + "Raça:" + luizinho.getRaca());
        System.out.println(zezinho.getNome() + "Raça:" + zezinho.getRaca());

        //luizinho.nome= "Luizinho da Silva SauroJr";
        //println -> é estático
        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());
               
        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-5555");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry Birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1); //0Angry Birds 
        startak.getListaAplicativos().add(app2); //1Whatsapp
        startak.getListaAplicativos().add(app3); //2 Tiktok - morreu
        startak.getListaAplicativos().add(app4); // 2 Instagram
        /*startak.getListaAplicativos().add("Laranja");
        startak.getListaAplicativos().add("Banana");
        startak.getListaAplicativos().add(1234);
        startak.getListaAplicativos().add(1200.05f);
        startak.getListaAplicativos().add(true);*/

        startak.getListaAplicativos().remove(2);// remover 
        startak.getListaAplicativos().set(2, new Aplicativo ("Grobopray")); //alterar
        System.out.println(startak.getListaAplicativos().indexOf(app1)); //consultar


        // for conta => criei um contador para pegar de um em um
        for (int i=0; i < startak.getListaAplicativos().size(); i ++){
            System.out.println(startak.getListaAplicativos().get(i).getNome());
            
        }
        //for each = PARA CADA, não têm aplicativo, têm um objeto
        for (Aplicativo umApp : startak.getListaAplicativos()){
             System.out.println(umApp);
        }
            
    }

}  
// main "método" - void "retorno"  
// classe Pessoa   
// nome e tipo = variavel
//se fosse incluir idade -Pessoa zezinho = new Pessoa("Laranja", 22);
// new cria uma pessoa
// zezinho é uma variavel
// java cria uma variavel do tipo pessoa
// NEW transforma classe em objeto
// classe diz o que o objeto pode ter
// objeto é a realização em memória de uma classe
   
//Poderia ser if(umApp instanceof String/Float) 
//add está colocando informações
//introducao.Aplicativo@7cef4e59 => esse é o aplicativo => o java fez o que ele sabe
//se não declarar na variável, em baixo ficará null- se não declarar a idade é 0
//Atributos (variaveis) automaticaticamente inicializados com valor padrão, pode ser 0 
//boleano false e objeto null.
// nome está dentro da estância do objeto
// Para criar uma pessoa eu preciso dar nome; cpf e altura
// referencia -> caminho para chegar ao objeto
// tudo se acessa pela referencia que é um objeto

    

        
        

        

    
    




    

        
    



                 
        
    
    
