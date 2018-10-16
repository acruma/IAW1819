package es.cj.datos;

import java.util.Scanner;

public class Ejercicio01 {
	
	// Debe solicitar un número positivo al usuario. 
	// Muestre todos los números desde el solicitado hasta el 0 
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		
			System.out.println("Nº: ");
			numero = sc.nextInt();
		
			while (numero >= 0) {
				System.out.println(numero);
				numero--;
			}
		
		
		sc.close();
	}

}
