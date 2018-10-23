package es.cj.ejerciciostablas.datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	private static Scanner sc = new Scanner(System.in);
	
	// Se pretende desarrollar una aplicación que nos ayude a gestionar 
	// las notas de un centro educativo. Cada clase está compuesta por 10 alumnos. 
	// Se pide leer las notas del primer, segundo y tercer trimestre almacenándolas en una tabla.
	// Debemos mostrar la nota media final de cada alumno y de cada clase en cada trimestre.
	// Por último, desarrolle un método que se le pase un número de alumno y devuelve la media final 
	// de ese alumno.
	
	
	public static void main(String[] args) {
	
		int numeros [][] = new int [10][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = new Random().nextInt(10);
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
