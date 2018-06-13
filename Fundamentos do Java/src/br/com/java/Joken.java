package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class Joken {

	public static void main(String[] args) {
		int jogador, maquina;
		Scanner teclado = new Scanner(System.in);
		System.out.println("-----JokenPo------");
		System.out.println("==================");
		System.out.println("");
		System.out.println("Escolha entre Pedra, Papel e Tesoura: ");
		System.out.println("======================================");
		System.out.println("1: Pedra");
		System.out.println("2: Papel");
		System.out.println("3: Tesoura");
		System.out.println("============");
		// processamento
		System.out.println("jogador: ");
		jogador = teclado.nextInt();

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:// caso nenhuma op��o selecionada
			System.out.println("Op��o inv�lida");
			System.out.println("");
			break;
		}
		// l�gica do computador
		// criar uma vari�vel que recebe um valor aleat�rio (1,2,3)

		// l�gica para determinar o vencedor
		Random mao = new Random();
		int computador = mao.nextInt(3) + 1;

		switch (computador) {
		case 1:
			System.out.println("Computador jogou Pedra");
			break;
		case 2:
			System.out.println("Computador jogou Papel");
			break;
		case 3:
			System.out.println("Computador jogou Tesoura");
			break;
		}
		// decis�o de quem vence
		if ((jogador == 1 && computador == 1) || (jogador == 2 && computador == 2)
				|| (jogador == 3 && computador == 3)) {
			System.out.println("empate");
		} else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
				|| (jogador == 3 && computador == 2)) {
			System.out.println("Jogador venceu");
		} else if ((computador == 1 && jogador == 3) || (computador == 2 && jogador == 1)
				|| (computador == 3 && jogador == 2)) {
			System.out.println("Computador vence");

		}

	}
}
