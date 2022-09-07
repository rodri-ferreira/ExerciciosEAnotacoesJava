package formula;

import java.util.Scanner;

public class Paciente {
	public String nome;
	public float altura;
	public float peso;
	
	public void calcularImc() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite a sua altura: ");
		altura = sc.nextFloat();
		System.out.print("Digite o seu peso: ");
		peso = sc.nextFloat();
		
		float imc;
		
		imc = peso/(float)Math.pow(altura,2);
		
		if (imc <= 18.5) {
			System.out.println();
			System.out.printf(nome + " Você está abaixo do peso! %.2f%n", imc);
		}else if (imc <= 24.9) {
			System.out.println();
			System.out.printf(nome + " Você está no peso ideal, continue assim! %.2f%n", imc);
		}else if (imc <= 29.9) {
			System.out.println();
			System.out.printf(nome + " Levemente acima do peso, cuidado! %.2f%n", imc);
		}else if (imc <= 34.9) {
			System.out.println();
			System.out.printf(nome + " Obesidade grau 1 Procure um médico! %.2f%n", imc);
		}else if (imc <= 39.9) {
			System.out.println();
			System.out.printf(nome + " Obesidade grau 2 (severa)! %.2f%n", imc);
		}else {
			System.out.println();
			System.out.printf(nome + " Obesidade grau 3 (mórbida)! %.2f%n", imc);
		}
		sc.close();	
	}
	
	
	
	
	
	
	
}
