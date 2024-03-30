package model;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        this.alteraPatas(0);
        this.alteraAmbiente("mar");
        this.alteraCor("cinzento");
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String pegaCaracteristica() {
        return caracteristica;
    }

    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}