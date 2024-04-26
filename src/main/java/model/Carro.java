package model;

public class Carro {
    private String modelo;
    private Motor motorizacao;
    
    public Carro(String modelo,Motor motor){
        this.modelo = modelo;
        this.motorizacao = motor;
    }
    
    public String getModelo(){
        return modelo;   
    }
    
    public void setModelo(){
        this.modelo = modelo;
    }
    
    public Motor getMotorizacao(){
        return motorizacao;
    }
    
    public void setMotorizacao(){
        this.motorizacao = motorizacao;
    }
}
