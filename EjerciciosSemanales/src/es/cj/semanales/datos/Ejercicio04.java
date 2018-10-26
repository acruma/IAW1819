package es.cj.semanales.datos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	// Rellena una tabla de 20 números positivos de manera aleatoria. 
	// Pida números al usuario (0 para finalizar el bucle) y muestra cuantas veces se repite el
	// número en la tabla y cuál es la primera posición en la que aparece
	// (-1 si no se encuentra en la tabla)
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeros [] = new int [20];
		
		for (int i = 0; i < numeros.length; i++) {
				numeros[i] = new Random().nextInt(10) + 1;
		}
		
		System.out.println(Arrays.toString(numeros));
		
		int pedir;
		int contador = 0;
	
		boolean  finalizar = true;
		
		System.out.println("Dame un numero : ( si es 0 finaliza el programa )");
		
		do {
			int aux = -1;
			pedir = sc.nextInt();
			
			if(pedir>0) {
				for (int i = 0; i < numeros.length; i++) {
					if(pedir == numeros[i]) {
						contador++;
						if(aux == -1)
						aux = i;
					}
				}
				
				if(aux > -1)
					System.out.println("El numero aparece " + contador + ". Y su primera posicion es " + aux);
				else if(aux == -1){
					System.out.println("-1");
				}
			
			}else if(pedir == 0) {
				finalizar = false;
			}else
				System.out.println("Dame un numero positivo");
		
		}while(finalizar);
		
		
		
	}

}
