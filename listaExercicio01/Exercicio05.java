package listaExercicio01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float baseMaior, baseMenor, altura, areaTrapezio;
		
		System.out.println("Digite a base maior do trapezio: ");
		baseMaior = sc.nextFloat();
		System.out.println("Digite a base menor do trapezio: ");
		baseMenor = sc.nextFloat();
		System.out.println("Digite a altura do trapezio: ");
		altura = sc.nextFloat();
		areaTrapezio = (baseMaior + baseMenor)*altura/2;
		System.out.println("A area do trapezio é: " + areaTrapezio);
		
		sc.close();
	}

}
