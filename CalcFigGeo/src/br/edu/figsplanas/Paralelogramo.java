package br.edu.figsplanas;

import java.util.Scanner;

public class Paralelogramo {
	private double base, altura, area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do paralelogramo: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do paralelogramo: ");
		base = sc.nextDouble();
	}
	
	public void recebeBase(double b) {
		base = b;
	}
	
	public void retornaAltura() {
		System.out.println("A altura do paralelogramo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do paralelogramo é: " + base);
	}
	
	public void retornaArea() {
		System.out.println("A área do paralelogramo é: " + area);
	}

	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("Base do paralelogramo: " + base);
		System.out.println("Altura do paralelogramo: " + altura);
		System.out.println("Área do paralelogramo: " + area);
		System.out.println("-------------------------------------------");
	}
}
