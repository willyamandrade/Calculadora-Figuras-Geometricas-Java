package br.edu.figsplanas;

import java.util.Scanner;

public class Hexagono {
	public double area, lado; 
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do hexágono: ");
		lado = sc.nextDouble();
	}
	
	public void recebeLado(double l) {
		lado = l;
	}

	public void retornaLado() {
		System.out.println("O lado do hexágono é: " + lado);
	}
	
	public void retornaArea() {
		System.out.println("A área do hexágono é: " + area);
	}
	
	public void calcArea() {
		area = (3 * Math.pow(lado, 2) * Math.sqrt(3)) / 2;
	}
	
	public void listaAtributos() {
		System.out.println("Lado do hexágono: " + lado);
		System.out.println("Área do hexágono: " + area);
		System.out.println("-------------------------------------------");
	}
}
