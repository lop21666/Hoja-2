import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JUnitStack {

	ArrayList<Integer> lista = new ArrayList<>();

	@Test
	void testPush() {
		int valorEsperado = 20;
		lista.add(0, valorEsperado);
		
		assertEquals(valorEsperado, lista.get(0), 0);
	}

	@Test
	void testPull() {
		String valorEsperado = "Vacío";
		String valorRetornado = "";
		lista.add(0, 20);		
		lista.clear();
		if(lista.isEmpty()) {
			valorRetornado = "Vacío";
		}else {
			valorRetornado = "No vácio";
		}
		
		assertEquals(valorEsperado, valorRetornado, "");
	}

	@Test
	void testPeek() {
		int valorEsperado = 10;
		lista.add(0, 10);
		int valorRetornado = lista.get(0);
		
		assertEquals(valorEsperado, valorRetornado, 0);
	}

	@Test
	void testCount() {
		int valorEsperado = 5;
		lista.add(10);
		lista.add(11);
		lista.add(12);
		lista.add(13);
		lista.add(14);
		
		int valorRetornado = lista.size();
		
		assertEquals(valorEsperado, valorRetornado, 0);
	}

	@Test
	void testIsEmpty() {
		String valorEsperado = "No vacío";
		String valorRetornado = "";
		lista.add(0, 20);	
		if(lista.isEmpty()) {
			valorRetornado = "Vacío";
		}else {
			valorRetornado = "No vacío";
		}
		
		assertEquals(valorEsperado, valorRetornado, "");
	}

}
