package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio09 {

	// Leer dos series de n números. Almacenarlos en 2 tablas.
	// Ordena las tablas. Fusiona las 2 tablas en una tabla de 2*n elementos de 
	// forma que esta tabla esté ordenada.
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Cantidad de Nº tabla Uno : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
				numeros[i] = new Random().nextInt(10);
		}
		
		System.out.print("Cantidad de Nº tabla Dos : ");
		
		int cantidad2 = sc.nextInt();
		int numeros2 [] = new int [cantidad2];
		
		for (int i = 0; i < numeros2.length; i++) {
				numeros2[i] = new Random().nextInt(10);
		}
		
		Arrays.sort(numeros);
		Arrays.sort(numeros2);
		
		System.out.println("Tabla uno ordenada");
		System.out.println(Arrays.toString(numeros));
		System.out.println("Tabla dos ordenada");
		System.out.println(Arrays.toString(numeros2));
		
		int tamano = 0;
		
		if(cantidad>=cantidad2) {
			tamano = cantidad;
		}else if(cantidad2>cantidad) {
			tamano = cantidad2;
		}
		
		int fusion [][] = new int [2][tamano];
		
		for (int i = 0; i < fusion.length; i++) {
			for (int j = 0; j < fusion[i].length; j++) {
				if(i == 0) {
					fusion[i][j] = numeros[j];
				}else if(i==1) {
					fusion[i][j] = numeros2[j];
				}
				System.out.print(fusion[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
