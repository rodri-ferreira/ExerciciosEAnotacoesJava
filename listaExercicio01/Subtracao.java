package listaExercicio01;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int numero01= sc.nextInt();
		System.out.println("Digite outro numero");
		int numero02 = sc.nextInt();
		int subtracao = numero01-numero02;
		System.out.println("A subtração do número é: " + subtracao);
			
		sc.close();
	}

}
