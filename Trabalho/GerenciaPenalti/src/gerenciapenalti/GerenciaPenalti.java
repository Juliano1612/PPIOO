/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciapenalti;

import apresentacao.JFrameInicial;
import java.util.Random;

/**
 *
 * @author Juliano
 */
public class GerenciaPenalti {
    //tamanho da torcida
    private static int i = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicia primeira tela
        JFrameInicial jFrameInicial = new JFrameInicial();
        jFrameInicial.setLocationRelativeTo(null);
        jFrameInicial.setVisible(true);    
        
    }
    public static Jogador[] inicializaObjetosCorinthians(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();

        //Criar Torcida
        Torcida torcidaCorinthians = new Torcida(1, "Timão");
        
        //gerando Torcedores da Torcida criada
        torcidaCorinthians.geraTorcedores(i);
        
        //Criando Time
        Time corinthians = new Time("Corinthians", torcidaCorinthians);
              
        //Criando Perfis Corinthians
        Perfil perfilCassio = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilFagner = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilFelipe = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilYago = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilUendel = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilBrunoHenrique = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilElias = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilRodriguinho = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilRomero = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMalcom = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilDanilo = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Corinthians
        Goleiro cassio = new Goleiro(1, "Cassio", corinthians, perfilCassio);
        Batedor fagner = new Batedor(2, "Fagner", corinthians, perfilFagner);
        Batedor felipe = new Batedor(3, "Felipe", corinthians, perfilFelipe);
        Batedor yago = new Batedor(4, "Yago", corinthians, perfilYago);
        Batedor uendel = new Batedor(5, "Uendel", corinthians, perfilUendel);
        Batedor brunoHenrique = new Batedor(6, "Bruno H.", corinthians, perfilBrunoHenrique);
        Batedor elias = new Batedor(7, "Elias", corinthians, perfilElias);
        Batedor rodriguinho = new Batedor(8, "Rodriguinho", corinthians, perfilRodriguinho);
        Batedor romero = new Batedor(9, "Romero", corinthians, perfilRomero);
        Batedor malcom = new Batedor(10, "Malcom", corinthians, perfilMalcom);
        Batedor danilo = new Batedor(11, "Danilo", corinthians, perfilDanilo);
        
        //Atribuindo jogadores ao vetor
        jogadores[0] = cassio;
        jogadores[1] = fagner;
        jogadores[2] = felipe;
        jogadores[3] = yago;
        jogadores[4] = uendel;
        jogadores[5] = brunoHenrique;
        jogadores[6] = elias;
        jogadores[7] = rodriguinho;
        jogadores[8] = romero;
        jogadores[9] = malcom;
        jogadores[10] = danilo;

        return jogadores;  
       }
    
    public static Jogador[] inicializaObjetosCruzeiro(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();

        //Criar Torcida
        Torcida torcidaCruzeiro = new Torcida(2, "Cruzeirão");
        
        //gerando Torcedores da Torcida criada
        torcidaCruzeiro.geraTorcedores(i);
        
        //Criando Time
        Time cruzeiro = new Time("Cruzeiro", torcidaCruzeiro);
              
        //Criando Perfis Cruzeiro
        Perfil perfilFabio = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilDede = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilWilliam = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilLeandro = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilGiorgian = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilAlisson = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMario = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJulio = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMaike = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilWillians = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarcos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Cruzeiro
        Goleiro fabio = new Goleiro(1, "Fabio D.", cruzeiro, perfilFabio);
        Batedor dede = new Batedor(2, "Dedé", cruzeiro, perfilDede);
        Batedor william = new Batedor(3, "William", cruzeiro, perfilWilliam);
        Batedor leandro = new Batedor(4, "Leandro", cruzeiro, perfilLeandro);
        Batedor giorgian = new Batedor(5, "Giorgian", cruzeiro, perfilGiorgian);
        Batedor alisson = new Batedor(6, "Alisson", cruzeiro, perfilAlisson);
        Batedor mario = new Batedor(7, "Mário", cruzeiro, perfilMario);
        Batedor julio = new Batedor(8, "Júlio", cruzeiro, perfilJulio);
        Batedor maike = new Batedor(9, "Maike", cruzeiro, perfilMaike);
        Batedor willians = new Batedor(10, "Willians", cruzeiro, perfilWillians);
        Batedor marcos = new Batedor(11, "Marcos", cruzeiro, perfilMarcos);

        //Atribuindo jogadores ao vetor
        jogadores[0] = fabio;
        jogadores[1] = dede;
        jogadores[2] = william;
        jogadores[3] = leandro;
        jogadores[4] = giorgian;
        jogadores[5] = alisson;
        jogadores[6] = mario;
        jogadores[7] = julio;
        jogadores[8] = maike;
        jogadores[9] = willians;
        jogadores[10] = marcos;
 
        return jogadores;
    }
    
    public static Jogador[] inicializaObjetosSantos(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();

        //Criar Torcida
        Torcida torcidaSantos = new Torcida(3, "Peixe");

        //gerando Torcedores da Torcida criada
        torcidaSantos.geraTorcedores(i);
        
        //Criando Time
        Time santos = new Time("Santos", torcidaSantos);
        
        //Criando Perfis Santos
        Perfil perfilVanderlei = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilLucas = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilRicardo = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilGeuvanio = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarquinhos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJose = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilThiago = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilGustavo = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilNilson = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilFrancisco = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilRenato = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Santos
        Goleiro vanderlei = new Goleiro(1, "Vanderlei", santos, perfilVanderlei);
        Batedor lucas = new Batedor(2, "Lucas", santos, perfilLucas);
        Batedor ricardo = new Batedor(3, "Ricardo", santos, perfilRicardo);
        Batedor geuvanio = new Batedor(4, "Geuvânio", santos, perfilGeuvanio);
        Batedor marquinhos = new Batedor(5, "Marquinhos", santos, perfilMarquinhos);
        Batedor jose = new Batedor(6, "José", santos, perfilJose);
        Batedor thiago = new Batedor(7, "Thiago", santos, perfilThiago);
        Batedor gustavo = new Batedor(8, "Gustavo", santos, perfilGustavo);
        Batedor nilson = new Batedor(9, "Nilson", santos, perfilNilson);
        Batedor francisco = new Batedor(10, "Francisco", santos, perfilFrancisco);
        Batedor renato = new Batedor(11, "Renato", santos, perfilRenato);
        
        //Atribuindo jogadores ao vetor
        jogadores[0] = vanderlei;
        jogadores[1] = lucas;
        jogadores[2] = ricardo;
        jogadores[3] = geuvanio;
        jogadores[4] = marquinhos;
        jogadores[5] = jose;
        jogadores[6] = thiago;
        jogadores[7] = gustavo;
        jogadores[8] = nilson;
        jogadores[9] = francisco;
        jogadores[10] = renato;
 
        return jogadores;
    }
    
    public static Jogador[] inicializaObjetosAtleticoMineiro(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();
        
        //Criar Torcida
        Torcida torcidaAtleticoMineiro = new Torcida(4, "Galo");
        
        //gerando Torcedores da Torcida criada
        torcidaAtleticoMineiro.geraTorcedores(i);
        
        //Criando Time
        Time atleticoMineiro = new Time("Atlético Mineiro", torcidaAtleticoMineiro);
          
        //Criando Perfis Atlético Mineiro
        Perfil perfilVictor = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilLucas = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilLuan = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJesus = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJemerson = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilDouglas = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilSherman = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJosue = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarcos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilEdcarlos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilLeonardo = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Atletico Mineiro
        Goleiro victor = new Goleiro(1, "Victor", atleticoMineiro, perfilVictor);
        Batedor lucas = new Batedor(2, "Lucas", atleticoMineiro, perfilLucas);
        Batedor luan = new Batedor(3, "Luan", atleticoMineiro, perfilLuan);
        Batedor jesus = new Batedor(4, "Jesús", atleticoMineiro, perfilJesus);
        Batedor jemerson = new Batedor(5, "Jemerson", atleticoMineiro, perfilJemerson);
        Batedor douglas = new Batedor(6, "Douglas", atleticoMineiro, perfilDouglas);
        Batedor sherman = new Batedor(7, "Sherman", atleticoMineiro, perfilSherman);
        Batedor josue = new Batedor(8, "Josué", atleticoMineiro, perfilJosue);
        Batedor marcos = new Batedor(9, "Marcos", atleticoMineiro, perfilMarcos);
        Batedor edcarlos = new Batedor(10, "Edcarlos", atleticoMineiro, perfilEdcarlos);
        Batedor leonardo = new Batedor(11, "Leonardo", atleticoMineiro, perfilLeonardo);
      
        //Atribuindo jogadores ao vetor
        jogadores[0] = victor;
        jogadores[1] = lucas;
        jogadores[2] = luan;
        jogadores[3] = jesus;
        jogadores[4] = jemerson;
        jogadores[5] = douglas;
        jogadores[6] = sherman;
        jogadores[7] = josue;
        jogadores[8] = marcos;
        jogadores[9] = edcarlos;
        jogadores[10] = leonardo;
 
        return jogadores;
    }
    
    public static Jogador[] inicializaObjetosFlamengo(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();
        
        //Criar Torcida
        Torcida torcidaFlamengo = new Torcida(5, "Mengão");
        
        //gerando Torcedores da Torcida criada
        torcidaFlamengo.geraTorcedores(i);
        
        //Criando Time
        Time flamengo = new Time("Flamengo", torcidaFlamengo);
              
        //Criando Perfis Flamengo
        Perfil perfilPauloVictor = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilPaolo = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilEverton = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilEmerson = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilWilliam = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilPauloLuiz = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilJuan = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarcos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilAlan = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilEderson = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilFederico = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Flamengo
        Goleiro pauloVictor = new Goleiro(1, "Paulo Victor", flamengo, perfilPauloVictor);
        Batedor paolo = new Batedor(2, "Paolo", flamengo, perfilPaolo);
        Batedor everton = new Batedor(3, "Everton", flamengo, perfilEverton);
        Batedor emerson = new Batedor(4, "Emerson", flamengo, perfilEmerson);
        Batedor william = new Batedor(5, "William", flamengo, perfilWilliam);
        Batedor pauloLuiz = new Batedor(6, "Paulo Luíz", flamengo, perfilPauloLuiz);
        Batedor juan = new Batedor(7, "Juan", flamengo, perfilJuan);
        Batedor marcos = new Batedor(8, "Marcos", flamengo, perfilMarcos);
        Batedor alan = new Batedor(9, "Alan", flamengo, perfilAlan);
        Batedor ederson = new Batedor(10, "Ederson", flamengo, perfilEderson);
        Batedor federico = new Batedor(11, "Federico", flamengo, perfilFederico);
                
        //Atribuindo jogadores ao vetor
        jogadores[0] = pauloVictor;
        jogadores[1] = paolo;
        jogadores[2] = everton;
        jogadores[3] = emerson;
        jogadores[4] = william;
        jogadores[5] = pauloLuiz;
        jogadores[6] = juan;
        jogadores[7] = marcos;
        jogadores[8] = alan;
        jogadores[9] = ederson;
        jogadores[10] = federico;
 
        return jogadores;
    }
    
    public static Jogador[] inicializaObjetosFluminense(){
        Jogador[] jogadores = new Jogador[11];
        
        //Iniciando Random para sortear qualidade e confiança dos perfis
        Random gerador = new Random();
                
        //Criar Torcida
        Torcida torcidaFluminense = new Torcida(6, "Tricolor");
        
         //gerando Torcedores da Torcida criada
        torcidaFluminense.geraTorcedores(i);
        
        //Criando Time
        Time fluminense = new Time("Fluminense", torcidaFluminense);
                          
        //Criando Perfis Fluminense
        Perfil perfilKlever = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilFred = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilGum = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilDiegoSouza = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilCicero = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarlon = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilCarlos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilRobert = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilMarcos = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilDiegoCavalieri = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        Perfil perfilAntonio = new Perfil(gerador.nextInt(11), gerador.nextInt(11));
        
        //Criando Jogadores Fluminense
        Goleiro klever = new Goleiro(1, "Kléver", fluminense, perfilKlever);
        Batedor fred = new Batedor(2, "Fred", fluminense, perfilFred);
        Batedor gum = new Batedor(3, "Gum", fluminense, perfilGum);
        Batedor diegoSouza = new Batedor(4, "Diego Souza", fluminense, perfilDiegoSouza);
        Batedor cicero = new Batedor(5, "Cícero", fluminense, perfilCicero);
        Batedor marlon = new Batedor(6, "Marlon", fluminense, perfilMarlon);
        Batedor carlos = new Batedor(7, "Carlos", fluminense, perfilCarlos);
        Batedor robert = new Batedor(8, "Robert", fluminense, perfilRobert);
        Batedor marcos = new Batedor(9, "Marcos", fluminense, perfilMarcos);
        Batedor diegoCavalieri = new Batedor(10, "Diego Cavalieri", fluminense, perfilDiegoCavalieri);
        Batedor antonio = new Batedor(11, "Antônio", fluminense, perfilAntonio);

        //Atribuindo jogadores ao vetor
        jogadores[0] = klever;
        jogadores[1] = fred;
        jogadores[2] = gum;
        jogadores[3] = diegoSouza;
        jogadores[4] = cicero;
        jogadores[5] = marlon;
        jogadores[6] = carlos;
        jogadores[7] = robert;
        jogadores[8] = marcos;
        jogadores[9] = diegoCavalieri;
        jogadores[10] = antonio;
        
        return jogadores;
    }
}
