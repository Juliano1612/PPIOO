/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

/**
 *
 * @author guest-W2rCRj
 */
public class CPF extends Documento {

    /*    @Override
    public int getTam() {
        return 11;
    }*/    
//agora que adicionou o construtor na super classe, o construtor da classe filha tem um método
//que seta automaticamente o numero    
    public CPF(String numero) {
        super(numero);
    }

//quando você implementa a classe filha da classe abstrata, tu tem que usar o mesmo
//nome no método abstrato    
    @Override
    public int getTamanho() {
        return 11;
    }

}
