package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class Ejercicio01 {

	public static Scanner sc = new Scanner(System.in);
	
	// Pedir una nota de 0 a 10 y mostrarla como insuficiente, suficiente, bien
	// notable y sobresaliente
	
	public static void main(String[] args) {
		
		System.out.println("Dame un numero");
		double num = sc.nextDouble();
		
		if (num >= 0 && num < 5)
			System.out.println("Insuficiente");
		else if (num >= 5 && num < 6)
			System.out.println("Suficiente");
		else if (num >= 6 && num < 7)
			System.out.println("Bien");
		else if (num >= 7 && num < 9)
			System.out.println("Notable");
		else if (num >= 9 && num <= 10)
			System.out.println("Sobresaliente");
		else 
			System.out.println("Numero incorrecto.");
	
	
	
		switch ((int)num) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Numero incorrecto.");
			break;
		}
	
	}	
}
