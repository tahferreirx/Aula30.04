package Desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoDeParOuÍmpar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int soma;

		System.out.println("Digite um número:");
		int numeroUsuario = scanner.nextInt();

		System.out.println("Escolha: par ou ímpar:");
		String escolhaUsuario = scanner.next();
		
		int escolhaAleatoria = random.nextInt(100);
        String escolhaComputador;
        
        if (random.nextInt(2) == 0) {
            escolhaComputador = "par";
        } else {
            escolhaComputador = "ímpar";
        }
		
        System.out.println("O computador é: " + " " + escolhaComputador);
        System.out.println("O número do computador é: " +  " " + escolhaAleatoria);
        
        soma = numeroUsuario + escolhaAleatoria;
        
        System.out.println("O o resultado foi: " + " " + soma);
        
        if ( soma % 2 == 0) {
        	System.out.println("Você venceu!");
        
        } else {
        	System.out.println("Você perdeu!");
        
			
		scanner.close();
		}

		
		    }
		}