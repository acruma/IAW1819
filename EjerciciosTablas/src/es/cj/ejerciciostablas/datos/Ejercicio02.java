package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	private static Scanner sc = new Scanner(System.in);
	
	//Leer n números ordenados crecientemente. Pedir al usuario un número y buscarlo en la tabla..
	//Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con un mensaje
	
	public static void main(String[] args) {
		
		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numero a buscar : ");
		int busca = sc.nextInt();
		
		int encontrado = Arrays.binarySearch(numeros, busca);
		
		if (encontrado>0)
			System.out.println("El numero " + busca +" se encuentra en la posición: " + encontrado);
		else if (encontrado<0)
			System.out.println("No encontrado");
		
	}

}
