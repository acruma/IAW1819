package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	// Diseñe una aplicación que muestre las tablas de multiplicar del 1 al 10. 
	// Además, solicite al usuario que tabla quiere mostrar

	
		private static Scanner sc = new Scanner(System.in);

			public static void main(String[] args) {
				
				int numero;
		
				System.out.println("Tabla: ");
				numero = sc.nextInt();
				
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero * i);
				}
				
			}
	}