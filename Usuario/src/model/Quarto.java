package src.model;

public class Quarto {
    private String numero;
    private Double valorDiaria;
    private EnumType tipo;



    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public EnumType getTipo() {
        return tipo;
    }
    public void setTipo(EnumType tipo) {
        this.tipo = tipo;
    }   

    
}
