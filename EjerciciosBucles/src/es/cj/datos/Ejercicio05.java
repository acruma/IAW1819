package es.cj.datos;

import java.util.Scanner;

public class Ejercicio05 {

	// Pedir un número y calcular su factorial
	
	private static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
		
			System.out.println("Nº: ");
			int numero = sc.nextInt();
			int factorial = 1;
			
			for (int i = numero; i > 0; i--) {
				
				factorial = factorial * i;
				
			}
		
			System.out.println(factorial);
			
		}
}