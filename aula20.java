package com.kaiky.cursojava.aula15.lebs;

import java.util.Scanner;

public class aula20 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vitima?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da vitima?");
		String resp3 = scan.next();
		
		System.out.println("Devia para a vitima?");
		String resp4 = scan.next();
		
		System.out.println("Ja trabalhou com a vitima?");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp2.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp3.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp4.equalsIgnoreCase("S")) {
			cont++;
		}
		if (resp5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita");
		} else if (cont == 3 || cont == 4) {
			System.out.println("Cumplice");
		} else if (cont == 5 ) {
			System.out.println("Assassino");
		} else if (cont == 0) {
			System.out.println("Inocente");
		}
		

	}

}
