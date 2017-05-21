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
public class Perfil {
    public int qualidade;
    public int confianca;

    public Perfil(int qualidade, int confianca) {
        this.qualidade = qualidade;
        this.confianca = confianca;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getConfianca() {
        return confianca;
    }
    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public void setConfianca(int confianca) {
        this.confianca = confianca;
    }   
    
}
