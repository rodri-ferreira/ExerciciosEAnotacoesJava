package listaExercicio01;

import java.util.Scanner;

//Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), 
//calcular e escrever a área do triângulo. Dica a=b.h/2

public class ExercicioSala02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a Base do Triângulo: ");
		double baseTriangulo = sc.nextDouble();
		System.out.println("Digite a Altura do Triângulo: ");
		double alturaTriangulo = sc.nextDouble();
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		System.out.println("A área do triângulo é: " + areaTriangulo);

		sc.close();
	}
}
