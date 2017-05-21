package exerciciolanchonete;

public enum Comida {
    HOTDOG("HotDog", 3.0, 3.0),
    HAMBURGUER("Hamburger", 4.0, 3.5),
    BATATA("Batata Frita", 2.0, 2.5);
    
    private final String nome;
    private final double precoDeCusto;
    private final double precoDeLucro;

    private Comida(String nome, double precoDeCusto, double precoDeLucro) {
        this.nome = nome;
        this.precoDeCusto = precoDeCusto;
        this.precoDeLucro = precoDeLucro;
    }
        
    public double getPrecoFinal(){
        return this.precoDeCusto + this.precoDeLucro;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
