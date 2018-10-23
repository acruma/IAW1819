package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio03 {

	private static Scanner sc = new Scanner(System.in);
	
	// Leer tabla de n números y guardar en otra tabla los pares y en otra tabla los impares
	
	public static void main(String[] args) {
		
		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		int pares [] =  new int [cantidad];
		int impares [] =  new int [cantidad];
		
		int contP = 0;
		int contI = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				pares[contP] = numeros[i];
				contP +=1;
			}else if(numeros[i] % 2 == 1) {
				impares[contI] = numeros[i];
				contI +=1;
			}
		}
	
		for (int i = 0; i < contP; i++) {
			System.out.print(pares[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < contI; i++) {
			System.out.print(impares[i] + " ");
		}
	}

}
