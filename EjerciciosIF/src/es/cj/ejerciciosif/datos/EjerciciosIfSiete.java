package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjerciciosIfSiete {



	// Pedir al usuario dia, mes y año y comprobar que la fecha es correcta
	// incluidos bisiestos
		
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Año");
		int ano = sc.nextInt();
		System.out.println("Mes");
		int mes = sc.nextInt();
		System.out.println("Dia");
		int dia = sc.nextInt();
		
		if ( ano >= 0 && (mes >= 1 && mes <= 12) && (dia >= 1 && dia <=31) ) {
			
			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dia>31) {
					System.out.println("Fecha incorrecta");
				}else
					System.out.println("Fecha correcta");
				
				break;
			case 2:
				if((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0) ) {
					if(dia>29) {
						System.out.println("Fecha incorrecta");
					}else {
						System.out.println("Fecha correcta");
					}
				}else {
					if(dia>28)
						System.out.println("Fecha incorrecta");
					else
						System.out.println("Fecha correcta");
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia>30) {
					System.out.println("Fecha incorrecta");
				}else
					System.out.println("Fecha correcta");
				
				break;
			default:
				System.out.println("Fecha incorrecta");
				break;
			}
		}else
			System.out.println("Fecha incorrecta");
	}
}