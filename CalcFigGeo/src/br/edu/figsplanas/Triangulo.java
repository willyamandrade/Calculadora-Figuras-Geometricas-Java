package br.edu.figsplanas;

import java.util.Scanner;

public class Triangulo {
	private double base, altura, area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do triângulo: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base do triângulo: ");
		base = sc.nextDouble();
	}
	
	public void recebeBase(double b) {
		base = b;
	}
	
	public void retornaAltura() {
		System.out.println("A altura do triângulo é: " + altura);
	}
	
	public void retornaBase() {
		System.out.println("A base do triângulo é: " + base);
	}
	
	public void retornaArea() {
		System.out.println("A área do triângulo é: " + area);
	}
	public void calcArea() {
		area = (base*altura)/2;
	}
	
	public void listaAtributos() {
		System.out.println("Área do triângulo: " + area);
		System.out.println("Base do triângulo: " + base);
		System.out.println("Altura do triângulo: " + altura);
		System.out.println("-------------------------------------------");
	}
}
