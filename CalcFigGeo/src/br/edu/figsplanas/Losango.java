package br.edu.figsplanas;

import java.util.Scanner;

public class Losango {
	private double diamMaior, diamMenor, area;
	
	public void recebeDiametroMaior() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o diâmetro maior do losango: ");
		diamMaior = sc.nextDouble();
	}
	
	public void recebeDiametroMaior(double dmaior) {
		diamMaior = dmaior;
	}
	
	public void recebeDiametroMenor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o diâmetro menor do losango: ");
		diamMenor = sc.nextDouble();
	}
	
	public void recebeDiametroMenor(double dmenor) {
		diamMenor = dmenor;
	}
	
	public void retornaDiametroMaior() {
		System.out.println("O diâmetro maior do losango é: " + diamMaior);
	}
	
	public void retornaDiametroMenor() {
		System.out.println("O diâmetro menor do losango é: " + diamMenor);
	}
	
	public void retornaArea() {
		System.out.println("A área do losango é: " + area);
	}
	
	public void calcArea() {
		area = (diamMaior + diamMenor)/2;
	}
	
	public void listaAtributos() {
		System.out.println("Diâmetro menor do losango: " + diamMenor);
		System.out.println("Diâmetro maior do losango: " + diamMaior);
		System.out.println("Área do losango: " + area);
		System.out.println("-------------------------------------------");
	}
}
