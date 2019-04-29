package app;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int alvo;

		System.out.println("Digite o final da contagem");
		alvo = in.nextInt();
		
		if(alvo>=0) {
			int i = 0;
			while (i<=alvo)
			{
				System.out.println(i);
				
				i++;
			}
		}
		else {
			int i = 0;
			while (i>=alvo)
			{
				System.out.println(i);
				
				i--;
			}
		}

	}

}
