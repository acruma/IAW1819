package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio06Optimizado {
	
	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	// Eliminar el valor de esa posición y desplazar todos los elementos para no 
	// dejar el hueco vacío
		
	private static Scanner sc = new Scanner(System.in);
	
	private static int numeros [];
	
	public static void main(String[] args) {
		
		rellenarTabla();
		System.out.println(Arrays.toString(numeros));
		
		eliminarMover();
		
		mostrarTabla();

	}
	
	private static void mostrarTabla() {
		for (int i = 0; i < numeros.length - 1; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}

	private static void eliminarMover() {
		System.out.println("Posicion a eliminar: ");
		int datos = sc.nextInt();
		for (int i = datos; i < numeros.length - 1; i++) {
				numeros[i] = numeros[i+1];
			if (i == numeros.length - 1)
				numeros[i] = 0;			
		}
		
	}

	private static void rellenarTabla() {
		System.out.println("Numero de elementos: ");
		int datos = sc.nextInt();
		numeros = new int [datos];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10)+1;
		}
	}


}
