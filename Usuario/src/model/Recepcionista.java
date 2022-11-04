package src.model;

import src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Sei atender telefone");
        System.out.println();
        
        
    }

    @Override
    public void idiomaIngles() {
        System.out.println("Sei ingles");
        System.out.println();
       
        
    }
    
    
}
