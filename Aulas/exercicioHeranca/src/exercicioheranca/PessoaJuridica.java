/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

import java.util.Date;

/**
 *
 * @author guest-W2rCRj
 */
public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, Date dataNasc, Documento doc) {
        super(nome, dataNasc, doc);
    }

    @Override
    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Fundação: " + this.getDataNasc());
        //além de informar que tu quer o documento da classe, tu tem que chamar o getNumero pra
        //ele exibir o numero
        System.out.println("Documento: " + this.getDoc().getNumero());
    }

 
}
