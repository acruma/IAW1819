package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
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
	
		int numeros [][] = new int [3][10];
		int trimestreUno [] = new int [10];
		int trimestreDos [] = new int [10];
		int trimestreTres [] = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = new Random().nextInt(10);
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if(i == 0) {
					trimestreUno[j] = numeros[i][j];
				}else if(i==1) {
					trimestreDos[j] = numeros[i][j];
				}else if(i==2) {
					trimestreTres[j] = numeros[i][j];
				}
			}
		}
		System.out.println("Se pide leer las notas del primer, segundo y tercer trimestre almacenándolas en una tabla.");
		System.out.println();
		System.out.print("Primer Trimestre  : " + Arrays.toString(trimestreUno));
		System.out.println();
		System.out.print("Segundo Trimestre : " + Arrays.toString(trimestreDos));
		System.out.println();
		System.out.print("Tercer Trimestre  : " + Arrays.toString(trimestreTres));
		System.out.println();
		
		System.out.println();
		System.out.println("Debemos mostrar la nota media final de cada alumno");
		System.out.println();
		double sumaTUno = 0;
		double sumaTDos = 0;
		double sumaTTres = 0;
		for (int i = 0; i < trimestreUno.length; i++) {
			System.out.println("Nota media del alumno " + (i+1) + " nota : " + (double)(trimestreUno[i]+trimestreDos[i]+trimestreTres[i])/3);
			sumaTUno += trimestreUno[i];
			sumaTDos += trimestreDos[i];
			sumaTTres += trimestreTres[i];
		}
		System.out.println();
		System.out.println("Debemos mostrar la nota media final de cada clase en cada trimestre");
		System.out.println();
		
		System.out.println("Nota media del Primer Trimestre  : " + (sumaTUno/10));
		System.out.println("Nota media del Segundo Trimestre : " + (sumaTDos/10));
		System.out.println("Nota media del Tercer Trimestre  : " + (sumaTTres/10));
		
		System.out.println("Pida la nota del Alumno (entre 1 y 10): ");
		int alumno = sc.nextInt();
		double mediaFinalAlumno = 0;
		if(alumno>=1 && alumno<=10) {
		mediaFinalAlumno = media(alumno, trimestreUno, trimestreDos, trimestreTres);
		System.out.println(mediaFinalAlumno);
		}else
			System.out.println("Alumno incorrecto");
		
		
	}

	private static double media(int alumno, int[] trimestreUno, int[] trimestreDos, int[] trimestreTres) {
		double media = 0;
		int suma = 0;
		
		for (int i = 0; i < trimestreUno.length; i++) {
			if(i == (alumno-1))
			suma = trimestreUno[i]+trimestreDos[i]+trimestreTres[i];
		}
		
		media = (double)suma/3;
		
		return media;
	}

	

}
