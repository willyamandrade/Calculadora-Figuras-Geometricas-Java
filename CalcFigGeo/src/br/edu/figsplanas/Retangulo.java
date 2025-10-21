package br.edu.figsplanas;

import java.util.Scanner;

public class Retangulo {
	private double base, altura, area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do retângulo: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do retângulo: ");
		base = sc.nextDouble();
	}
	
	public void recebeBase(double b) {
		base = b;
	}
	
	public void retornaAltura() {
		System.out.println("A altura do retângulo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do retângulo é: " + base);
	}
	
	public void retornaArea() {
		System.out.println("A área do retângulo é: " + area);
	}
	
	public void calcArea() {
		area = base*altura;
	}
	
	public void listaAtributos() {
		System.out.println("Área do retângulo: " + area);
		System.out.println("Base do retângulo: " + base);
		System.out.println("Altura do retângulo: " + altura);
		System.out.println("-------------------------------------------");
	}
}
