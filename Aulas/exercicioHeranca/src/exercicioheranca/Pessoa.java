package exercicioheranca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guest-W2rCRj
 */
public abstract class Pessoa {
    private String nome;
    private Date dataNasc;
    private Documento doc;

    public Pessoa(String nome, Date dataNasc, Documento doc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.doc = doc;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        DateFormat data = new SimpleDateFormat ("dd/MM/yyyy");
        return data.format(dataNasc);
    }

    public Documento getDoc() {
        return doc;
    }

    public abstract void imprime();
    
    
    
}
