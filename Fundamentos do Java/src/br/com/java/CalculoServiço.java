package br.com.java;

import java.util.Scanner;

public class CalculoServi�o {

	public static void main(String[] args) {
		//Calcular S�lario
		double renumeracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Calculadora de servi�os");
		System.out.println("");
		//Entrada
		System.out.println("Renumera��o de custo: ");
		renumeracao = teclado.nextDouble();
		//Processamento
		System.out.println("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (renumeracao + (renumeracao *0.3) + custo + (renumeracao * 0.2)) / horas;
		System.out.println("Valor da hora de servi�o: " + servico);
		System.out.println("");
		System.out.println("Estimativa de horas deste servi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado deste cliente: " + total);
		
		

	}

}
