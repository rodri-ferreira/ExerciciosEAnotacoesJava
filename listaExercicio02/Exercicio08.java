package listaExercicio02;

/*8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, 
utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário 
deve fornecer o tempo gasto*/

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float tempo, velocidade,kmPercorridos, litrosCombustivel;
		
		
		System.out.println("Digite quanto tempo a sua viagem durou");
		tempo = sc.nextFloat();
		System.out.println("Digite a velocidade média da sua viagem");
		velocidade = sc.nextFloat();
		kmPercorridos = tempo*velocidade;
		litrosCombustivel = kmPercorridos/12;
		
		System.out.printf("A quantidade de litros de gasolina que você gastou é: %.2f%n",litrosCombustivel);
		System.out.println("A quantidade de quilometros percorridos: " + kmPercorridos);
		System.out.println("A velocidade média: "+ velocidade);
		System.out.println("Tempo: " + tempo);
	
		sc.close();
	}

}
