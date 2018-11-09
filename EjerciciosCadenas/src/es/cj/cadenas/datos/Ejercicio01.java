package es.cj.cadenas.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Muestra el string en Mayúsculas. Muestra el string en Minúsculas. 
	// Mostrar los 2 primeros caracteres y los 2 últimos. 
	// Número de veces que aparece el último carácter. 
	// Reemplazar todas las veces que se repite el primer carácter por el primer carácter en mayúscula. 
	// Añadir por el principio y por el final la cadena "***"

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Dame una cadena");
		String cadena = sc.next();
		
		System.out.println("Mayúsculas : " + cadena.toUpperCase());
		System.out.println("Minúsculas : " + cadena.toLowerCase());
		
		System.out.println("Primeros 2 carácteres : " + cadena.substring(0, 2));
		System.out.println("Últimos 2 carácteres : " + cadena.substring(cadena.length()-2, cadena.length()));
		
		String auxiliar;
		int contador = 0;
		
		auxiliar = cadena.substring(cadena.length()-1);
		
		System.out.println(auxiliar);
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.substring(i,i+1).equals(auxiliar)) {
				contador++;
			}
		}
		
		System.out.println("El último carácter aparece : " + contador);
			
		auxiliar = cadena.substring(0, 1);
		
		System.out.println("Reemplazo primer carácter a masyusculas : " + cadena.replace(auxiliar, auxiliar.toUpperCase() ));
		
		cadena = "***" + cadena;
				
		System.out.println(cadena.concat("***"));
		
	}

}
