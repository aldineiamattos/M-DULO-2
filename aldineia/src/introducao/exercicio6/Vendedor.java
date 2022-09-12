package introducao.exercicio6;

public class Vendedor extends Funcionario {
    private float percComissao;
    private float metaVenda;
    private EquipeDeVendas equipe;


    public EquipeDeVendas getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeDeVendas equipe) {
        this.equipe = equipe;
    }
    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }
    public float getMetaVenda() {
        return metaVenda;
    }
    public void setMetaVenda(float metaVenda) {
        this.metaVenda = metaVenda;
    }

    
}

//Ferramentas que facilitam a programação:
//Porém se não utilizados de maneira correta engessam o processo
//astah software = programa que faz o código para mim
//https://astah.net/downloads/
//eu dou o diagrama e essa ferramenta gera o código para mim
//treinaweb não funciona muito bem
//genexus.com/pt/
//faz um casamento com essas empresas e depois não consegue mais sair delas e sai muito caro.
//software enterprise archiMate => sparxsystems.com (qdo clica na linha de codigo ele mostra todos os casos e usos que serão impactados)

    

