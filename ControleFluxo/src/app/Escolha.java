package app;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite o dia da semana (1-7)");
		idade = input.nextInt();
		
		switch(idade) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Número digitado inválido!");
		}

	}

}
