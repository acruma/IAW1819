package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioTres {

	// Pedir el radio de un círculo y calcular su área y su longitud 
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Radio ");
		double radio = sc.nextDouble();
		
		double area = (Math.pow(radio, 2)) * Math.PI;
		double longitud = (2 * Math.PI) * radio;
		
		System.out.println("Area " + area + "\n" + "Longitud " + longitud);
		
		sc.close();		
	}	
}
