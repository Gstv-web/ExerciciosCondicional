package br.com.generation.condicionais;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
 	10-14 infantil
 	15-17 juvenil
 	18-25 adulto*/

public class Ex_Condicional03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Identificador de categoria");
		System.out.println("Digite a idade: ");
		idade = input.nextInt();
		
		if(idade < 10) {
			System.out.println("A idade mínima para participar é de 10 anos.");
		}
		else if(idade >= 10 && idade < 15) {
			System.out.println("Participante enquadrado na modalidade infantil.");
		}
		else if(idade >= 15 && idade < 18) {
			System.out.println("Participante enquandrado na modalidade juvenil.");
		}
		else if(idade >= 18 && idade < 26) {
			System.out.println("Participante enquadrado na modalidade adulto.");
		}
		else {
			System.out.println("A idade máxima permitida é de 25 anos.");
		}
		input.close();
	}

}
