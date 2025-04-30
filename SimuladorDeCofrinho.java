package Desafios;

import java.util.Scanner;

public class SimuladorDeCofrinho {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double valor, total = 0;
		int quantidade = 0;
		int opcao;

		do {
			
			System.out.print("Insira o valor da moeda: R$ ");
		    valor = scanner.nextDouble();
		    total += valor;
		    quantidade++;
		    
		    System.out.print("Deseja inserir outra moeda? (1 - Sim | 0 - Não): ");
		    opcao = scanner.nextInt();
		    
		} while (opcao == 1);
		
		System.out.println("Total de moedas inseridas: " + quantidade);
		System.out.printf("Valor total no cofrinho: R$ "+ total);

		scanner.close();

	}

}
