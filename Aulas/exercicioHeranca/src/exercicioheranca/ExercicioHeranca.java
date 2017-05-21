/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioheranca;

import java.util.Calendar;

/**
 *
 * @author guest-W2rCRj
 */
public class ExercicioHeranca {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadastro cad = new Cadastro();
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DAY_OF_MONTH,07);
        calendario.set(Calendar.MONTH,Calendar.FEBRUARY);
        calendario.set(Calendar.YEAR,1995);
//agora com o construtor, tu poe o numero direto na declaração
        Documento cpfJuliano = new CPF ("11122233344");
//        cpfAlessandra.setNro("10055588833");
//      você havia esquecido de instanciar a classe no exercício de cima
        Documento cpfAlessandra = new CPF("10055588833");
        Pessoa Alessandra = new PessoaFisica (Sexo.FEM,"Alessandra",calendario.getTime(),cpfAlessandra);        
        cad.pessoas.add(Alessandra);
        calendario.set(Calendar.DAY_OF_MONTH,27);
        calendario.set(Calendar.MONTH,Calendar.APRIL);
        calendario.set(Calendar.YEAR,1989);
//numero já vai dentro da declaração
        Documento cnpjR = new CNPJ ("12999999999999");
//não é necessário mais chamar o método
//        cnpjR.setNro("12999999999999");
        Pessoa R = new PessoaJuridica ("R",calendario.getTime(),cnpjR);        
        cad.pessoas.add(R);
        cad.exibePessoas();    
    }
    
}
