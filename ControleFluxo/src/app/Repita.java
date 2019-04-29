package app;

import java.util.Scanner;

public class Repita {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int alvo;

		do {
			System.out.println("Digite um número entre 0 e 10");
			alvo = in.nextInt();
		}while(alvo>=0 && alvo<=10);

	}

}
