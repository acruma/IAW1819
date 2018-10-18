package es.cj.datos;

import java.util.Scanner;

public class Ejercicio09 {

	private static Scanner sc = new Scanner(System.in);

	// Leer por teclado una serie de n números. 
	// La aplicación debe indicarnos si los números están ordenados de forma creciente, 
	// decreciente o si no están ordenados

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduzca exit para terminar de ingresar numeros.");
		
//		String numeroStr;
//		int numero1;
//		Integer numero2 = null;
//		boolean salida = true;
//		boolean creciente = false;
//		boolean creciente2 = true;
//		boolean decreciente = false;
//		boolean decreciente2 = true;
//		int contador = 1;
//		
//		do {
//			System.out.println("Nº " + contador + " : ");
//			numeroStr = sc.next();
//			
//			if (numeroStr.equalsIgnoreCase("exit")) {
//				salida = false;
//			}else {
//				numero1 = Integer.parseInt(numeroStr);
//				if(numero2 != null) {
//					if (numero1 > numero2 && creciente2) {
//						creciente = true;
//						decreciente2 = false;
//					}else if (numero1 < numero2 && decreciente2) {
//						decreciente = true;
//						creciente2 = false;
//					}else {
//						decreciente = false;
//						creciente = false;
//						decreciente2 = false;
//						creciente2 = false;
//					}
//				}
//				numero2 = numero1;
//			}
//			
//			contador++;
//			
//		} while (salida);
//		
//		if(creciente)
//			System.out.println("creciente");
//		else if(decreciente)
//			System.out.println("decreciente");
//		else
//			System.out.println("No Ordenados");
		
		String numeroStr;
		int numero1;
		Integer numero2 = null;
		boolean salida = true;
		boolean creciente = false;
		boolean decreciente = false;
		int contador = 1;
		
		do {
			System.out.println("Nº " + contador + " : ");
			numeroStr = sc.next();
			
			if (numeroStr.equalsIgnoreCase("exit")) {
				salida = false;
			}else {
				numero1 = Integer.parseInt(numeroStr);
				if(numero2 != null) {
					if (numero1 > numero2) {
						creciente = true;
					}else if(numero1 < numero2) {
						decreciente = true;
					}
					
				}
				numero2 = numero1;
			}
		}while (salida);
	
		if(creciente && decreciente) {
			System.out.println("No ordenados");
		}else if(decreciente && !creciente) {
			System.out.println("Decreciente");
		}else if(creciente && !decreciente) {
			System.out.println("Creciente");
		}
		
	}
}


