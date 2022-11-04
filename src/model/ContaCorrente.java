package src.model;

import java.util.Date;

import src.utils.DataUtil;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        //super passa os valores para o pai dele de quem esta herdando
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("********************************************");
        System.out.println("***************** EXTRATO BANCARIO *********");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Gerado em: " + DataUtil.convertDateParDataEHora(new Date()));
        System.out.println();

        for (Movimentacao movimentacao : this.movimentacoes) {
        System.out.println(movimentacao);   
        System.out.println();

        }
        System.out.println("********************************************");
        System.out.println("********************************************");



        
    }


    
}
