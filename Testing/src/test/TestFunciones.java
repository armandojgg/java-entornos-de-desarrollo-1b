package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Funciones;

class TestFunciones {
	
	/**
	 * Comprueba que el sumatorio de 0 es 0
	 */
	
	@Test
	void testSumatorio0 () {
		int esperado = 0;
		int obtenido = Funciones.sumatorio(0);
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que el sumatorio de un número valido cualquiera es correcto
	 */
	
	@Test
	void testSumatorio3() {
		int esperado = 6;
		int obtenido = Funciones.sumatorio(3);
		assertEquals(esperado, obtenido);
	}
	
	/**
	 * Comprueba que el sumatorio de un número negativo lanza la excepción
	 * esperada
	 * 
	 */
	
	@Test
	void testSumatorioError () {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> Funciones.sumatorio(-1));
		
		String esperado = "El numero debe ser mayor o igual a 0";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
}
