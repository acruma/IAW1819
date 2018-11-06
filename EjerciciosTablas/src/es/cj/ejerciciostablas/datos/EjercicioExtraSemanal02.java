package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioExtraSemanal02 {

	// Rellena una tabla de X números (valores aleatorios dados por un maximo). Reliza una
	// función que devuelva el número que más se repite.

	private static int numeros [];
	private static int contadores[];
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		int num = 0;
		do {
			System.out.println("¿Cuantos numeros?");
			num = sc.nextInt();
		}while(num<=0);
		numeros = new int [num];
		
		int max = 0;
		do {
			System.out.println("¿Valor máximo?");
			max = sc.nextInt();
		}while(max<=1);
		contadores = new int[max+1];
		
		rellenarTabla(max);
		
		calcularContadores();
		
		System.out.println(Arrays.toString(numeros));
		System.out.println("El numero que mas se repite es el " + mostrarMasRepetido());
		
		sc.close();
	}

	private static int mostrarMasRepetido() {
		int mayor = 0, pos = 0;
		
		for (int i = 0; i < contadores.length; i++) {
			if(contadores[i] > mayor) {
				mayor = contadores[i];
				pos = i;
			}
		}
		
		return pos;
	}

	private static void calcularContadores() {
		for (int i = 0; i < numeros.length; i++) {
				contadores[numeros[i]]++;
		}
	}

	private static void rellenarTabla(int max) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(max)+1;
		}
	}

}
