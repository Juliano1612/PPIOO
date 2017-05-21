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
public class ItemPedido {
    
    private Pedido pedido;
    private Doce doce;
    private int quantidade;

    public ItemPedido(Pedido pedido, Doce doce, int quantidade) {
	//super();
	this.pedido = pedido;
	this.doce = doce;
	this.quantidade = quantidade;
    }

    public Pedido getPedido() {
    	return pedido;
    }

    public Doce getDoce() {
	return doce;
    }

    public int getQuantidade() {
	return quantidade;
    }

    public void setQuantidade(int quantidade) {
    	this.quantidade = quantidade;
    }

    public double getValorTotal() {
    	return doce.getValorTotal() * quantidade;
    }

    public String getResumo() {
	return doce.getNome() + "\t" + this.getQuantidade() + "\t"+ doce.getValorTotal()+"\t: R$ " + getValorTotal();
    }
    
}
