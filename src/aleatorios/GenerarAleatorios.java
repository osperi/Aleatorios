package aleatorios;

import java.util.Scanner;

public class GenerarAleatorios {
	
	public static void main(String[] args) {
		
		int n;//, max=0, min=1000;

		int[] numeros;// = new int[n];
		System.out.println("¿Cuántos números aleatorios quiere generar?");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		numeros = generarAleatorios(n);

		System.out.println("Los elementos que componen el array son:");
		for(int i=0; i<numeros.length; i++) {
			//numeros[i] = (int) Math.floor(Math.random()*1000);
			System.out.println("\t->Elemento "+(i+1)+": "+numeros[i]);
			/*if(numeros[i]>max)
			max = numeros[i];
			//max = numeros[i]>max ? numeros[i] : max;
			if(numeros[i]<min)
				min = numeros[i];
			//min = numeros[i]<min ? numeros[i] : min;*/
		}
		
		System.out.println("\t\tEl número máximo es: "+calcularMaximo(numeros));
		System.out.println("\t\tEl número mínimo es: "+calcularMinimo(numeros));
		
		scanner.close();
	}
	
	public static int[] generarAleatorios (int n) {
		
		int[] numeros = new int[n];
		
		for(int i=0; i<numeros.length; i++)
			numeros[i] = (int) Math.floor(Math.random()*1000);
		
		return numeros;
	}
	
	public static int calcularMaximo(int[] numeros) {
		
		int max=0;
		
		for(int i=0; i<numeros.length; i++)
			max = numeros[i]>max ? numeros[i] : max;
		
		return max;
	}
	
	public static int calcularMinimo(int[] numeros) {
		int min=1000;
		
		for(int i=0; i<numeros.length; i++)
			min = numeros[i]<min ? numeros[i] : min;
			
		return min;
	}

}
