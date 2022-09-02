package listaExercicio01;

import java.util.Scanner;

//Escreva um algoritmo para ler as dimensões de um quadrado (lado),
//calcular e escrever a área do quadrado. Dica a=l²

public class ExercicioSala03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de um lado do quadrado: ");
		int lado01 = sc.nextInt();
		int areaQuadrado = lado01 * lado01;
		
		System.out.println("A área do quadrado é: " + areaQuadrado);
		
		
		
		
		sc.close();
	}

}
