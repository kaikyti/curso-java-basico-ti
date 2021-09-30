package com.kaiky.cursojava.meusexercicios;

import java.util.Scanner;

public class Treinamento {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o seu peso");
		double peso = scan.nextDouble();
		System.out.println("Seu peso é: " + peso);
		
		System.out.println("Digite sua altura");
		int Altura = scan.nextInt();
		System.out.println("Sua idade é " + Altura);
		
		System.out.println("Digite a quantidade de irmãs");
		byte qtdIrmã = scan.nextByte();
		System.out.println("Qtd de irmã " + qtdIrmã);
	}

}
