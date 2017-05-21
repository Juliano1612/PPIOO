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
public class PessoaFisica extends Pessoa {
    private Sexo sexo;

    public PessoaFisica(Sexo sexo, String nome, Date dataNasc, Documento doc) {
        super(nome, dataNasc, doc);
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("Sexo: " + this.getSexo());
        //além de informar que tu quer o documento da classe, tu tem que chamar o getNumero pra
        //ele exibir o numero
        System.out.println("Documento: " + this.getDoc().getNumero());
    }
    
    
    
}
