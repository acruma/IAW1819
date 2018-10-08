package es.cj.encriptado;

import java.util.ArrayList;
import java.util.Scanner;

public class Encriptado {
private static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	// Entrada por teclado de seleccion
	System.out.println("Elija 'encriptar' o 'desencriptar'");
	// String encrip = sc.next();
	String encrip = "encriptar"; // provisional ( para no introducir encriptar )
	
	// Inicializacion de variables a usar
	// ArrayList
	
	ArrayList<String> salida = new ArrayList<String>();
	ArrayList<String> salida2 = new ArrayList<String>();
	// Operadores
	
	char aValue;
	int aAscii;
	String aRray = "";
	int num1;
	int num2;
	int num3;
	
	// Condicional para encriptar
	if (encrip.equalsIgnoreCase("encriptar")) {
		// Entrada por teclado de la clave a encriptar
		System.out.println("Introduzca la clave a encriptar");
		String clave = sc.next();
		
		// For para ecuacion de encriptacion para cada caracter
		for (int i=0; i < clave.length(); i++ ) {
			aValue = clave.charAt(i);
			aAscii = (int)aValue;
			
			num1 = aAscii;
			num3 = (int) (Math.random() * 100) + 2; // 2 a 101
			num1 = num1 + num3;
			
			while (num1 > 0) {
				num2 = num1 % 2;
				
				num1 = num1 / 2;
				
				if (num2 == 0)
					aRray = aRray + 1 ;
				else
					aRray = aRray + 0 ;
			}
			StringBuilder builder=new StringBuilder(aRray);
			String aRrayInvertida=builder.reverse().toString();
			
			aRray = "";
			while (num3 > 0) {
				num2 = num3 % 2;
				
				num3 = num3 / 2;
				
				aRray = aRray + num2 ;
			}
			
			StringBuilder builder2=new StringBuilder(aRray);
			String aRrayInvertida2=builder2.reverse().toString();
			aRrayInvertida = aRrayInvertida + "," + aRrayInvertida2;
			aRrayInvertida = aRrayInvertida + ";";
			salida.add(aRrayInvertida);
			
			aRray = "";
			
		}		
		for (int i=0; i < salida.size(); i++ ) {
			
			System.out.print(salida.get(i));
			
		}
		
	
		
		
		
		// Condicional para desencriptar
	}else if (encrip.equalsIgnoreCase("desencriptar")) {
		// Entrada por teclado de la clave a desencriptar
				System.out.println("Introduzca la clave a desencriptar");
				String clave = sc.next();
		
		
	}
	
	
	
}
}
