package br.edu.figsplanas;

import java.util.Scanner;

public class Circulo {
	public double raio, area;
	
	public void recebeRaio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio do círculo: ");
		raio = sc.nextDouble();
	}
	
	public void recebeRaio(double r) {
		raio = r;
	}
	
	public void retornaRaio() {
		System.out.println("A raio do círculo é: " + raio);
	}
	
	public void retornaArea() {
		System.out.println("A área do círculo é: " + area);
	}
	
	public void calcArea() {
		area = Math.PI * Math.pow(raio, 2);
	}
	
	public void listaAtributos() {
		System.out.println("Área do círculo: " + area);
		System.out.println("Raio do círculo: " + raio);
		System.out.println("-------------------------------------------");
	}
}
