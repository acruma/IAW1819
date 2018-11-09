package es.cj.cadenas.datos;

import java.util.Arrays;

public class Explicacion {

	public static void main(String[] args) {
		
		String cadena1 = "holaaa";
		String cadena2 = new String("HOLA");
		
		// Comparaciones
		if (cadena1.equals(cadena2)) {
			System.out.println("Iguales");
		}else
			System.out.println("Distintas");
		// Comparar ignorando CASE
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Iguales");
		}else
			System.out.println("Distintas");
		
		System.out.println(cadena1.concat(cadena2));
		
		String cadena3 = cadena1.concat(cadena2);
		
		System.out.println(cadena3);
		
		if (cadena3.contains("la")) {
			System.out.println("Lo tiene");
		}
		
		System.out.println(cadena3.indexOf("a"));
		System.out.println(cadena3.lastIndexOf("a"));
		
		System.out.println(cadena3.toLowerCase().lastIndexOf("a"));
		
		if(cadena1.equals("") || cadena1.length() == 0 || cadena1.isEmpty())
			System.out.println("Cadena vacia");
		
		cadena1 = cadena1.replace("h", "p");
		
		System.out.println(cadena1);
		
		System.out.println(cadena1.substring(1, cadena1.length()));
		System.out.println(cadena1.substring(1));
		
		char letras [] = cadena1.toCharArray();
		System.out.println(Arrays.toString(letras));
		
		// Eliminar espacios inicial y final
		String usuario = " mateo ";
		usuario = usuario.trim();
		System.out.println(usuario);
		
		String frase = "Hola que tal estas";
		
		String palabras [] = frase.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		
		//////////////////////////////// STRING BUFFERS ///////////////////////////////////////
		
		StringBuffer sb = new StringBuffer(cadena1);
		
		sb.append("adios");
		System.out.println(sb.toString());
		
		sb.insert(0, "Inicio");
		System.out.println(sb.toString());
		
		sb.deleteCharAt(7);
		sb.replace(0, 3, "avion");
		System.out.println(sb.toString());
		
		sb.reverse();
		
		
	}

}
