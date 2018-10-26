package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio05Optimizado {

	private static Scanner sc = new Scanner(System.in);
	private static int[] numeros;
	
	// Crear una tabla de n números y desplazarla una posición hacia abajo, es decir, 
	// el primero pasa a ser el segundo, 
	// el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero
	
	public static void main(String[] args) {
		
		int tamanyo;

		do {
			System.out.print("Cantidad de Nº : ");
			tamanyo = sc.nextInt();
		} while (tamanyo <= 0);
		
		numeros = new int [tamanyo];
		
		iniciar();
		
		mostrar();
		
		desplazar();
		
		mostrar();
		
	}

	private static void desplazar() {
		// TODO Auto-generated method stub
		int aux = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = aux;
	}

	private static void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(numeros));
	}

	private static void iniciar() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(50) + 1;
		}
	}

}