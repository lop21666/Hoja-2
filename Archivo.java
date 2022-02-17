import java.util.*;
import java.io.*;

public class Archivo {

    public Archivo(){}

    public ArrayList<String> leerTxt(){

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
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
            e.printStackTrace();
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