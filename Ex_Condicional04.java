package br.com.generation.condicionais;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
  n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
  �mpar exiba o n�mero elevado ao quadrado.*/

public class Ex_Condicional04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numero, raiz, potencia;
		
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		raiz = Math.sqrt(numero);
		potencia = Math.pow(numero, 2);
		
		if(numero % 2 == 0) {
			System.out.println(numero + " � par e sua raiz quadrada � " + raiz);
		}
		else {
			System.out.println(numero + " � �mpar e seu valor elevado ao quadrado � " + potencia);
		}
		
		input.close();
	}
}
