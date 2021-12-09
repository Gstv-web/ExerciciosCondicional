package br.com.generation.condicionais;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
  número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
  ímpar exiba o número elevado ao quadrado.*/

public class Ex_Condicional04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numero, raiz, potencia;
		
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		raiz = Math.sqrt(numero);
		potencia = Math.pow(numero, 2);
		
		if(numero % 2 == 0) {
			System.out.println(numero + " é par e sua raiz quadrada é " + raiz);
		}
		else {
			System.out.println(numero + " é ímpar e seu valor elevado ao quadrado é " + potencia);
		}
		
		input.close();
	}
}
