package src.model;


public enum EnumType {

    BASICO("Basico"), 
    MASTER("Master"), 
    PRESIDENCIAL("Suite Presidencial");
    
    private String valor;
    
    private EnumType(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;

    }

}
