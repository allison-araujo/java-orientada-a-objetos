import java.util.ArrayList;

import src.model.Cliente;

public class App{
    public static void main(String[] args){
        System.out.println("Hotel java");

        // Recepcionista recepcionista = new Recepcionista("Valeria", "674128795", "454514545545");
        // recepcionista.atenderTelefone();
        // recepcionista.idiomaIngles();
        // Camareira camareira = new Camareira("Joana", "679785412121", "7777777777");
        // camareira.arrumarACama();
        // camareira.limparQuarto();
        // Gerente gerente = new Gerente("Fabio","444444444444","1111111");
        // gerente.atenderTelefone();
        // gerente.arrumarACama();
        // Quarto quarto = new Quarto();
        // quarto.setNumero("206A");
        // quarto.setValorDiaria(100.0);
        // quarto.setTipo(EnumType.BASICO);
        // Quarto quarto2 = new Quarto();
        // quarto2.setNumero("207A");
        // quarto2.setValorDiaria(300.0);
        // quarto2.setTipo(EnumType.PRESIDENCIAL);
        // System.out.println(quarto2.getTipo());
        // System.out.println(quarto2.getTipo().getValor());


        Cliente cliente = new Cliente("Manoel da silva", "67999988888", "05974125891",18);
        Cliente cliente2 = new Cliente("Fulano silva", "67999988888", "05974125892",19);
        Cliente cliente3 = new Cliente("Ciclano da silva", "67999988888", "059741258963",20);
        Cliente cliente4 = new Cliente("Beltrano da silva", "67999988888", "059741258964",21);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        // retorna a qtt de elementos presente em uma strema colleção de dados

        clientes.stream().count();
        clientes.size();
        clientes.stream().limit(2);

       clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));;

        var test = clientes.stream().sorted();

        // clientes.stream().sorted(comparing(Cliente::getIdade));

       var res =  clientes.stream().filter(c -> c.getIdade() > 20);

       clientes.stream()
       .filter(c -> c.getNome().contains("silva"))
       .forEach( c-> System.out.println("Aqui os nome" + c.getNome()));

        
    }
}