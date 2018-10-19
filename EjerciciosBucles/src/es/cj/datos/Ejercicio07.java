package es.cj.datos;

import java.util.Scanner;

public class Ejercicio07 {

	// Pida un número al usuario e indique cuántos números primos hay entre 1 y el número
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int contador;
		int contadorDePrimos = 0;
		
		for (int i = 2; i < numero; i++) {
			contador = 0;
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				contadorDePrimos++;
				System.out.println(i);
			}
		}
		
		System.out.println("Hay " + contadorDePrimos + " numeros primos");
	}
}
