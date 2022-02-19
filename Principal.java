/**
 * Clase Principal
 * @author Carlos_Edgardo_López_Barrera
 * @version 1 15.11.2021
 *
 * La clase principal ejecuta el método main que se encarga de llamar a los demás
 * métodos de las demás clases y organizarlos mediante un menú.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	/**
     *
     */
	
	/**
     * Metodo main
     *
     * @param args: (String[])
     * @see System.out#println()
     * @see java.util.Scanner#Scanner()
     * @see java.util.Scanner#nextLine()
     * @see java.util.Scanner#nextInt()
     * 
     */

	public static void main(String[] args) {
		
        Archivo archivo = new Archivo();
        PosfixCalc posfixCalc = new PosfixCalc();
        ArrayList<String> filasLeidas = new ArrayList<String>();
        int contador  = 0;
        filasLeidas = archivo.leerTxt();
        for (String fila : filasLeidas) {
        
            int resultado = posfixCalc.Evaluate(fila.replace(" ",""));
            contador = contador + 1;
            System.out.println("El resultado de la expresion en la fila " + contador + " de su documento es: " + resultado);
            
        }

    }

}


