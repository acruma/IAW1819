package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	private static Scanner sc = new Scanner(System.in);
	
	// Crear una tabla de n elementos. Pedir al usuario un valor entre 0 y n-1. 
	// Eliminar el valor de esa posición y desplazar todos los elementos para no 
	// dejar el hueco vacío
	
	public static void main(String[] args) {

		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("¿Que posicion vas a eleminiar?");
		int eliminado = sc.nextInt();
		
		int auxiliar [] = new int [cantidad-1];
		
		for (int i = 0; i < auxiliar.length; i++) {
			if(i < (eliminado)){
				auxiliar[i]=numeros[i];
			}else if(i>=(eliminado)) {
				auxiliar[i]=numeros[i+1];
			}
		}
		
		System.out.println(Arrays.toString(auxiliar));
		
	}

}
