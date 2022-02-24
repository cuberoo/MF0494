/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe aquí las sentencias del apartado 3
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tasa de alcoholemia");
		Float tasaAlcohol = entrada.nextFloat();
		
		Funciones.calculaSancion(tasaAlcohol);
		
		
		System.out.println("\n PEDIR PUNTOS:");
		int puntos[] = new int [6];
		Funciones.pedir_vector(puntos);
		
		System.out.println("\n PEDIR SANCIONES:");
		int sanciones[] = new int [6];
		Funciones.pedir_vector(sanciones);
		
		System.out.println("\n MOSTRAR VECTORES:");
		Funciones.mostrar_vector(puntos);
		System.out.println();
		Funciones.mostrar_vector(sanciones);
		
		System.out.println("\n REALIZAR RESTA Y MOSTRAR");
		Funciones.restaPuntos(puntos, sanciones);
		Funciones.mostrar_vector(puntos);
		
		
	}

}
