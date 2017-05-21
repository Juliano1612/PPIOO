/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciodocesnovo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Valeria
 */
public class Pedido {
        
	private long numero;
	private Cliente cliente;
	private ItemPedido[] items;
        private int ultimo;
        private final int MAXITEMS = 5;

    public Pedido() {
        numero = 0;
	cliente = null;
	items = new ItemPedido[MAXITEMS];
        ultimo = -1;
    }
        
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
    }

    public long getNumero() {
	return numero;
    }

    public void setNumero(long numero) {
	this.numero = numero;
    }

    public ItemPedido[] getDoces() {
    	return items;
    }
        
    public int numeroDeItems(){
        return ultimo + 1;
    }

    public double getValorTotal() {
	double result = 0d;
	for (int i = 0; i < numeroDeItems(); i++){
		result += items[i].getValorTotal();
	}
        //alternativa
        /*for (ItemPedido p: items){
            result += p.getValorTotal();
        }*/
	return result;
    }

    public String getResumo() {
	StringBuilder result = new StringBuilder();
	result.append("Cliente: ").append(getCliente().getNome())
		.append(System.getProperty("line.separator"))
		.append("Pedido: ").append(getNumero())
		.append(System.getProperty("line.separator"))
                //.append("Doces:");
                .append("Doce\t\tQtd\tValorUni  ValorTotal ")
                .append(System.getProperty("line.separator"));

		// Mostra um resumo dos doces do pedido de Cliente
		for (int i = 0; i < numeroDeItems(); i++){
                    result.append(items[i].getResumo())
                            .append(System.getProperty("line.separator"));
		}

		// Mostra o valor final do pedido de Cliente
		result.append("Total: R$ ").append(getValorTotal())
                        .append(System.getProperty("line.separator"));
                
		return result.toString();
    }
        
    public void insereItemPedido(ItemPedido item){
        if (ultimo < (MAXITEMS - 1)) {
            items[++ultimo] = item;
        }
    }
        
    public void removeUltimoItemPedido(){
        if (ultimo >= 0){
            items[ultimo--] = null;
        }
    }
}
