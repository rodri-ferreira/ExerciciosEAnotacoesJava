package listaExercicio02;

import java.util.Scanner;

/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual 
de reajuste. Calcular e escrever o valor do novo salário.*/

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioFuncionario, percentualReajuste, novoSalario;
		String nome;
		
		
		System.out.println("Digite o nome do funcionário");
		nome = sc.next();
		System.out.println("Digite o salário do peão: ");
		salarioFuncionario = sc.nextFloat();
		System.out.println("Digite o percentual de reajunste do salario");
		percentualReajuste = sc.nextFloat();
		
		novoSalario = salarioFuncionario * (percentualReajuste/100) + salarioFuncionario;
		
		System.out.printf("O novo salário do peão será de R$:%.2f%n ",novoSalario, nome);
		
		sc.close();
	}

}
