package br.edu.figsplanas;

import java.util.Scanner;

public class Trapezio {
	public double baseMaior, baseMenor, altura, area;
	
	public void recebeBaseMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base maior do trapézio: ");
		baseMaior = sc.nextDouble();
	}
	
	public void recebeBaseMaior(double dmaior) {
		baseMaior = dmaior;
	}
	
	public void recebeBaseMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base menor do trapézio: ");
		baseMenor = sc.nextDouble();
	}
	
	public void recebeBaseMenor(double dmenor) {
		baseMenor = dmenor;
	}
	
	public void retornaBaseMaior() {
		System.out.println("A base maior do trapézio é: " + baseMaior);
	}
	
	public void retornaBaseMenor() {
		System.out.println("A base menor do trapézio é: " + baseMenor);
	}
	
	public void recebeAltura() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a altura do trapézio: ");
		altura = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void retornaAltura() {
		System.out.println("A altura do trapézio é: " + altura);
	}
	public void retornaArea() {
		System.out.println("A área do trapézio é: " + area);
	}
	
	public void calcArea() {
		area = ((baseMaior + baseMenor) * altura)/2;
	}
	
	public void listaAtributos() {
		System.out.println("Altura do trapézio: " + altura);
		System.out.println("Base menor do trapézio: " + baseMenor);
		System.out.println("Base maior do trapézio: " + baseMaior);
		System.out.println("Área do trapézio: " + area);
		System.out.println("-------------------------------------------");
	}
}
