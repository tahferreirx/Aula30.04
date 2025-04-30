package Desafios;

import java.util.Scanner;

public class SomaDeNúmerosPositivos {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		int soma = 0;

		System.out.println("Digite números positivos para somar (digite um número negativo para parar)");

		do {
			
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
			
			if (numero > 0) {
				soma += numero;
				
			}
			
		} while (numero >= 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		scanner.close();
		    }
		}