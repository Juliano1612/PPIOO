/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciodocesnovo;

/**
 *
 * @author Valeria
 */
public class Doce {
    
	private String nome;
	private double valorCusto;
	private double valorLucro;

	public Doce(){
            this(null, 0d, 0d);
        }
        public Doce(String nome, double vc, double vl){
            this.nome = nome;
            this.valorCusto = vc;
            this.valorLucro = vl;
        }
        
        public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public double getValorLucro() {
		return valorLucro;
	}

	public void setValorLucro(double valorLucro) {
		this.valorLucro = valorLucro;
	}

	public double getValorTotal() {
		return valorCusto + valorLucro;
	}
    
}
