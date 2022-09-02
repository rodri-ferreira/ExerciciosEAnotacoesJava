package listaExercicio01;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int numero01 = sc.nextInt();
		System.out.println("Digite outro valor:");
		int numero02 = sc.nextInt();
		int soma = numero01+numero02;
		System.out.println("A soma dos númeors é: "+soma);
		
		sc.close();
	}

}
