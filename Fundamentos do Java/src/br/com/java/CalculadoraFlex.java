package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		// variáveis
		float abastecer, alcool, gasolina;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.print("Digite o valor do alcool: ");
		alcool = teclado.nextFloat();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextFloat();
		// Processamento
		abastecer = (gasolina / alcool);
		// Saida
		System.out.println("Abatecer: " + abastecer);
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abasteça alcool");
			
		} else {
			System.out.println("Abasteça gasolina");

		}

	}

}
