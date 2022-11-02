package src.model;

import java.util.InputMismatchException;

public class ContaBanca {
    //#region Atributis
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private Double VALOR_MIN_DEPOSITO = 10.00;

    //#endregion


    //#region Contrutores


    public ContaBanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }
    //#endregion
 
 
 
 
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }  


    public void depositar(Double valor){
        if( valor < VALOR_MIN_DEPOSITO){
            throw new InputMismatchException(" O valor minimo é R$" + VALOR_MIN_DEPOSITO);
        }else {

            this.saldo += valor ;
        }
    }

    public Double sacar(Double valor){
        
        if(this.saldo < valor){
            throw new InputMismatchException("Saldo Insuficiente");
        }

            this.saldo -= valor;

            return valor;
    }

    

}
