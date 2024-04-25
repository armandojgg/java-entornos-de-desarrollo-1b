package tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import modelos.Persona;

class TestPersona {
	// -1, 0, 17, 18, 65, 66, 130, 131
	
	
	@Test
	void comprobarEdadceroAños() {
		Persona p1 = new Persona("Armando", "García", 0);
		String esperado = "Es menor de edad";
		String obtenido = p1.mostrarEdad(p1);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void comprobarEdadDiecisieteAños() {
		Persona p2 = new Persona ("Pepe", "Gomez", 17);
		String esperado = "Es menor de edad";
		String obtenido = p2.mostrarEdad(p2);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void comprobarEdadDieciochoAños() {
		Persona p3 = new Persona ("Jesús", "Fernandez", 18);
		String esperado = "Es mayor de edad";
		String obtenido = p3.mostrarEdad(p3);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void comprobarEdadCuatro() {
		Persona p4 = new Persona ("Jesús", "Fernandez", 65);
		String esperado = "Está jubilado/a";
		String obtenido = p4.mostrarEdad(p4);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void comprobarEdadCinco() {
		Persona p5 = new Persona ("Jesús", "Fernandez", 66);
		String esperado = "Está jubilado/a";
		String obtenido = p5.mostrarEdad(p5);
		assertEquals(esperado, obtenido);
	}
	

}
