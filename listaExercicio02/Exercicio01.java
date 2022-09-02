package listaExercicio02;

//1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva
//a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, dias, diasVividos;
		
		System.out.println("Digite quantos anos completos você tem: ");
		idadeAnos = sc.nextInt();
		System.out.println("Digite quantos meses passara dps do seu ultimos aniversário: ");
		idadeMeses = sc.nextInt();
		System.out.println("Digite quantos dias passaram dps do seu ultimo mesversário: ");
		dias = sc.nextInt();
		
		diasVividos = (idadeAnos * 365) + (idadeMeses * 30) + dias;
		
		System.out.println("Você tem: " + diasVividos + " dias vividos");
		
		sc.close();
	}

}
