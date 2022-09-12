import introducao.bichos.Animal;
import introducao.bichos.Mamifero;

public class App2 {
    public static void main(String[] args) {
        //SUPERCLASSE
        Animal animal = new Animal();
        animal.setSexo("feminino");
        System.out.println(animal.getClass());
        System.out.println(animal.hashCode());

        //SUBCLASSE
        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("masculino");
        mamifero.setGeraLeite(false);
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());
        /*class introducao.bichos.Animal
        1603195447
        class introducao.bichos.Mamifero
        1191747167 => hashCode 
        masculino
        class introducao.bichos.Mamifero
        1191747167 o hashcode têm que ser igual a do 1º animal */

        Animal animal2 = mamifero;
        //Cast - conversão, o Cast entre objetos só pode existir 
        //numa relação de herança
        System.out.println(((Mamifero)animal2).isGeraLeite());
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());




    }


    
}
