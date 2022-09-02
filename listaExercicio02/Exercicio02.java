package listaExercicio02;

import java.util.Scanner;

/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número
de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa
em relação ao total de eleitores.*/

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int eleitores, votosNulos;
		float percentualVotosNulos, percentualVotosValidos;
		
		
		System.out.println("Digite a quantidade de eleitores tem no município: ");
		eleitores = sc.nextInt();
		System.out.println("Digite a quantidade de eleitores que votaram em branco: ");
		votosNulos = sc.nextInt();
		percentualVotosNulos = (float) (votosNulos*100)/eleitores;
		percentualVotosValidos = (float) (percentualVotosNulos-100)*(-1);
		
		System.out.printf("O valor em percentual de votos validos é de %.2f%n ",percentualVotosValidos);
		System.out.printf("O valor em precentual de votos brancos é %.2f%n ", percentualVotosNulos);
		
		
		sc.close();
	}

}
