package listaExercicio01;

import java.util.Scanner;

// 1) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), 
//calcular e escrever a área do retângulo. Dica a=b.h 

public class ExercicioSala01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do do retângulo");
		int baseRetangulo = sc.nextInt();
		System.out.println("Digite a altura do retangulo:");
		int alturaRetangulo = sc.nextInt(); 
		int areaRetangulo = baseRetangulo*alturaRetangulo;
		System.out.println("O valor da área do retângulo é: " + areaRetangulo);
		
		sc.close();
		
	}

}
