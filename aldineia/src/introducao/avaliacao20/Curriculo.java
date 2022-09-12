package introducao.avaliacao20;

import java.util.ArrayList;

public class Curriculo {
    private ArrayList<Formacao> listaFormacoes = new ArrayList<>();
    private ArrayList<ExperienciaProfissional> listaExperienciasProfissionais = new ArrayList<>();
    private Pessoa pessoa;
   
    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }

    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }

    public void setListaExperienciasProfissionais(ArrayList<ExperienciaProfissional> listaExperienciasProfissionais) {
        this.listaExperienciasProfissionais = listaExperienciasProfissionais;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /* Deverá gerar uma única string contendo todos os dados de todas as classes vinculadas ao currículo da pessoa, 
    incluindo formacao e experiencia profissional */
    public String gerarCurriculo(){
        StringBuilder montador = new StringBuilder();

        montador.append("Pessoa Nome: " + getPessoa().getNome() + "\n");
        montador.append("Pessoa Data Nasc: " + getPessoa().getDataNascimento() + "\n");
        
        for(var umaFormacao : getListaFormacoes()){
        montador.append("Formacao Nome: " + umaFormacao.getNome() + "\n");
        montador.append("Formacao Ano Conclusao: " + umaFormacao.getAnoConclusao() + "\n");
        }
        for(var umaExperienciaProfissional : getListaExperienciasProfissionais()){
        montador.append("Exp Prof Nome: " + umaExperienciaProfissional.getNome() + "\n");
        montador.append("Exp Prof Ano Conclusao: " + umaExperienciaProfissional.getAnoConclusao() + "\n");
        }
        return montador.toString();
    }
    /* Deverá contar quantas experiencias profissionais existem no curriculo e retornar */
  
    public int NumExperienciasProfissionais(){
        int contador=0;
        
        for(var umaExperienciaProfissional : listaExperienciasProfissionais){
            umaExperienciaProfissional.getNome();
            contador++;
        }
        return contador;
        }
    }
        
 
      
        





        


        
                
            
    

    
    
          

        
        
        
           

    

        
    





    
            
        

       
    

    

    

