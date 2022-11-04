package src;


import src.model.ContaCorrente;
import src.model.ContaPoupanca;
import src.utils.DataUtil;

public class App {

    public static void main(String[] args){
        System.out.print("Criando nosso banco digital");
        System.out.println();


        ContaCorrente conta  = new ContaCorrente("0001", "7541", 5, 100.10);


        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2  = new ContaPoupanca("0002", "7569", 6, 200.0);
        
        System.out.println("Saldo Conta Destino R$" + conta2.getSaldo());
        conta2.transferir(100.0, conta);
        System.out.println("Atualizando... R$" + conta2.getSaldo());
        
        System.out.println();
        
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();
        
        System.out.println(conta.getDataAbertura());
        
        var formatado = DataUtil.convertDateParDataEHora(conta.getDataAbertura());
        System.out.println("Data " + formatado);
        
        

        conta.imprimirExtrato();
        conta2.imprimirExtrato();

    }
    
}
