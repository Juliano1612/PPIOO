/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciapenalti;

import java.util.Random;

/**
 *
 * @author Juliano
 */
public class Batedor extends Jogador{

    public Batedor(int numCamisa, String nome, Time time, Perfil perfil) {
        super(numCamisa, nome, time, perfil);
    }
    
    public boolean chutar(Ponto ponto){
        return errar();
    }
    public boolean errar(){
        Random gerador = new Random();
        return gerador.nextBoolean();
    }
}
