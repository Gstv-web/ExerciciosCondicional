package br.com.generation.condicionais;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
public class Ex_Condicional01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = input.nextInt();
		
		System.out.println("Os n�meros digitados foram: " + n1 + ", " + n2 + ", " + n3 + ".");
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		
		System.out.println("O maior n�mero digitado foi " + maior + ".");
		
		input.close();
	}

}
