package src.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

public  abstract class ContaBancaria {
    //#region Atributis
    protected String agencia;
    protected String conta;
    protected Integer digito;
    protected Double saldo;
    protected ArrayList<Movimentacao> movimentacoes;
    protected Date dataAbertura;


 

    private Double VALOR_MIN_DEPOSITO = 10.00;

    //#endregion


    //#region Contrutores


    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        this.movimentacoes = new ArrayList<Movimentacao>();

        Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
        this.movimentacoes.add(movimentacao);
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
       
    public Date getDataAbertura() {
        return dataAbertura;
    }


    public void depositar(Double valor){
        if( valor < VALOR_MIN_DEPOSITO){
            throw new InputMismatchException(" O valor minimo é R$" + VALOR_MIN_DEPOSITO);
        }else {

            this.saldo += valor ;
            Movimentacao movimentacao = new Movimentacao("Deposito",valor);
            this.movimentacoes.add(movimentacao);
        }
    }

    public Double sacar(Double valor){        
        if(this.saldo < valor){
            throw new InputMismatchException("Saldo Insuficiente");
        }
            this.saldo -= valor;
            Movimentacao movimentacao = new Movimentacao("Saque",valor);
            this.movimentacoes.add(movimentacao);

            return valor;
    }

    public void transferir(Double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar((valor));

    }
    
    public abstract void imprimirExtrato();

    
    

}
