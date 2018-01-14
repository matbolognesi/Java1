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
public class Peixe extends Baleia {//subclasse de baleia
    private int escamas;
    public Peixe(){
        super();
        this.escamas=10;
    }
    public Peixe(Double peso,int dentes,int escamas){//classe Peixe herda os atributos pesos,dentes
        super(peso,dentes);
        setEscamas(escamas);
    }
    public int getEscamas(){
        return escamas;
    }
    public void setEscamas(int escamas){
        this.escamas=escamas;
    }
    
    
    
}
