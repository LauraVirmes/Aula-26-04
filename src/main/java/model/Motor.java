package model;

public class Motor {
    
    private String tipo;
    private Double capacidade;
    
    public Motor(String tipo,Double capacidade){
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(){
        this.tipo = tipo;
    }
    
    public Double getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(){
        this.capacidade = capacidade;
    }
}
