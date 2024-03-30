package model;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        this.alteraAmbiente("terra");
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String pegaAlimento() {
        return alimento;
    }

    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}