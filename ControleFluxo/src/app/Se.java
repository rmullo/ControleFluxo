package app;

import java.util.Scanner;

public class Se {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua Idade:");
		idade = teclado.nextInt();
		
		if(idade>=18) {
			if(idade<=130) {
				System.out.println("Maior de Idade");
			}else {
				System.out.println("Erro: Idade digitada incorreta");
			}
		}else {
			if(idade>=0) {
				System.out.println("Menor de Idade");
			}
			else {
				System.out.println("Erro: Idade digitada incorreta");
			}
		}
	}

}
