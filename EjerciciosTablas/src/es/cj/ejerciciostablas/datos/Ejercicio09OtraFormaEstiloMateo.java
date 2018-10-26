package es.cj.ejerciciostablas.datos;

	import java.util.Arrays;
	import java.util.Random;
	import java.util.Scanner;

	public class Ejercicio09OtraFormaEstiloMateo {

		// Leer dos series de n números. Almacenarlos en 2 tablas.
		// Ordena las tablas. Fusiona las 2 tablas en una tabla de 2*n elementos de 
		// forma que esta tabla esté ordenada.
		
		// He creado 2 tablas y las he fusionado en una 2D ( en vez de una 1D con tamaño 2*n )
		
		private static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.out.print("Cantidad de Nº tabla Uno : ");
			int cantidad = sc.nextInt();
			int numeros [] = new int [cantidad];
			
			for (int i = 0; i < numeros.length; i++) {
					numeros[i] = new Random().nextInt(10);
			}
			
			System.out.print("Cantidad de Nº tabla Dos : ");
			
			int cantidad2 = sc.nextInt();
			int numeros2 [] = new int [cantidad2];
			
			for (int i = 0; i < numeros2.length; i++) {
					numeros2[i] = new Random().nextInt(10);
			}
			
			Arrays.sort(numeros);
			Arrays.sort(numeros2);
			
			System.out.println("Tabla uno ordenada");
			System.out.println(Arrays.toString(numeros));
			System.out.println("Tabla dos ordenada");
			System.out.println(Arrays.toString(numeros2));
			
			int tamano = 0;
			
			if(cantidad>=cantidad2) {
				tamano = cantidad;
			}else if(cantidad2>cantidad) {
				tamano = cantidad2;
			}
			
			int fusion [][] = new int [2][tamano];
			
			for (int i = 0; i < cantidad; i++) {
				fusion[0][i] = numeros[i];
			}
			for (int i = 0; i < cantidad2; i++) {
				fusion[1][i] = numeros2[i];
			}
			
			System.out.println("Tabla de 2D ordenadas : ");
			
			for (int i = 0; i < fusion.length; i++) {
				int contador = 0;
				for (int j = 0; j < fusion[i].length; j++) {
					if(contador < cantidad && i == 0)
					System.out.print(fusion[i][j] + " ");
					if(contador < cantidad2 && i == 1)
						System.out.print(fusion[i][j] + " ");
					contador++;
				}
				System.out.println();
			}
			
			
		}

	}
