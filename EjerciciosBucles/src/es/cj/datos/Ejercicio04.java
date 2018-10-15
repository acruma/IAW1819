package es.cj.datos;

import java.util.Scanner;

public class Ejercicio04 {

	// Escribir un programa que lea un número desde el teclado y realice la suma de los 100 
	// números siguientes, mostrando el resultado en pantalla

	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int contador = 0;
		
		for (int i = numero; i < (numero + 100); i++) {
			contador += i;
		}
		
		System.out.println(contador);
		
	}
	
}
