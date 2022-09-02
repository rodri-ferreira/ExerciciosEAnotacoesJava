package listaExercicio01;

import java.util.Scanner;

//12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a 
//área do circulo. a=pi*r²

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		double area, raio;
		
		
		System.out.println("Digite o raio do circulo:");
		raio = sc.nextDouble();
		area = 3.145 * (raio*raio);
		System.out.println("a area do circulo é: " + area);
		
		
		
		sc.close();
	}

}
