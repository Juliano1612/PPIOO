/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

import java.util.ArrayList;

/**
 *
 * @author guest-W2rCRj
 */
class Cadastro {
    ArrayList <Pessoa> pessoas = new ArrayList<>();
    
    public void addPessoas(Pessoa p){
        pessoas.add(p);
    }
    
/*    public void exibePessoas (){
        pessoas.forEach(Pessoa::imprime);
    }
*/
    public void exibePessoas(){
        for(Pessoa p: pessoas){
            p.imprime();
        }
    }
}
