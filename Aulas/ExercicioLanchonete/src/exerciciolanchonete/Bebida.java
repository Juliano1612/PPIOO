package exerciciolanchonete;

public enum Bebida {
    REFRIGERANTE("Refrigerante", 2.0, 1.50),
    SUCO("Suco", 2.0, 2.0),
    AGUA("Agua", 1.0, 1.0);

    private final String nome;
    private final double precoDeCusto;
    private final double precoDeLucro;

    private Bebida(String nome, double precoDeCusto, double precoDeLucro) {
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
