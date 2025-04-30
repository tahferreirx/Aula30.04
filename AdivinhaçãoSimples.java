package Desafios;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaçãoSimples {
	public static void main(String[] args) {
		
		Random random = new Random();
		int numeroAleatorio = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10
		Scanner scanner = new Scanner(System.in);
		int tentativa;

		System.out.println("Adivinhe o número entre 1 e 10:");
		
		do {
			System.out.print("Digite seu palpite: ");
			tentativa = scanner.nextInt();
			
			if (tentativa < numeroAleatorio) {
		       System.out.println("O número é maior.");
		    
			} else if (tentativa > numeroAleatorio) {
		       System.out.println("O número é menor.");
		    
			} else {
		       System.out.println("Você acertou !!! O número era " + numeroAleatorio + ".");
		    }
			
		    } while (tentativa != numeroAleatorio);

		    scanner.close();
		    }
		
	}


