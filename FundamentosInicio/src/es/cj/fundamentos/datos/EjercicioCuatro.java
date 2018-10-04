package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioCuatro {
	// Pida al usuario una cantidad de segundos e imprima la cantidad
	// de horas, minutos y segundos
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Segundos: ");
		int segundos = sc.nextInt();
		int minutos = segundos/60;
		int horas = minutos/60 ;
		
		int modsegundo = segundos%60;
		int modminutos = minutos%60;
		int modhoras = horas%60;
		
		System.out.println("Horas " + modhoras);
		System.out.println("Minutos " + modminutos);
		System.out.println("Segundos " + modsegundo);
		
		sc.close();
	}
}
