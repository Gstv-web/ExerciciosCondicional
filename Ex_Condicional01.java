package br.com.generation.condicionais;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class Ex_Condicional01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, maior = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		System.out.println("Os números digitados foram: " + n1 + ", " + n2 + ", " + n3 + ".");
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		else {
			maior = n3;
		}
		
		System.out.println("O maior número digitado foi " + maior + ".");
		
		input.close();
	}

}
