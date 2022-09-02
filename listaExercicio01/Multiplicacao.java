package listaExercicio01;

import java.util.Scanner;

public class Multiplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int numero01 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int numero02 = sc.nextInt();
		int multiplicacao = numero01* numero02;
		System.out.println("A multiplicação é: " + multiplicacao);
		
		sc.close();

	}

}
