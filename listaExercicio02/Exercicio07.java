package listaExercicio02;

import java.util.Scanner;

//7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float raio, altura; 
		double volume;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextFloat();
		System.out.println("Digite o valor da altura: ");
		altura = sc.nextFloat();
		
		volume = Math.PI*(raio*raio)*altura;
		
		System.out.printf("O volume da lata de óleo é: %.2f%n ",volume);
			
		sc.close();
	}

}
