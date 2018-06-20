package br.com.java;

import java.util.Scanner;

public class ConversaoMinuto {

	public static void main(String[] args) {
		double segundos, horas;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversor segundos para horas");
		System.out.println("");
		System.out.print("Digite os segundos: ");
		segundos = teclado.nextDouble();
		//Processamento
		horas = ((segundos / 60) / 60);
		System.out.println("Resultado: " + horas + " Em Horas");
		
		
		
	}

}
