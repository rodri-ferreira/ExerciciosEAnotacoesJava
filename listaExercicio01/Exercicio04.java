package listaExercicio01;

//10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular 
//e escrever a área do losango. Dica a=D.d/2

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float diagonalMenor;
		float diagonaMaior;
		float areaLozangulo;
		
		System.out.println("Digite a diagonal menor do losangulo: ");
		diagonalMenor = sc.nextFloat();
		System.out.println("Digite a diagonal maior do losangulo: ");
		diagonaMaior = sc.nextFloat();
		
		areaLozangulo = (diagonalMenor * diagonaMaior) / 2;
		
		System.out.println("A área do losangulo é: " + areaLozangulo);
			
		sc.close();
	}

}
