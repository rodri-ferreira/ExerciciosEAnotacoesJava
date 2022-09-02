package listaExercicio02;

import java.util.Scanner;

/*10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
e efetuar a troca dos valores de forma que a variável A passe a possuir o valor 
da variável B e a variável B passe a possuir o valor da variável A. Apresentar os 
valores trocados.*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		
		a = b;
		b = a;
		System.out.println("Os valores trocador a: " + a);
		System.out.println("Os valores trocador b: " + b);		
		
		sc.close();
	}

}










