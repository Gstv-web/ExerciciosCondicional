package br.com.generation.condicionais;

//Fa?a um programa que entre com tr?s n?meros e coloque em ordem crescente.

import java.util.Scanner;

public class Ex_Condicional02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n?mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n?mero: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro n?mero: ");
		n3 = input.nextInt();
		
		
		System.out.println("Os n?meros digitados foram: " + n1 + ", " + n2 + ", " + n3 + ".\n" );
		if(n1 <= n2 && n2 <= n3) {
				System.out.println("Os n?meros ordenados ficam: " + n1 + ", " + n2 + ", " + n3 + ".");
		}
		else if(n3 <= n2 && n1 <= n3) {
				System.out.println("Os n?meros ordenados ficam: " + n1 + ", " + n3 + ", " + n2 + ".");
		}
		else if(n2 <= n1 && n1 <= n3) {
				System.out.println("Os n?meros ordenados ficam: " + n2 + ", " + n1 + ", " + n3 + ".");
		}
		else if(n2 <= n3 && n3 <= n1) {
				System.out.println("Os n?meros ordenados ficam: " + n2 + ", " + n3 + ", " + n1 + ".");
		}
		else if(n3 <= n1 && n1 <= n2) {
				System.out.println("Os n?meros ordenados ficam: " + n3 + ", " + n1 + ", " + n2 + ".");
		}
		else if(n3 <= n2 && n2 <= n1) {
			System.out.println("Os n?meros ordenados ficam: " + n3 + ", " + n2 + ", " + n1 + ".");
		}
		
		
		input.close();
			
		
	}
}
