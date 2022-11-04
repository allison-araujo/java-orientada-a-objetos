package src.model;

import src.interfaces.ICamareira;
import src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei atender telefone mais  ou menos");
        System.out.println();
        
        
    }

    @Override
    public void idiomaIngles() {
        System.out.println("Sei ingles muito bem sou formado na area");
        System.out.println();
       
        
    }
    @Override
    public void arrumarACama() {
       
        System.out.println("sei um pouco só");
        System.out.println();

        
    }

    @Override
    public void limparQuarto() {
       
        System.out.println("Sei limpar o quarto mais ou menos");
        System.out.println();
        
    }
    
}
