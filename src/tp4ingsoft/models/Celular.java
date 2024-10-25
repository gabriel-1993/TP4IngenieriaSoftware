
package tp4ingsoft.models;


public class Celular {
    
    private String compania;
    
    private String numero;
    
    private double saldo;

    public Celular(String compania, String numero, double saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
