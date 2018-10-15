package es.cj.datos;

import java.util.Scanner;

public class Ejercicio03 {

	// Programa que muestre y calcule el producto de los n primeros números impares
	
	private static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int contadorImpar = 0;
		int producto = 1;
		int contador = 0;
		
		do {
			contador++;
			
			if (contador%2 != 0) {
				contadorImpar++;
				producto = producto * contador;
			}
						
		} while (contadorImpar < numero);
		
		System.out.println(producto);
		
	}
	
}
