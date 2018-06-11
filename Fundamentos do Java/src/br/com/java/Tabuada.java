package br.com.java;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("________TABUADA________");
		System.out.println("");
		System.out.print("Digite o valor da tabuada: ");
		valor = teclado.nextInt();
		System.out.println();
		for (int i = 1; i < 11; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
			
		}

	}

}
