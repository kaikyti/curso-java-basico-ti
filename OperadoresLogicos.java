package com.kaiky.cursojava.aula13;

public class OperadoresLogicos {


	public static void main(String[] args) {
		
		int valoe1 = 1;
		int valor2 = 2;
		
		
		boolean resultado1 = (valoe1 == 1) && (valor2 == 2);
		System.out.println("vaor1 é 1 AND valor2 é 2 - resultado " + resultado1);
		
		boolean resultado2 = (valoe1 == 1) || (valor2 == 2);
		System.out.println("vaor1 é 1 OR valor2 é 2 - resultado " + resultado2);
		
		boolean verdadeiro = true; 
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
	}

}
