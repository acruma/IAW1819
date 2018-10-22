package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
	
	//Leer n números enteros, guardarlos en la tabla y
	// mostrar la media de los positivos, media negativos y el número de ceros
	
	public static void main(String[] args) {

		System.out.print("Cantidad de Nº : ");
		int cantidad = sc.nextInt();
		int numeros [] = new int [cantidad];
		
		int positivos = 0;
		int mediaP = 0;
		int negativos = 0;
		int mediaN = 0;
		int ceros = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				positivos += 1;
				mediaP += numeros[i];
			}else if(numeros[i] < 0) {
				negativos -= 1;
				mediaN -= numeros[i];
			}else
				ceros+=1;
		}
		
		if(mediaP > 0)
			System.out.println("Media Positivos = "+(mediaP / positivos));
		else
			System.out.println("No se introdujeron numeros positivos");
		
		if(mediaN > 0)
			System.out.println("Media Negativos = "+(mediaN / negativos));
		else
			System.out.println("No se introdujeron numeros negativos");
		
		if(ceros>0)
			System.out.println("Cantidad de ceros = "+ ceros);
		else
			System.out.println("No se introdujeron ceros");
	}

}
