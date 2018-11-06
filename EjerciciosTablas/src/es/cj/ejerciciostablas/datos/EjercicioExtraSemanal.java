package es.cj.ejerciciostablas.datos;

import java.util.Arrays;
import java.util.Random;

public class EjercicioExtraSemanal {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
	// función que devuelva el número que más se repite.

	private static int numeros [] = new int [10];
	
	public static void main(String[] args) {		
		
		rellenarTabla();
		System.out.println(Arrays.toString(numeros));
		System.out.println("El numero que mas se repite es el " + numeroRepetido());
		
	}

	private static int numeroRepetido() {
		int numero [] = new int [7];
		int repetido = 0;
		int numMayor = 0;
		
		for (int i = 0; i < numeros.length; i++) {
				numero[numeros[i]]++;
		}

		for (int i = 0; i < numero.length; i++) {
			if(numero[i] > numMayor) {
				numMayor = numero[i];
				repetido = i;
			}
		}
				
		return repetido;
	}

	private static void rellenarTabla() {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(6)+1;
		}
	}

}
