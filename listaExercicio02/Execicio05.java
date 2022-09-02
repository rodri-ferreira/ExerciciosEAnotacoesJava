package listaExercicio02;

import java.util.Scanner;

/*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a 
temperatura em Celsius.*/

public class Execicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float grausCelsius, grausFahrenheit;
		
		System.out.println("Digite a temperatura em graus celsius");
		grausCelsius = sc.nextFloat();
		
		grausFahrenheit = (grausCelsius * 9/5)+32;
		System.out.println("A conversão de graus celsius para fahrenheit: " + grausFahrenheit);
		
		sc.close();
		
	}

}
