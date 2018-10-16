package es.cj.datos;

import java.util.Scanner;

public class Ejercicio11 {

	private static Scanner sc = new Scanner(System.in);

	// Solicite un número y muestre el cuadrado del número. 
	// El cuadrado de un número se obtiene de sumar tantos números impares como indique el número. 
	// El cuadrado de 1 es 1. El cuadrado de 2 es 4, es decir, 1 + 3. 
	// El cuadrado de 3 es 9, es decir, 1 + 3 + 5
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		int contadorImpar = 0;
		int suma = 0;
		int contador = 0;
		
		while (contadorImpar < numero) {
			
			contador++;
			
			if (contador%2 != 0) {
				contadorImpar++;
				suma = suma + contador;
			}
		}
		System.out.println(suma);
	}
}
