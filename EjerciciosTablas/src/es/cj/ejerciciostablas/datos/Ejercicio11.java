package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Tabla de n elementos. Escriba un programa que calcule cuántos números distintos hay en la tabla
	
	private static int contador = 0;
	
	private static int numeros [];
	
	public static void main(String[] args) {
		rellenarTabla();
		System.out.println(Arrays.toString(numeros));
		
		busquedaContar();
		System.out.println(contador);
	}

	private static void busquedaContar() {
		boolean encontrado;
		for (int i = 0; i < numeros.length; i++) {
			encontrado = false;
			for (int j = i+1; j < numeros.length; j++) {
				if(numeros[i] == numeros[j]) {
					encontrado = true;
				}
			}
			if(!encontrado) {
				contador++;
			}
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
