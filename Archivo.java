/**
 * Clase Archivo
 * @author Carlos_Edgardo_López_Barrera
 * @version 1.0 19/02/2022
 *
 * Esta clase tiene la principal funcion de leer el archivo proporcionado con las expresiones y devolver un arreglo
 * con la cadena de texto encontrada en cada fila de dicho archivo en una distinta posicion a la anterior del arreglo.
 * 
 */

import java.util.*;
import java.io.*;

public class Archivo {
	/**
    *
    */
	
	/**
     * Constructor sin parametros
     */
    public Archivo(){}

    /**
     * Metodo leerTxt: sirve para leer el archivo y almacenar lo encontrado en un ArrayList de Strings.
     * 
     * @see System.out#println()
     * @see java.io.File()
     * @see java.io.FileReader()
     * @see java.io.BufferedReader()
     * @see java.util.ArrayList()
     */
    public ArrayList<String> leerTxt(){

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
        	//Nombre del archivo que se lee para obtener todas las expresiones proporcionadas
            archivo = new File ("D:\\Datos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            ArrayList<String> filas = new ArrayList<String>();
            String linea;
            while((linea=br.readLine())!=null){
                filas.add(linea);
            }
            return filas;
            
        }catch(Exception e){
        	System.out.println("La ruta del archivo proporcionada no existe, por favor cambiarla dentro de la clase 'Archivo.java'");
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if( null != fr ){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        return null;
    }
}