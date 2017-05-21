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
abstract class Documento {
    
    private String numero;
//não esqueça de sempre criar um construtor pra facilitar na hora de instanciar
    public Documento(String numero) {
        //para não precisar alterar o lugar da verificação, dentro do construtor eu chamei
        //o método onde tu criou as restrições
        setNumero(numero);
    }
    
    public void setNumero(String numero) {
        if(numero.length() != getTamanho()){
            System.out.println("Numero Inválido");
            this.numero = null;
        }
        else{
            this.numero = numero;
        }
    }
    
    public String getNumero() {
        return numero;
    }
    
    public abstract int getTamanho();
    
}
