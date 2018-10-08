package es.cj.ejerciciosif.datos;

import java.util.Scanner;

public class EjerciciosIfUnoAlSeis {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Num 1; ");
		int num1 = sc.nextInt();
		System.out.println("Num 2; ");
		int num2 = sc.nextInt();
		System.out.println("Num 3; ");
		int num3 = sc.nextInt();
		
		
		// Pedir dos números y decir si son iguales o no
		
		if (num1 == num2) 
			System.out.println("Son Iguales");
		else
			System.out.println("No son iguales");
		
		// Pedir un número e indicar si es positivo o negativo
		
		if (num1 > 0) {
			System.out.println("Num 1 Es positivo");
		}else if(num1 < 0) {
			System.out.println("Num 1 Es negativo");
		}else
			System.out.println("Es cero");
		
		
		// Pedir dos números y decir si uno es múltiplo del otro

		if (num1 % num2 == 0)
			System.out.println("Num 1 es multiplo de Num 2");
		else if(num2 % num1 == 0)
			System.out.println("Num 2 es multiplo de Num 1");
		else
			System.out.println("Ninguno es multiplo del otro");
		
		
		// Pedir dos números e indicar cual es el mayor o si son iguales

		if (num1 > num2) {
			System.out.println("Num 1 es mayor a Num 2");
		}else if(num1 < num2) {
			System.out.println("Num 2 es mayor a Num 1");
		}else
			System.out.println("Son iguales");
		
		// Pedir dos números y mostrarlos ordenados de mayor a menor

		if(num1 > num2) {
			System.out.println(num1 + " " + num2);
		}else
			System.out.println(num2 + " " + num1);
		
		
		// Pedir tres números y mostrarlos ordenados de mayor a menor

		if(num1 > num2 && num1 > num3) {
			if (num2 > num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
			}else{
			System.out.println(num1 + " " + num3 + " " + num2);
			}
		}else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
			}else{
			System.out.println(num2 + " " + num3 + " " + num1);
			}
		}else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
			}else{
			System.out.println(num3 + " " + num2 + " " + num1);
			}
		}else
			System.out.println(num1 + " " + num2 + " " + num3);
		
		
	}

}
