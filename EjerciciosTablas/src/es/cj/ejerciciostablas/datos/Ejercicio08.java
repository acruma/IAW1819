package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	private static Scanner sc = new Scanner(System.in);
	
	// Cree una tabla de n elementos. Muestre la tabla ordenada
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
				numeros[i] = new Random().nextInt(10);
		}
		
		System.out.println("Sin ordenar");
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		System.out.println("Ordenados");
		System.out.println(Arrays.toString(numeros));
		
		
	}

}
