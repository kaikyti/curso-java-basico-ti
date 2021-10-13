package com.kaiky.cursojava.aula17.lebs;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		
		do {
		
		System.out.println("Entre com o nome do usuário");
		String nomeUser = scan.next();
		
		System.out.println("Entre com a senha:");
		String senha = scan.next();
		
		if (nomeUser.equalsIgnoreCase(senha)) {
			infoValidas = false;
			System.out.println("Senha igual a usuario, digite novamente.");
		} else {
			infoValidas = true;
			System.out.println("Senha e usuarios validos.");
		}

	    } while (!infoValidas);
	}
}
