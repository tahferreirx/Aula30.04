package Desafios;

import java.util.Scanner;

public class DetectorDeNúmerosPrimos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		int contador = 0;

		if (numero <= 1) {
			System.out.println(numero + " não é primo.");
			
		} else {
			
			for (int i = 1; i <= numero; i++) {
				
				if (numero % i == 0) {
					contador++;
		          }
		      }
			if (contador == 2) {
				System.out.println(numero + " é primo.");
				
			} else {
				System.out.println(numero + " não é primo.");
		            }
		        }

		scanner.close();
		 
	}

}
