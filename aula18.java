package com.kaiky.cursojava.aula15.lebs;

import java.util.Scanner;

public class aula18 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
		
	
	}

}
