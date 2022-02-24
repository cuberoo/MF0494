package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	
	public static void calculaSancion(float tasaAlcohol) {
		String sancion = "";
		if(tasaAlcohol < 0.25) {
			sancion = "sin sancion";
		} else if(tasaAlcohol >= 0.25 && tasaAlcohol < 0.50) {
			sancion = "500€ y perdida de 4 puntos del carnet";
		} else if(tasaAlcohol >= 0.50 && tasaAlcohol < 0.60) {
			sancion = "1000€ y perdida de 6 puntos del carnet";
		} else if(tasaAlcohol >= 0.60) {
			sancion = "retirada del carnet y de 3 a 6 mese de carcel";
		}
		System.out.printf("el conductor con tasa de alcoholemia "+ tasaAlcohol + " tiene la sancion " + sancion);
	}
	
	public static void restaPuntos(int[] puntos, int[] sanciones) {
		
		for (int i =0; i<puntos.length; i++) {
				puntos[i]-=sanciones[i];
				if(puntos[i]<0) {
					puntos[i]=0;
				} 
			}
	}

}
