package tp4ingsoft;
import tp4ingsoft.models.Auto;
import tp4ingsoft.models.Celular;
import tp4ingsoft.models.Hijo;
import tp4ingsoft.models.Padre;
/**
 *
 * @author Gabriel
 */
public class TP4IngSoft {
    public static void main(String[] args) {

        // 1. Crear un objeto Auto de nombre cascajo "123LATA ,"Renault 12". Luego otro: (Ford Focus, patente 999POWR). Crear un Celular. Crear objetos Auto
        Auto cascajo = new Auto("123LATA", "Renault 12",10);
        Auto fordFocus = new Auto("999POWR", "Ford Focus GRIS",10);
        // Crear un objeto Celular
        Celular celularr = new Celular("Movistar", "123456789", 100.0); 
        //2. Crear un objeto de la clase Padre, invocando su constructor
        Padre padre = new Padre(fordFocus);
        //3. El padre muestra en consola: Papá me dejo esta casa en zona, y muestra la Zona (desde el padre)
        padre.mostrarCasa();
        //4. Crear un objeto, invocando al constructor de clase Hijo, con Juan Carlos, el celular, y el auto cascajo.
        Hijo juanCarlos = new Hijo("Juan Carlos", celularr, cascajo);
        //5. El hijo muestra en consola: Papá me dejó este auto: y muestra el modelo del auto (desde el hijo h.getAuto.getModelo…)
        juanCarlos.mostrarAuto();
        //6. El hijo ejecuta conducirAuto(auto), muestra “conduciendo un auto de un amigo” (Ford Focus, patente 999POWR). Este es un método
        //propio con Dependencia hacia Auto, es otro auto del amigo. Auto ya creado desde el main.
        juanCarlos.conducirAuto(fordFocus, "conduciendo un auto de un amigo ");
        //7. El hijo ejecuta jugarFutbol() y muestra “Se jugar futbol gracias a mi hermano” (del hermano)
        juanCarlos.jugarFutbol();
        //8. El hijo ejecuta el método implementado de la mama bailar(), y muestra "Se bailar como mi madre ♪ ♫ ♪”
        juanCarlos.bailar();
        //9 El hijo muestra en consola "SALIO EL NUMERO DE LA SUERTE ", e invoca int jugarLoteria() retorna NROSUERTE de mamá. Además,
        //este método suma a la billetera de JuanCa, la constante FORTUNA de mamá, y dice: Heredaste la Fortuna de 50000.0 de tu madre la
        //ROSA!! Y muestra la billetera.
        juanCarlos.festeja();
        //10. El hijo ejecuta su propio método cantar(), @override que invoca a cantar() de papa (super.cantar) y ejecuta un print con mensaje “Asi
        //canta tu padre, Don (apellido)”. Y luego un println “así canta JuanCarlos” (de su cantar)
        juanCarlos.cantar();
        //11. El hijo ejecuta heredarDinero(coloca un numero en dólares ej. 2000), que suma a la billetera el dinero recibido, y muestra: Tio Lucas te
        //regala estos dolaritos!.
        juanCarlos.heredarDinero(1000);
        //12. El hijo muestra en consola: Jugando al Futbol, Hoy has hecho + invoca a hacerGoles() (del hermano)
        juanCarlos.contarGolesHoy(); 
    }
}
