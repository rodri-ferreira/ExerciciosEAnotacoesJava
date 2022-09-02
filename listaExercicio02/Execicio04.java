package listaExercicio02;

import java.util.Scanner;

/*4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem 
do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual 
do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo 
de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/

public class Execicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float custoFabrica, imposto, distribuidora, valorFinal;
		
		System.out.println("Digite o valor do custo de produção do carro");
		custoFabrica = sc.nextFloat();
	
		imposto = (custoFabrica * 45/100);
		distribuidora = (custoFabrica * 28/100);
		valorFinal = custoFabrica + distribuidora + imposto;
		
		System.out.printf("O carro vai sair por R$%.2f%n ",valorFinal);
		
		sc.close();
	}

}
