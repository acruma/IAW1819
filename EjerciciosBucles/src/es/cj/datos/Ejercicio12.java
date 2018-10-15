package es.cj.datos;

import java.util.Scanner;

public class Ejercicio12 {

	// Dados dos números introducidos por teclado, indique si son amigos o no. 
	// Dos números son amigos si la suma de los divisores propios de uno de ellos es igual al otro 
	// (la unidad se considera divisor propio, pero no lo es el mismo número)

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("Nº 1: ");
		int numero1 = sc.nextInt();
		int divisor1 = 0;

		for (int i = 1; i < numero1; i++) {
			if(numero1 % i == 0) {
				divisor1 += i;
			}
		}
		
		if (divisor1 == numero1) {
			System.out.println("Es perfect");
		}else
			System.out.println("No es perfect");
	}
}