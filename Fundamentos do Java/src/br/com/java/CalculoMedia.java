package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// a linha a baixo cria vari�veis do tipo real
		float nota1, nota2, media;
		// entrada
		System.out.print("Digite a nota1: ");
		// a linha abaixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar oque foi
		// digitado no console e armazenar na vari�vel nota1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1+nota2) / 2;
		//saida
		// + concatena(junta) um texto com o conte�do da vari�vel media
		System.out.println("M�dia final:" + media);

	}

}
