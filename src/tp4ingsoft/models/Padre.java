/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4ingsoft.models;

/**
 *
 * @author Gabriel
 */

public class Padre {
    protected String nombre;
    protected String apellido;
    protected Casa casa; // Composicion
    protected Auto auto; // Agregacion

    // Constructor
    public Padre(Auto auto) {
        this.nombre = "Papá"; 
        this.apellido = "López"; 
        this.casa = construirCasa(); // Composicion
        this.auto = auto; // Agregacion
    }

    protected Casa construirCasa() {
        return new Casa("Centro",2);
    }

    protected void cantar() {
        System.out.println("Así canta tu padre, Don " + apellido);
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected Casa getCasa() {
        return casa;
    }

    protected Auto getAuto() {
        return auto;
    }
    
    public void mostrarCasa() {
        System.out.println("Papá me dejó esta casa en zona: " + casa.getZona());
    }
}

