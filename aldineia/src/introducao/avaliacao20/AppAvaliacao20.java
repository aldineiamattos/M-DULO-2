package introducao.avaliacao20;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppAvaliacao20 {

    public static void main(String[] args) {

        Curriculo curr1 = new Curriculo();
                               
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            pessoa1.setDataNascimento(sdf.parse("01/12/1980"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        curr1.setPessoa(pessoa1);
        
        Formacao form1 = new Formacao();
        form1.setNome("Ensino Médio");
        form1.setAnoConclusao(1999);
        curr1.getListaFormacoes().add(form1);
                            
        Formacao form2 = new Formacao();
        form2.setNome("Curso Novos Talentos em TI");
        form2.setAnoConclusao(2022);
        curr1.getListaFormacoes().add(form2);

        ExperienciaProfissional exp1 = new ExperienciaProfissional();
        exp1.setNome("Monstro em Java");
        exp1.setAnoConclusao("2022");
        curr1.getListaExperienciasProfissionais().add(exp1);
        
        Curriculo curr2 = new Curriculo();
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mariazinha");
        try {
            pessoa2.setDataNascimento(sdf.parse("10/07/1981"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        curr2.setPessoa(pessoa2);

        Formacao form3 = new Formacao();
        form3.setNome("Ensino Médio");
        form3.setAnoConclusao(2000);
        curr2.getListaFormacoes().add(form3);

        Formacao form4 = new Formacao();
        form4.setNome("Curso Novos Talentos em TI");
        form4.setAnoConclusao(2022);
        curr2.getListaFormacoes().add(form4);

        ExperienciaProfissional exp2 = new ExperienciaProfissional();
        exp2.setNome("DBA em MariaDB");
        exp2.setAnoConclusao("Atual");
        curr2.getListaExperienciasProfissionais().add(exp2);

        ExperienciaProfissional exp3 = new ExperienciaProfissional();
        exp3.setNome("Desenvolvedora FullStack");
        exp3.setAnoConclusao("2021");
        curr2.getListaExperienciasProfissionais().add(exp3);

        String Curriculo1 = curr1.gerarCurriculo();
        System.out.println(Curriculo1);

        String Curriculo2 = curr2.gerarCurriculo();
        System.out.println(Curriculo2);

        



       

        
        






            
      

        


        
        



        

    }
    
}
