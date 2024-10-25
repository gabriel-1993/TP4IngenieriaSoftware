
package tp4ingsoft.models;

public class Casa {
    private String zona;
    private int pisos;

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Casa(String zona, int pisos) {
        this.zona = zona;
        this.pisos = pisos;
    }

  
    
    

 

}
