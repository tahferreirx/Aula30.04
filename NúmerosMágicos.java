package Desafios;

import java.util.Random;
import java.util.Scanner;

public class NúmerosMágicos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] sorteados = new int[5];
		int acertos = 0;

		for (int i = 0; i < 5; i++) {
			sorteados[i] = random.nextInt(50) + 1;
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Tente adivinhar o número " + (i + 1) + ": ");
			int tentativa = scanner.nextInt();
			
			if (tentativa == sorteados[i]) {
				acertos++;
				}
			}
		System.out.println("Você acertou " + acertos + " número(s).");

		scanner.close();
		    }
		}

