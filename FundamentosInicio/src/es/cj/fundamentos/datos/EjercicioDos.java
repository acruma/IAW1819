package es.cj.fundamentos.datos;

import java.util.Scanner;

public class EjercicioDos {

	// Defina 2 variables de tipo entero para describir las longitudes de los
	// lados  de un rectángulo. El programa debe calcular y mostrar las
	// longitudes de los lados, el perímetro y el área del rectangulo
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca el ancho ");
		int ladoancho = sc.nextInt();
		
		System.out.println("Introduzca el alto ");
		int ladoalto = sc.nextInt();
		
		int perimetro = 2 * (ladoancho + ladoalto);
		int area = ladoalto * ladoancho;
		
		System.out.println("El ancho del rectangulo es " + ladoancho + "\n" + "el alto del rectangulo es " + ladoalto);
		System.out.println("El perimetro es " + perimetro + ". Y el area es " + area + "." );
		
		sc.close();
	}
	
}
