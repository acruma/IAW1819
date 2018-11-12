package es.cj.cadenas.datos;

import java.util.Scanner;

public class Ejercicio05 {
	
	// Dada una cadena y un código entero aleatorio. Generar una cadena cifrada donde cada carácter 
	// se sustituye por el carácter situado n posiciones después del mismo. Debe empezar por la letra A 
	// si la suma del carácter con el codigo es mayor que Z.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Cadena: ");
		String cadena = sc.next();
		System.out.println("Numero: ");
		int num = sc.nextInt();
		
		// -26 para pasar de Z a A .  Rango de 65 a 90
		
//		String cadena = "xyzXYZabcABC";
//		int num = 1;
		
		char[] letras = cadena.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] >= 65 && letras[i] <= 90) {
				letras[i] = (char) (letras[i] + num);
				if(letras[i] >= 91) {
					letras[i] = (char) (letras[i] - 26);
				}
			}
			if (letras[i] >= 97 && letras[i] <= 122) {
				letras[i] = (char) (letras[i] + num);
				if(letras[i] >= 123) {
					letras[i] = (char) (letras[i] - 26);
				}
			}
		}
		
		System.out.println(letras);

	}
}
