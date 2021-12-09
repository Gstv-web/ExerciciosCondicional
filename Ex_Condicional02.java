package br.com.generation.condicionais;

//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Ex_Condicional02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		
		System.out.println("Os números digitados foram: " + n1 + ", " + n2 + ", " + n3 + ".\n" );
		if(n1 <= n2 && n2 <= n3) {
				System.out.println("Os números ordenados ficam: " + n1 + ", " + n2 + ", " + n3 + ".");
		}
		else if(n3 <= n2 && n1 <= n3) {
				System.out.println("Os números ordenados ficam: " + n1 + ", " + n3 + ", " + n2 + ".");
		}
		else if(n2 <= n1 && n1 <= n3) {
				System.out.println("Os números ordenados ficam: " + n2 + ", " + n1 + ", " + n3 + ".");
		}
		else if(n2 <= n3 && n3 <= n1) {
				System.out.println("Os números ordenados ficam: " + n2 + ", " + n3 + ", " + n1 + ".");
		}
		else if(n3 <= n1 && n1 <= n2) {
				System.out.println("Os números ordenados ficam: " + n3 + ", " + n1 + ", " + n2 + ".");
		}
		else if(n3 <= n2 && n2 <= n1) {
			System.out.println("Os números ordenados ficam: " + n3 + ", " + n2 + ", " + n1 + ".");
		}
		
		
		input.close();
			
		
	}
}
