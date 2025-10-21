package br.edu.figsplanas;

import java.util.Scanner;

public class Pentagono {
	private double lado, apotema, area;
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do pentágono: ");
		lado = sc.nextDouble();
	}
	
	public void recebeLado(double l) {
		lado = l;
	}

	public void retornaLado() {
		System.out.println("O lado do pentágono é: " + lado);
	}

	public void recebeApotema() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do pentágono: ");
		apotema = sc.nextDouble();
	}
	
	public void recebeApotema(double a) {
		apotema = a;
	}

	public void retornaApotema() {
		System.out.println("O apótema do pentágono é: " + apotema);
	}
	
	public void retornaArea() {
		System.out.println("A área do pentágono é: " + area);
	}
	
	public void calcArea() {
		area = 5*lado*apotema;
	}
	
	public void listaAtributos() {
		System.out.println("Lado do pentágono: " + lado);
		System.out.println("Apótema do pentágono: " + apotema);
		System.out.println("Área do pentágono: " + area);
		System.out.println("-------------------------------------------");
	}
}
