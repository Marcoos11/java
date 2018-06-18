package br.com.java;

public class Agenda {

	public static void main(String[] args) {
			String [][] agenda = {{"Bill Gates", "1111-1111","billgates@outlook.com"},
			{"Linus Torvalds","2222-2222","linus@gmail.com"},{"Steve Jobs","3333-3333",
			"steve@icloud.com"}};
			//recuperando o email do Linus Torvalds
			//System.out.println(agenda[1][2]);
			//alterando o telefone do bill gates
			//agenda[0][1] = "9999-9999";
				System.out.println("alterando telefone de bill gates para: " + agenda [0][1]);
				for (int i = 0; i < agenda[i].length; i++ ) {
				System.out.println("_________________________");
				for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda [i][j]);	
				}
			}

	}

}
