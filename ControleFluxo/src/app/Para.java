package app;

import java.util.Scanner;

public class Para {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int alvo;

		System.out.println("Digite o final da contagem");
		alvo = in.nextInt();

		if(alvo>=0) {
			for (int i = 0; i<=alvo;i++)
			{
				System.out.println(i);
			}
		}
		else {
			for (int i = 0; i>=alvo;i--)
			{
				System.out.println(i);
			}
		}
	}
}
