import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumType;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App{
    public static void main(String[] args){
        System.out.println("Hotel java");

        Cliente cliente = new Cliente("Manoel da silva", "67999988888", "05974125896");

        Recepcionista recepcionista = new Recepcionista("Valeria", "674128795", "454514545545");

        recepcionista.atenderTelefone();
        recepcionista.idiomaIngles();


        Camareira camareira = new Camareira("Joana", "679785412121", "7777777777");
        camareira.arrumarACama();
        camareira.limparQuarto();


        Gerente gerente = new Gerente("Fabio","444444444444","1111111");

        gerente.atenderTelefone();
        gerente.arrumarACama();

        Quarto quarto = new Quarto();
        quarto.setNumero("206A");
        quarto.setValorDiaria(100.0);
        quarto.setTipo(EnumType.BASICO);

        Quarto quarto2 = new Quarto();
        quarto2.setNumero("207A");
        quarto2.setValorDiaria(300.0);
        quarto2.setTipo(EnumType.PRESIDENCIAL);


        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());


    }
}