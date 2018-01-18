/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.Objects;

/**
 *
 * @author Remagi
 */
public class Prduto {
    	public String nome;
	private int codigo;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Prduto() {
		this.nome="filme";
		this.codigo=2;
	}
	public Prduto(String nome,int codigo) {
		setNome(nome);
		setCodigo(codigo);
	}
	public String toString() {//método que retorna qualquer informação relativa ao objeto
		return "O nome do produto e:"+nome+" e o seu codigo e : "+codigo;
		
	}
	public int hashCode() {//Método para gerar um número que represente um objeto ou determinado dado pertencente a ele
		int pair=2;
		pair=2*49+this.codigo;
		pair=2*49+Objects.hashCode(nome);
		return pair;
	}
            @Override
        public boolean equals(Object obj){//Método usado para comparar objetos e classes
            if(this==obj){//se tiver uma super classe acrescentar antes dessa linha um outro if(!=super.equals(obj)){return false}
                return true;
            }
            if(obj==null){
                return false;
            }
            if(getClass()!=obj.getClass()){
                return false;
            }
            final Prduto other= (Prduto) obj;
            if(this.codigo!=other.codigo){
                return false;
            }
            if(!Objects.equals(this.nome,other.nome)){
                return false;
            }
            return true;
            
        }
        


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prduto p1=new Prduto();
		System.out.println(p1.toString());
                System.out.println("O seu codigo secreto e: "+p1.hashCode());
                Prduto p2=new Prduto("dvd",3);
                System.out.println(p1.equals(p2));
                System.out.println(p2.toString());


	}

}



