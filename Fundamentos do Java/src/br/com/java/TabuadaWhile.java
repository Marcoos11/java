package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int i = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("________TABUADA________");
		System.out.println("");
		System.out.print("Digite o valor da tabuada: ");
		valor = teclado.nextInt();
		System.out.println();
		while (i < 11) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
			i++;
		}
			
	}		
}	     
	
	
	  
		
   
	


