package listaExercicio02;

/*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
(32 °F − 32) × 5/9 = 0 °C*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float grausFahrenheit, grausCelsius;
		
		System.out.println("Digite a temperatura em graus Farennittee");
		grausFahrenheit = sc.nextFloat();
		
		grausCelsius = (grausFahrenheit -32)* 5/9;
		
		System.out.printf("A temperatura em celsius é %.2f%n ",grausCelsius);
		
       sc.close();
	}

}
