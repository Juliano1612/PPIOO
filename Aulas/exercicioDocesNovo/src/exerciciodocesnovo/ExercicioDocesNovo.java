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
public class ExercicioDocesNovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doce peDeMoleque = new Doce();
	peDeMoleque.setNome("Pé-de-moleque");
	peDeMoleque.setValorCusto(0.7d);
	peDeMoleque.setValorLucro(0.3d);

	// Cadastrando doce pé-de-moça
        /*Doce peDeMoca = new Doce();
         * peDeMoca.setNome("Pé-de-moça");
         * peDeMoca.setValorCusto(1d);
         * peDeMoca.setValorLucro(0.5d);*/
        
        Doce peDeMoca = new Doce("Pé-de-moça", 1d, 0.5d);

	// Cadastrando doce pão-de-mel
	Doce paoDeMel = new Doce();
	paoDeMel.setNome("Pão-de-mel");
	paoDeMel.setValorCusto(2.5d);
	paoDeMel.setValorLucro(1.0d);

	// Cadastrando doce torta de morango
	Doce tortaMorango = new Doce();
	tortaMorango.setNome("Torta de morango");
	tortaMorango.setValorCusto(3.5d);
	tortaMorango.setValorLucro(2.5d);

	// Cadastrando doce bolo gelado
	Doce boloGelado = new Doce();
	boloGelado.setNome("Bolo gelado");
	boloGelado.setValorCusto(2d);
	boloGelado.setValorLucro(0.75d);

	// Cadastrando cliente Maria
	Cliente maria = new Cliente("Maria", "(44) 1234-5678");
        
        Cliente pedro = new Cliente("Pedro", "(44) 9966-1234");
		
	// Cadastrando pedido de Maria, com três doces
	Pedido pedidoMaria = new Pedido();
	pedidoMaria.setCliente(maria);
	pedidoMaria.setNumero(1l);
        
	pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, paoDeMel, 5));
	pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, peDeMoca, 10));
	pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, boloGelado, 2));
        pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, paoDeMel, 7));
        pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, paoDeMel, 8));
        pedidoMaria.insereItemPedido(new ItemPedido(pedidoMaria, paoDeMel, 9));
        
        // Cadastrando pedido de Pedro, com dois doces
        Pedido pedidoPedro = new Pedido();
        pedidoPedro.setCliente(pedro);
        pedidoPedro.setNumero(2l);
        pedidoPedro.insereItemPedido(new ItemPedido(pedidoPedro, paoDeMel, 10));
        pedidoPedro.insereItemPedido(new ItemPedido(pedidoPedro, peDeMoca, 20));
        pedidoPedro.insereItemPedido(new ItemPedido(pedidoPedro, peDeMoleque, 5));
        pedidoPedro.removeUltimoItemPedido();
        pedidoPedro.removeUltimoItemPedido();
        pedidoPedro.removeUltimoItemPedido();
        pedidoPedro.removeUltimoItemPedido();
        pedidoPedro.removeUltimoItemPedido();
        pedidoPedro.insereItemPedido(new ItemPedido(pedidoPedro, paoDeMel, 5));
        		
	// Mostra o resumo do pedido de Maria
	System.out.println(pedidoMaria.getResumo());
        // Mostra o resumo do pedido de Pedro
        System.out.println(pedidoPedro.getResumo());

    }
    
}
