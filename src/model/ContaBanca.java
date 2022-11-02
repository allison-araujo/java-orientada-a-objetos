package src.model;

public class ContaBanca {
    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;


    


    public ContaBanca(String agencia, String conta, Integer digito) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
    }

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

    

}
