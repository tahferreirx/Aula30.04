package Desafios;

import java.util.Scanner;

public class VerificadorDeTriângulo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		double lado1 = scanner.nextInt();
		
		System.out.println("Digite o segundo lado: ");
		double lado2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro lado: ");
		double lado3 = scanner.nextInt();
		
		if ( lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			
			System.out.println("É um triângulo");
		} 
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo equilátero");
			
		} else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Triângulo isósceles");
			
		} else if (lado1 == lado3 && lado3 != lado2) {
			System.out.println("Triângulo isósceles"); 
			
			} else if (lado2 == lado3 && lado3 != lado1) {
				System.out.println("Triângulo isósceles"); 
		
        } else {
            System.out.println("Triângulo escaleno");
			
		}
			
		}
}

