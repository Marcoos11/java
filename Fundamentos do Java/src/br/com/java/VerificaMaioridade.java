package br.com.java;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		idade = teclado.nextInt();
		System.out.println("");
		System.out.println("______________________");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		// Verificação de idade +18
		if (idade < 18) {
			System.out.println("Menor de idade");
			
		} else {
			System.out.println("Maior de idade");

		}
		

	}

}
