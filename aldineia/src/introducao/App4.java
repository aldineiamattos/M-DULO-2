package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;

public class App4 {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1945, 00, 01);
        Autor autor = new Autor ("Deitel", calendario.getTime());
        livro1.setEscritor(autor);
        System.out.println(livro1);

        try {
            Livro livro2 = new Livro("UML guia do usuário");
            livro2.setValor(165f);
            livro2.setEsgotado(false);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Autor autor2 = new Autor ("Grady Booch", sdf.parse("27/02/1955"));
            livro2.setEscritor(autor2);
            System.out.println(livro2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Livro livro3= new Livro("Java 2 ensino didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        Autor autor3 = new Autor("Grady Booch", null);
        livro3.setEscritor(autor3);
        System.out.println(livro3);


  
    }
    
}
