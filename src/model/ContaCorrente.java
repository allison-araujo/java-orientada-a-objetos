package src.model;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        //super passa os valores para o pai dele de quem esta herdando
        super(agencia, conta, digito, saldoInicial);
    }


    
}
