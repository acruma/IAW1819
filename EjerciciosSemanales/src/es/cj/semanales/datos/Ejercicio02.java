package es.cj.semanales.datos;

import java.util.Scanner;

public class Ejercicio02 {

	// (09/10/18) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
	// Si trabaja 40 horas o menos se le paga 16€ por hora 
	// Si trabaja más de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra.
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Horas : ");
		int horas = sc.nextInt();
		
		int num1;
		int num2;
		
		int paga;
		
		if (horas > 0 && horas <= 40) {
			
			paga = horas * 16;
			
			System.out.println(paga);
			
		}else if (horas > 40) {
			
			num1 = 40 * 16;
			
			num2 = (horas - 40) * 20;
			
			paga = num1 + num2;
			
			System.out.println(paga);
			
		}
	
		
		
	}
	
}
