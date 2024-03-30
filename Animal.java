package model;

public class Animal {
    private String nome;
    private int comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal() {
        this.numPatas = 4; // Padrão para animais terrestres
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public String pegaNome() {
        return nome;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int pegaComprimento() {
        return comprimento;
    }

    public void alteraPatas(int patas) {
        this.numPatas = patas;
    }

    public int pegaPatas() {
        return numPatas;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public String pegaCor() {
        return cor;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String pegaAmbiente() {
        return ambiente;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float pegaVelocidade() {
        return velocidade;
    }

    public void dados() {
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }
}