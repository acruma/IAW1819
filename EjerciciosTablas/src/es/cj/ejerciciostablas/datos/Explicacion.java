package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

public class Explicacion {

	
	
	public static void main(String[] args) {
		
		/*
		// Creación tabla sin inicializar 2D
		
		int tabla [][] = new int  [10][10];
		
		tabla[2][1] = 3;
		
		// Creación tabla inicializada 1D
		
		int tabla2 [] = {1,2,3};
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.print(tabla2[i] + " ");
		}
		
		
 		
		// Tabla de cadenas
		
		System.out.println();
		
		String cadena [] = {"Hola", "que", "tal"};
		
		for (int i = 0; i < cadena.length; i++) {
			System.out.print(cadena[i] + " ");
		}
		
		// Recorrer 2D mismo tamaño XY 10*10
		
		System.out.println();
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = new Random().nextInt(10);
			}
		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		
		// Tablas 2D diferente tamaño XY 10*6
		
		int tabla3 [][] = new int  [10][6];
		
		System.out.println();
		
		for (int i = 0; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3[i].length; j++) {
				tabla3[i][j] = new Random().nextInt(10);
			}
		}
		
		for (int i = 0; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3[i].length; j++) {
				System.out.print(tabla3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Creación e inicializacion tabla 2D
		
		int tabla4 [][] = {{1,2,3},{4,5},{6,7,8,9}};
			
		for (int i = 0; i < tabla4.length; i++) {
			for (int j = 0; j < tabla4[i].length; j++) {
				System.out.print(tabla4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		*/
		
		int numeros [] = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(10);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort(numeros);
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("El 6 se encuentra en la posición: " + Arrays.binarySearch(numeros, 6));
				
		// Arrays.fill(numeros, 99);
		
		System.out.println(Arrays.toString(numeros));
		
		int auxiliar [] = Arrays.copyOfRange(numeros, 0, 5);
		System.out.println(Arrays.toString(auxiliar));
		
			
		
		System.out.println(posiciones(numeros, 6));
		
		
	}

	private static String posiciones(int [] numeros, int valor) {
		String posiciones = " ";
		
		for (int j = 0; j < numeros.length; j++) {
			if(numeros[j] == valor) {
				posiciones += j;
			}
		}
		return posiciones;
	}

}
