package es.cj.datos;

import java.util.Scanner;

public class Ejercicio06 {

	// Dise�e una aplicaci�n que muestre las tablas de multiplicar del 1 al 10. 
	// Adem�s, solicite al usuario que tabla quiere mostrar

	
		private static Scanner sc = new Scanner(System.in);

			public static void main(String[] args) {
				
				int numero;
				
				
				for (int i = 1; i <= 10; i++) {
					for (int j = 1; j <= 10; j++) {
						System.out.println(i + " x " + j + " = " + (i*j));
					}
				}
				
				System.out.println("Tabla: ");
				numero = sc.nextInt();
				
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + (numero*i));
				}
				
			}
	}