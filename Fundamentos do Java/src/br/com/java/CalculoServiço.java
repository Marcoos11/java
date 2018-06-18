package br.com.java;

import java.util.Scanner;

public class CalculoServiço {

	public static void main(String[] args) {
		//Calcular Sálario
		double renumeracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Calculadora de serviços");
		System.out.println("");
		//Entrada
		System.out.println("Renumeração de custo: ");
		renumeracao = teclado.nextDouble();
		//Processamento
		System.out.println("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.println("Carga horária mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (renumeracao + (renumeracao *0.3) + custo + (renumeracao * 0.2)) / horas;
		System.out.println("Valor da hora de serviço: " + servico);
		System.out.println("");
		System.out.println("Estimativa de horas deste serviço: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado deste cliente: " + total);
		
		

	}

}
