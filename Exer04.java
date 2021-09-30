package com.kaiky.cursojava.aula13;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double nota4 = scan.nextDouble();
		
		double resultado = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("A soma das suas notas é " + resultado);
		
		
		

	}

}
