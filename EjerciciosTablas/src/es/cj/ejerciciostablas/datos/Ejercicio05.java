package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	private static Scanner sc = new Scanner(System.in);
	
	// Crear una tabla de n números y desplazarla una posición hacia abajo, es decir, 
	// el primero pasa a ser el segundo, 
	// el segundo pasa a ser el tercero y así sucesivamente. El último pasa a ser el primero
	
	public static void main(String[] args) {
		
		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		// iniciamos el cambio
		
		int auxiliar [] = new int [cantidad];
		int contador = 1;
		
		for (int i = 0; i < numeros.length; i++) {
			if(contador < numeros.length) {
				auxiliar[contador]=numeros[i];
				contador+=1;
			}else if(contador == numeros.length) {
				auxiliar[0]=numeros[i];
			}
		}
		
		System.out.println(Arrays.toString(auxiliar));
		
	}

}
