/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seaworld;

/**
 *
 * @author Remagi
 */
public class Baleia {
    private  Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getDentes() {
        return dentes;
    }

    public void setDentes(int dentes) {
        this.dentes = dentes;
    }
    private int dentes;
    public Baleia(){//Construtor sem parâmetros
        this.peso=20.5;
        this.dentes=50;
        
    }
    public Baleia(Double peso,int dentes){//construtor com parâmetros da classe baleia
        this.peso=peso;
        this.dentes=dentes;
    }
    
}
