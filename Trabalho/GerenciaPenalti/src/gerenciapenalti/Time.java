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
    public class Time {
    private String nome;
    private Torcida torcida;
    private Jogador[] jogadores;
    
    public Time(String nome, Torcida torcida) {
        this.nome = nome;
        this.torcida = torcida;
    }

    public String getNome() {
        return nome;
    }

    public Torcida getTorcida() {
        return torcida;
    }    
}
