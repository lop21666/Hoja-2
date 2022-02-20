/**
 * Clase PostFixCalc
 * @author Carlos_Edgardo_López_Barrera
 * @version 1.0 19/02/2022
 *
 * Esta clase que implemente la interfaz "IPosfixCalc", define las operaciones
 * a realizar para evaluar la expresion y retornar el resultado de cada una de
 * dichas expresiones proporcionadas.
 * 
 */

public class PosfixCalc implements IPosfixCalc {
	/**
    *
    */
	
	/**
     * Metodo Evaluate: sirve para evaluar la expresión proporcionada y devolver el resultado obtenido.
     * Pre: recive una cadena de texto, el cual es la expresión en notación polaca inversa a evaluar.
     * Post: devuelve un entero, que es el resultado obtenido de el haber evaluado la expresion.
     * 
     * @param fila: (String)
     * @return resultado: (int)
     * 
     */
	@Override
	public int Evaluate(String fila) {
        Stack<Integer> stack = new Stack<Integer>();
        int a = 0, b = 0;
        //El string proporcionado se convierte en una arreglo de caracteres.
        char caracteres[] = fila.toCharArray();
        //Por cada caracter en el arreglo de caracteres
        for(char caracter: caracteres) {
        	//Si es un numero se guarda en la pila
            if(caracter >= '0' && caracter <= '9') {
                stack.push((int)(caracter - '0'));
            //Si no es un numero se evalua la expresion en a pila y se inserta el resultado
            } else {
                a = stack.peek();
                stack.pull();
                b = stack.peek();
                stack.pull();
                //Dependiendo del caracter se hace una operacion diferente
                if(caracter == '+'){
                    stack.push(a + b);
                }else if(caracter == '-'){
                    stack.push(a - b);
                }else if(caracter == '*'){
                    stack.push(a * b);
                }else if(caracter == '/'){
                	if(b == 0) {
                		System.out.println("En la expresion hay una división por 0, es un error matematico, con lo cual su resultado es 0, como se meustra abajo.");
                    	return 0;
                	}else {                		
                		stack.push(a / b);
                	}
                }else {
                	System.out.println("En la expresion hay caracteres no aceptados: '" + caracter + "' , por lo tanto el resultado es 0, como se muestra abajo.");
                	return 0;
                }
            }
        }
    
        int resultado = stack.peek();
        stack.pull();
    
        return resultado;
    }

}
