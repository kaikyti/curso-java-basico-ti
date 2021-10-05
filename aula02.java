package com.kaiky.cursojava.aula15.lebs;

import java.util.Scanner;

public class aula02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int num = scan.nextInt();
		
		if (num >=0) {
			System.out.println("O numero informado é positivo");
		} else {
			System.out.println("O numero informado é negativo");
		}

	}

}
