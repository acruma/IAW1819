package es.cj.semanales.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// (09/10/18) Se solicita leer un número entero positivo y determinar si es un número de 1,2,3 o 4 cifras.
	
	public static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numero : ");
		int numero = sc.nextInt();
		
		if (numero > 0 && numero < 10) {
			System.out.println("Numero de una cifra");
		}else if(numero >= 10 && numero < 100) {
				System.out.println("Numero de dos cifras");
		}else if(numero >= 100 && numero < 1000) {
				System.out.println("Numero de tres cifras");
		}else if(numero >= 1000 && numero < 10000) {
				System.out.println("Numero de cuatro cifras");
		}else if(numero > 9999) {
			System.out.println("Se va a mas de 4 cifras");
		}else
			System.out.println("Numero no es positivo");
	}

}
