
package tp4ingsoft.models;

import interfaces.Hermano;
import interfaces.Madre;
import interfaces.Tio;



public class Hijo extends Padre implements  Madre, Tio, Hermano {
    private String nombre; 
    private double billetera; 
    private Celular celular; 

    // Constructor
    public Hijo(String nombre,Celular celular, Auto auto) {
        super(auto); 
        this.nombre = nombre; 
        this.celular = celular; 
        this.billetera = 0.0; 
    }

    @Override
    public void cantar() {
        // Llama cantar del padre
         super.cantar();
        // Imprime el canto  del hijo
        System.out.println("Y así canta " + nombre);
    }

    public void conducirAuto(Auto auto,String msj) {
        System.out.println(msj + auto.getModelo() +" , "+auto.getPatente());
    }

//    bailar de la interfaz Madre
    @Override
    public void bailar() {
        System.out.println( "Se bailar como mi madre ♪ ♫ ♪");
    }

    
  
    
    // jugarLoteria de la interfaz Madre
    @Override
    public int jugarLoteria() {
        // Retorna un n aleatorio como ejemplo
        return (int) Madre.NROSUERTE;
    }
    
      //Salio numero de la suerte
    public void festeja() {
        int num = jugarLoteria();
        System.out.println("Salio el numero de la suerte "+ num );
        this.setBilletera(Madre.FORTUNA);
         //y dice: Heredaste la Fortuna de 50000.0 de tu madre la ROSA!! Y muestra la billetera
         System.out.println("Heredaste la Fortuna de 50000.0 de tu madre la ROSA!!. Billetera = "+this.getBilletera());
    }

    //  heredarDinero de la interfaz Tio
    @Override
    public void heredarDinero(double money) {
        this.billetera += money; // Aumenta la billetera con el dinero heredado
        System.out.println("Tio Lucas te regala estos dolaritos!. " + money );
    }

    // jugarFutbol de la interfaz Hermano este mensaje lo pide para esta funcion 
   @Override
    public void jugarFutbol() {
        System.out.println("Sé jugar fútbol gracias a mi hermano.");
    }
    

    // hacerGoles de la interfaz Hermano
    @Override
    public int hacerGoles() {
        int goles = (int) (Math.random() * 5); // Número aleatorio de goles
        return goles;
    }
    
      //12. El hijo muestra en consola: Jugando al Futbol, Hoy has hecho + invoca a hacerGoles() (del hermano)
    public void contarGolesHoy(){
        int goles = hacerGoles();
        System.out.println("Jugando al Futbol, Hoy has hecho "+ hacerGoles() + " goles :) " );
    }

    public String getNombre() {
        return nombre;
    }

    public double getBilletera() {
        return billetera;
    }
    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    public Celular getCelular() {
        return celular;
    }
    
     // Metodo para mostrar el auto
    public void mostrarAuto() {
        System.out.println("Papá me dejó este auto: " + getAuto().getModelo());
    }
}
