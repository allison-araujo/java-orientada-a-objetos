package src.model;

import src.interfaces.ICamareira;

public class Agendamento {

    // private Quarto quarto;
    // private Cliente cliente;

    // //injecao de dependecia
    // public Agendamento(Quarto quarto, Cliente cliente) {
    //     this.quarto = quarto;
    //     this.cliente = cliente;
    // }


        private ICamareira camareira;


        public Agendamento(ICamareira camareira){
            this.camareira = camareira;
        }
    
}
