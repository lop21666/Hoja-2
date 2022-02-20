/**
 * Clase Principal
 * @author Carlos_Edgardo_Lopez_Barrera
 * @version 1 19.02.2022
 *
 * La clase principal ejecuta el metodo main que se encarga de llamar a los demas
 * metodos necesarios para lograr obtener el resultado y presentarlo al usuario por
 * medio de la consola.
 * 
 */

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
     * @see Archivo#leerTxt()
     * @see PosfixCalc#Evaluate()
     * 
     */
	public static void main(String[] args) {
		
		//Instancia de la clase archivo para leer las expresiones.
        Archivo archivo = new Archivo();
        //Instancia de la clase PosfixCalc para evaluar la expresion.
        PosfixCalc posfixCalc = new PosfixCalc();
        ArrayList<String> filasLeidas = new ArrayList<String>();
        int contador  = 0;
        //Se obtiene una lista con todas las filas que contenia el archivo
        filasLeidas = archivo.leerTxt();
        //Si existe el archivo y tiene datos
        if(filasLeidas != null) {        	
        	for (String fila : filasLeidas) {
        		int resultado = posfixCalc.Evaluate(fila.replace(" ",""));
        		contador = contador + 1;
        		//Se imprime el resulatdo de la evaluacion.
        		System.out.println("El resultado de la expresion en la fila " + contador + " de su documento es: " + resultado);		
        	}
        }
    }

}


