/**
 * Atividade de avaliação - Churrascoladora
 * @author Marcos Vinicius, Leandro Oliveira
 */

package br.com.java;

import java.util.Scanner;

public class Churrascoladora {

	public static void main(String[] args) {
		//variáveis
		int homens, mulheres, criancas;
		
		double carne, dinheiro, kg, cervejat, LatasCerveja, cerveja, refrit, LatasRefri, refri, total, dinheiro1, pessoa;  
		Scanner teclado = new Scanner(System.in);
		//Entrada
		System.out.println("====CHURRASCOLADORA====");
		System.out.println("Quantidade de homens: ");
		homens = teclado.nextInt();
		System.out.println("Quantidade de mulheres: ");
		mulheres = teclado.nextInt();
		System.out.println("Quantidade de crianças: ");
		criancas = teclado.nextInt();
		System.out.println("Preço médio do Kg da Carne: ");
		carne = teclado.nextDouble();
		System.out.println("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.println("Preço médio da lata de refri: ");
		refri = teclado.nextDouble();		
		//Processamento
		//Carnes 
		dinheiro1 = (homens * 13.13) + (mulheres * 13.13) + (criancas * 11.25);
		kg = (homens * 0.1) + (mulheres * 0.1) + (criancas * 0.08);
		//Cerveja
		cervejat = (homens * 12 * cerveja) + (mulheres * 4 * cerveja);
		LatasCerveja = (homens * 12) + (mulheres * 4);
		//Refri
		refrit = (mulheres * 2 * refri) + (criancas * 2 * refri);
		LatasRefri = (mulheres * 2) + (criancas * 2);
		//total
		total = (dinheiro1 + LatasCerveja + LatasRefri);
		//Pessoas
		pessoa = total / (homens + mulheres + criancas);
		//Saída
		System.out.println("");
		System.out.println("_____________________");
		System.out.println("Lista de compras");
		//exibir quantidade e preço
		System.out.println("Quantidade total de carne: " + dinheiro1 + "kg: " + kg);
		System.out.println("Quantidade total de cerveja: " + cervejat + "latinhas: " + LatasCerveja);
		System.out.println("Quantidade total de refri: " + refrit + "latinhas: " + LatasRefri);
		System.out.println("");
		System.out.println("______________________");
		System.out.println("Valor total do churras: " + total);
		System.out.println("Valor por Pessoa: " + pessoa);
	}

}
