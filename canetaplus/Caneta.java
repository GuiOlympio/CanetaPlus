/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canetaplus;

/**
 *
 * @author gingu
 */
public class Caneta {
    private String cor;
    private String modelo;
    private boolean tampa;
    private float ponta;
    
    
    // Metodo construtor
    public Caneta(String m, String c, float p){
        this.tampar();
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }
    // Metodo 
    public void status(){
        System.out.println("==+=+=+=+=+=+=++=+=+=+");
        System.out.println("Sobre a caneta !!");
        System.out.println("cor: "+ this.cor);
        System.out.println("ponta: "+ this.ponta);
        System.out.println("modelo: "+ this.modelo);
        System.out.println("esta tampada?: "+ this.tampa);
    }
    
    // Metodos Getters e Setters
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void tampar(){
        this.tampa = true; 
    }
    
    public void destampar(){
        this.tampa = false;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
}
