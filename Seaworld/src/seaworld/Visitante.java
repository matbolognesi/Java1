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
public class Visitante extends Treinador {
    private double renda;
//<editor-fold defaultstate="collapsed" desc="comment">
//</editor-fold>
    public Visitante(){
        super();
        this.renda=5000.0;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    



    
}
