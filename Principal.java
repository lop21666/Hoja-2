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
		
		Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        Archivo archivo = new Archivo();
        ArrayList<String> filasLeidas = new ArrayList<String>();

        //menu para elegir el modo del radio
        while(opcion != 5){
            
            System.out.println("Que modo desea utilizar? \n");
            System.out.println("1. Radio \n"
                            + "2. Reproduccion \n"
                            + "3. Telefono \n"
                            + "4. Productividad \n"
                            + "5. Salir \n");
            opcion = teclado.nextInt();
            teclado.nextLine();


            filasLeidas = archivo.leerTxt();
            for (String fila : filasLeidas) {
                System.out.println(fila);
            }

            //Si la opcion es uno
            if(opcion == 1){

            //Si la opcion es 2
            }else if(opcion == 2){
                
            //Si la opcion es 3
            }else if(opcion == 3){
                
            //Si la respuesta 4
            }else if(opcion == 4){
                
            }else{
                System.out.println("Escoje una opcion del 1 al 5\n");
            }
    
        }
    }

}