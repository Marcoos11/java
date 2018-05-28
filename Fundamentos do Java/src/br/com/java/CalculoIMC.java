package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// a linha abaixo cria variáveis numéricas de precisão
		// float e double são tipos primitivos numéricos
		double peso,altura,imc;
		// entrada
		System.out.print("Digite o seu peso em kg: ");
		// a linha de baixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar oque foi
		// digitado no console e armazenar na variável peso
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		//processamento
		 imc = peso/(altura * altura);
		 // saida
		 // o * multiplica a altura pela altura
		  System.out.println("resultado de imc:" + imc);
	}

}
