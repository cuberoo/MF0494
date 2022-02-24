package uf2181;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuncionesDGTTest {

	private static FuncionesDGT funciones;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funciones = new FuncionesDGT();
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void mediaPuntos() {
	int array[] = {1,2,3,4,5};
	int array2[] = {5,2,5,2,5};
	int array3 [] = new int [0];
	
	assertEquals(3.0, funciones.mediaPuntos(array));
	assertNotEquals(2.3, funciones.mediaPuntos(array));
	assertEquals(3.8, funciones.mediaPuntos(array2));
	assertNotEquals(2.1, funciones.mediaPuntos(array2));
	assertThrows(ArrayIndexOutOfBoundsException.class, ()-> funciones.mediaPuntos(array3));
	}



	@Test
	void tasaMaximaPermitida() {
	assertEquals(0.25, funciones.maximaTasaPermitida("General", true));
	assertNotEquals(0.25, funciones.maximaTasaPermitida("General", false));
	assertNotEquals(0.25, funciones.maximaTasaPermitida("Novel", true));

	assertEquals(0.5, funciones.maximaTasaPermitida("General", false));
	assertNotEquals(0.5, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.5, funciones.maximaTasaPermitida("General", true));

	assertEquals(0.15, funciones.maximaTasaPermitida("Novel", true));
	assertNotEquals(0.15, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.15, funciones.maximaTasaPermitida("General", true));

	assertEquals(0.3, funciones.maximaTasaPermitida("Novel", false));
	assertNotEquals(0.3, funciones.maximaTasaPermitida("Novel", true));
	assertNotEquals(0.3, funciones.maximaTasaPermitida("General", true));
	}

}
