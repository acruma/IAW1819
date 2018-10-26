package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer dos series de n números. Almacenarlos en 2 tablas.
	// Ordena las tablas. Fusiona las 2 tablas en una tabla de 2*n elementos de 
	// forma que esta tabla esté ordenada.
	
	// Las uno y entonces le hago sort ( no es lo que pide ) Sin comentarios :-D 
	
	private static Scanner sc = new Scanner(System.in);
	private static int numeros [];
	private static int numeros2 [];
	private static int fusionada [];
	
	public static void main(String[] args) {
		
		inicializar();
		
		ordenar();
		
		fusion();
		
		ordenar();;
		
		mostrar();
	
	}

	

	private static void mostrar() {
		System.out.println(Arrays.toString(fusionada));		
	}

	private static void fusion() {
		
		
	}
	
	/*private static void fusion() {
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
				fusionada[i] = numeros[i];
		}
		for (int i = numeros.length; i < fusionada.length; i++) {
			fusionada[i] = numeros2[contador];
			contador++;
		}}
	*/
	
	

	private static void inicializar() {
		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		numeros = new int [cantidad];
		numeros2 = new int [cantidad];
		fusionada = new int [(cantidad*2)];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
			numeros2[i] = new Random().nextInt(10);
		}	
	}

	private static void ordenar() {
		Arrays.sort(numeros);
		Arrays.sort(numeros2);
		// Arrays.sort(fusionada);
	}

}
