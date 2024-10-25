package tp4ingsoft.models;

public class Auto {
    private String patente;
    private String modelo;
    private double combustible;

    public Auto(String patente, String modelo, double combustible) {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCombustible() {
        return combustible;
    }
}
