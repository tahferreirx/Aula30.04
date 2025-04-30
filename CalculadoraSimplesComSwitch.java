package Desafios;

import java.util.Scanner;

public class CalculadoraSimplesComSwitch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha uma operação entre (+,-,*,/):");
		String operacao = scanner.next();

		System.out.println("Digite dois números:");
		System.out.print("Número 1: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Número 2: ");
		double numero2 = scanner.nextDouble();
		
		double resultado = 0;

		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
		    resultado = numero1 - numero2;
		    break;
		case "*":
		    resultado = numero1 * numero2;
		    break;
		case "/":
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				} else {
					System.out.println("Erro! Divisão por zero não é permitida.");
		                 
		 }
		     break;
		     default:
		     System.out.println("Operação inválida!");
		               
		        }

		        System.out.println("O resultado é: " + resultado);

		        scanner.close();
		    }
		}