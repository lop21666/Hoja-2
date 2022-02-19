import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitPostFixCalc {

	@Test
	void testEvaluate() {
		
		int valorEsperado = 15;
		String fila = "1 2 + 4 * 3 + ";
		fila = fila.replace(" ","");
		
		Stack<Integer> stack = new Stack<Integer>();
        int a = 0, b = 0;
        char caracteres[] = fila.toCharArray();
        for(char caracter: caracteres) {
            if(caracter >= '0' && caracter <= '9') {
                stack.push((int)(caracter - '0'));
            } else {
                a = stack.peek();
                stack.pull();
                b = stack.peek();
                stack.pull();
    
                if(caracter == '+'){
                    stack.push(a + b);
                }else if(caracter == '-'){
                    stack.push(a - b);
                }else if(caracter == '*'){
                    stack.push(a * b);
                }else if(caracter == '/'){
                    stack.push(a / b);
                }
            }
        }
    
        int resultado = stack.peek();
        stack.pull();
    
        assertEquals(valorEsperado, resultado, 0);
        
	}

}
