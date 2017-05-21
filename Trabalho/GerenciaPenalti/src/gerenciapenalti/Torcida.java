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
public class Torcida {
    private int id;
    private String apelidoTime;
    private Torcedor[] torcedores = new Torcedor[101];
    
    public Torcida(int id, String apelidoTime) {
        this.id = id;
        this.apelidoTime = apelidoTime;
    }
    
    public int getId() {
        return id;
    }
    
    public int aplaudir(){
        int intensidadeAplaudir = 0;
        for (Torcedor torcedore : torcedores) {
            intensidadeAplaudir = intensidadeAplaudir + torcedore.apoiar();
        }
        intensidadeAplaudir = intensidadeAplaudir/torcedores.length;
        return intensidadeAplaudir;
    }
    
    public int vaiar(){
        int intensidadeVaiar = 0;
        for (Torcedor torcedore : torcedores) {
            intensidadeVaiar = intensidadeVaiar + torcedore.xingar();
        }
        intensidadeVaiar = intensidadeVaiar/torcedores.length;
        return intensidadeVaiar;
    }
    
    public String comemorar(){
        Random gera = new Random();
        String msg = "";
        switch(gera.nextInt(4)){
            case 0:
                msg = "O " + apelidoTime + " é o melhor!!!";
                break;
            case 1:
                msg = "Vai " + apelidoTime + " !!!";
                break;
            case 2:
                msg = "Vamos, " + apelidoTime + " !!!";
                break;
            case 3:
                msg = "Já é campeão!!! ";
                break;
        }
        return msg;
    }
    
    public String lamentar(){
        String msg = "Aaaaaaah......";
        return msg;
    }
    
    public void geraTorcedores(int i ){
        Torcedor torcedor;
        for(int j = 0; j <= i; j++){
            torcedor = new Torcedor(j);
            torcedores[j] = torcedor;
        }
    }
}
