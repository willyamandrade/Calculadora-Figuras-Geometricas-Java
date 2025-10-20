package br.edu.figsplanas;

import java.util.Scanner;

public class Quadrado {
	public double lado, area;
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		lado = sc.nextDouble();
	}
	
	public void recebeLado(double l) {
		lado = l;
	}

	public void retornaLado() {
		System.out.println("O lado do quadrado é: " + lado);
	}
	
	public void retornaArea() {
		System.out.println("A área do quadrado é: " + area);
	}
	
	public void calcArea() {
		area = lado * lado;
	}
	
	public void listaAtributos() {
		System.out.println("Lado do quadrado: " + lado);
		System.out.println("Área do quadrado: " + area);
		System.out.println("-------------------------------------------");
	}
}
