package es.cj.cadenas.datos;

public class Ejercicio04 {
	
	
	// Escriba un método que, dada una cadena de caracteres, de la suma de todos los dígitos que hay en ella. 
	// Por ejemplo, si la cadena es abc12de3f4, dará como resultado 10..
	
		
	public static void main(String[] args) {
		
		String cadena = "abc12de3f4";
		
		int suma = 0;
		int suma2 = 0;
		
		// 48 - 57 AScii Numeros 0-9
		
		char[] numeros = cadena.toCharArray();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 48 && numeros[i] <= 57) {
				suma += Character.getNumericValue(numeros[i]);
				suma2 += Integer.parseInt(cadena.substring(i, i+1));
			}
		}
				
		System.out.println(suma);
		System.out.println(suma2);

	}

}
