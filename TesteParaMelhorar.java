package com.kaiky.cursojava.aula13;

import java.util.Scanner;

public class TesteParaMelhorar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("A sua idade é " + idade);
		
		System.out.println("Digite primeiroNome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiroNome " + primeiroNome);
		
		System.out.println("Digite quantos cachorro:");
		int qntsCachorro = scan.nextInt();
		System.out.println("Qtd cachorro " + qntsCachorro);
		

	}

}
