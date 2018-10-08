package es.cj.encriptado;

import java.util.ArrayList;
import java.util.Scanner;

public class Encriptado {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean menu = true; // Agregar un While ( para el menu "ELIJA" )
		
		do {
		// Entrada por teclado de seleccion
		System.out.println("Elija 'encriptar' o 'desencriptar' - Inserte _ en vez de espacios");
		String encrip = sc.next();
		
		// Inicializacion de variables a usar
		// ArrayList
		
		ArrayList<String> salida = new ArrayList<String>();
		ArrayList<String> converso = new ArrayList<String>();
		ArrayList<String> descifrado = new ArrayList<String>();
		ArrayList<String> recogidaDatos = new ArrayList<String>();
		// Operadores
		
		char aValue;
		int aAscii;
		String aRray = "";
		int num1;
		int num2;
		int num3;
		int exponente;
		int decimalUno = 0;
		int decimalDos = 0;
		
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
				// Caracter a Binario e inversion del binario
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
				// Numero aleatorio a binario
				while (num3 > 0) {
					num2 = num3 % 2;
					
					num3 = num3 / 2;
					
					aRray = aRray + num2 ;
				}
				
				StringBuilder builder2=new StringBuilder(aRray);
				String aRrayInvertida2=builder2.reverse().toString();
				// Concatenacion en string
				aRrayInvertida = aRrayInvertida + ";" + aRrayInvertida2 + ";";
				salida.add(aRrayInvertida);
				
				aRray = "";
				
			}		
			for (int i=0; i < salida.size(); i++ ) {
				
				System.out.print(salida.get(i));
				
			}
			
			menu = false;
			
			// Condicional para desencriptar
		}else if (encrip.equalsIgnoreCase("desencriptar")) {
			// Entrada por teclado de la clave a desencriptar
					System.out.println("Introduzca la clave a desencriptar");
					String clave = sc.next();
					
					// Recogemos los datos de Clave y los separamos por cada espacio ( forma de cifrado )
					String[] arrSplit = clave.split(";");
					for (int i=0; i < arrSplit.length; i++)
				    {
						recogidaDatos.add(arrSplit[i]);
				    }
					
					// Operamos los datos recogidos
					for (int i=0; i < recogidaDatos.size(); i++) {
						decimalUno = 0;
						decimalDos = 0;
						String binario = recogidaDatos.get(i);
						
						if(i%2==0) {
							// Binario a decimal caracter con suma numAleatorio
							
							StringBuilder builder=new StringBuilder(binario);
							String binarioInvertido=builder.reverse().toString();
							
							for (int j=0; j < binarioInvertido.length(); j++) {
								
								int numeroBinario = binarioInvertido.charAt(j);
								
								exponente = (int)Math.pow(2,j);
								
								if (numeroBinario == 48) { // Si leemos un Cero ( que realmente es UNO )
									decimalUno = decimalUno + exponente;
								}
								
							}
							
							String decimalUnoString;
							decimalUnoString=Integer.toString(decimalUno);
							
							converso.add(decimalUnoString);
							
						}else {
							// Binario a decimal numAleatorio
							
							StringBuilder builder=new StringBuilder(binario);
							String binarioInvertido=builder.reverse().toString();
							
							for (int j=0; j < binarioInvertido.length(); j++) {
								
								int numeroBinario = binarioInvertido.charAt(j);
								
								exponente = (int)Math.pow(2,j);
								
								if (numeroBinario == 49) { // Si leemos un Uno
									decimalDos = decimalDos + exponente;
								}
							}
							
							String decimalDosString;
							decimalDosString=Integer.toString(decimalDos);
							
							converso.add(decimalDosString);
						}
					}
						
					// Ahora vamos a resolver la ecuacion ( la resta )
					for (int i=-1; i < converso.size(); i++ ) {
						
						if(i%2==0) {
						int iPUno = i+1;
						
						String uno = converso.get(i);
						String dos = converso.get(iPUno);
												
						aAscii = Integer.parseInt(uno) - Integer.parseInt(dos);
						
						aValue = (char)aAscii;
						
						descifrado.add(Character.toString(aValue));	

						}
						
					}
					
					// Salida final de la frase descifrada
					
					for (int i=0; i < descifrado.size(); i++ ) {
						
						System.out.print(descifrado.get(i));
					
					}
					
			menu = false;
		
		}else
			System.out.println("Introduzca un parametro correcto.");
	
		} while(menu);
	}
}
