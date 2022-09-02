
package listaExercicio01;

import java.util.Scanner;

public class Antecessor {
	
	//01) Solicite um valor e retorne seu numero antecessor
	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero01= sc.nextInt();
		int antecessor = numero01-1;
		System.out.println("O número antecessor é: "+antecessor);
		
		
		
		sc.close();
	}
}
	
	