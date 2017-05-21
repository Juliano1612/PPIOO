package gerenciapenalti;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliano
 */
public class Torcedor {
    private int id;

    public Torcedor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int apoiar(){
        Random geraApoio = new Random();
        int apoio = geraApoio.nextInt(11);
        return apoio;
    }
    
    public int xingar(){
        Random geraXingamento = new Random();
        int xingar = geraXingamento.nextInt(11);
        return xingar;
    }
     
}
