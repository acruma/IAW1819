package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer dos series de n n�meros. Almacenarlos en 2 tablas.
	// Ordena las tablas. Fusiona las 2 tablas en una tabla de 2*n elementos de 
	// forma que esta tabla est� ordenada.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Cantidad de N� : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		int numeros2 [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
				numeros[i] = new Random().nextInt(10);
				numeros2[i] = new Random().nextInt(10);
		}
		
		
		
		
	}

}
