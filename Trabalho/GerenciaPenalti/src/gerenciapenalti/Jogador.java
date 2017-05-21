/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciapenalti;

/**
 *
 * @author Juliano
 */
public class Jogador {
    private int numCamisa;
    private String nome;
    private Time time;
    private Perfil perfil;

    public Jogador(int numCamisa, String nome, Time time, Perfil perfil) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.time = time;
        this.perfil = perfil;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }

    public Perfil getPerfil() {
        return perfil;
    }
    
/*    public Ponto direcionar(){
       return algo
    }
*/
}
