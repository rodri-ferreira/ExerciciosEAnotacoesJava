package listaExercicio01;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int numero01 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int numero02 = sc.nextInt();
		int divisao = numero01 / numero02;
		System.out.println("O valor da divisão é: " + divisao);
		
		sc.close();
	}

}
