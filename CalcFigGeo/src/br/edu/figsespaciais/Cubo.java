package br.edu.figsespaciais;

import java.util.Scanner;

public class Cubo {
	private double a, areaSuperficie, volume;
	
	public void recebeLado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado do cubo: ");
		a = sc.nextDouble();
	}
	
	public void recebeLado(double l) {
		a = l;
	}
	
	public void retornaLado() {
		System.out.println("O lado do cubo é: " + a);
	}
	
	public void retornaAreaSuperficie() {
		System.out.println("A área da superfície do cubo é: " + areaSuperficie);
	}
	
	public void retornaVolume() {
		System.out.println("O volume do cubo é: " + volume);
	}
	public void calcAreaSuperficie() {
		areaSuperficie = 6 * Math.pow(a, 2);
	}
	
	public void calcVolume() {
		volume = Math.pow(a, 3);
	}	
	
	public void listaAtributos() {
		System.out.println("O lado do cubo é: " + a);
		System.out.println("A área da superfície do cubo é: " + areaSuperficie);
		System.out.println("O volume do cubo é: " + volume);
		System.out.println("-------------------------------------------");
	}
	
}
