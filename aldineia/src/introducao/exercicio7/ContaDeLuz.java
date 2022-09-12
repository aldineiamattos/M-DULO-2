package introducao.exercicio7;

import java.util.Date;

public class ContaDeLuz {
    private float valorDaConta;
    private Date dataLeitura;
    private int numeroLeitura;
    private float quantidadeKW;
    private Date dataPagemento;
    private float valorMedio;

    //digitar ctor preenche automático
    public ContaDeLuz(float valorDaConta,
                      Date dataLeitura,
                      int numeroLeitura,
                      float quantidadeKW, 
                      Date dataPagamento,
                      float valorMedio) { 
        this.valorDaConta = valorDaConta;
        this.dataLeitura= dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.quantidadeKW = quantidadeKW;
        this.dataPagemento= dataPagamento;
        this.valorMedio= valorMedio;

    }

    public float getValorDaConta() {
        return valorDaConta;
    }
    public Date getDataLeitura() {
        return dataLeitura;
    }
    public int getNumeroLeitura() {
        return numeroLeitura;
    }
    public float getQuantidadeKW() {
        return quantidadeKW;
    }
    public Date getDataPagemento() {
        return dataPagemento;
    }
    public float getValorMedio() {
        return valorMedio;
    }

      
}
