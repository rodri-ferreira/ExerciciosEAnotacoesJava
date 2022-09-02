package listaExercicio01;

import java.util.Scanner;

// 1) Solicite um valor e retorne o seu sucessor

public class Sucessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int numero01 = sc.nextInt();
		int sucessor = numero01+1;
		System.out.println("O número sucessor é: "+sucessor);
		
		sc.close(); 
	}

}
