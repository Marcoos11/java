package br.com.java;

import java.util.Scanner;

public class OperadoresAritm�ticos {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Operadores Aritm�ticos");
		System.out.print("Digite o valor de x: ");
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		System.out.print("x + y = " + (x + y));
		// Subtra��o
		System.out.print("x - y = " + (x + y));
		// Divis�o
		System.out.print("x / y = " + (x / y));
		// Multiplica��o
		System.out.print("x * y = " + (x * y));
		// M�dulo (usado para obter o resto da divis�o)
		System.out.print("x % y = " + (x % y));
		// Incremento x++ ( equivale a x = x - 1)
		x++;
		System.out.print("x++ " + x);
		//Decremento y-- ( equivale a y = y - 1)
		y--;
		System.out.print("y-- " + y);
		
		

	}

}
