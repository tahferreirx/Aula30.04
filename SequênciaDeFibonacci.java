package Desafios;

import java.util.Scanner;

public class SequênciaDeFibonacci {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor de N: ");
		int N = scanner.nextInt();

		int a = 0, b = 1;
		for (int i = 0; i < N; i++) {
		System.out.print(a + " ");
		int temporaria = a + b;
		a = b;
		b = temporaria;
		        }

		        scanner.close();
		    }
		}

	