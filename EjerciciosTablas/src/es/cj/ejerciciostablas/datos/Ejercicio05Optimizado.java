package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05Optimizado {

	private static Scanner sc = new Scanner(System.in);
	
	private static int numeros[];
	
	// Crear una tabla de n n�meros y desplazarla una posici�n hacia abajo, es decir, 
	// el primero pasa a ser el segundo, 
	// el segundo pasa a ser el tercero y as� sucesivamente. El �ltimo pasa a ser el primero
	
	public static void main(String[] args) {
		
		int cantidad;
		
		do {
			System.out.print("Cantidad de N� : ");
			cantidad = sc.nextInt();
		}while( cantidad<=0 );
		
		inicializar();
		
		mostrar();
		
		desplazar();
		
		mostrar();
	
	}

	private static void desplazar() {
		int aux = numeros(numeros.length - 1);
	}

	private static void mostrar() {
		System.out.println(Arrays.toString(numeros));		
	}

	private static void inicializar() {
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
	}

}
