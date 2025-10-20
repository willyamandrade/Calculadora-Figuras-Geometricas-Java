package br.edu.principal;

import br.edu.figsplanas.*;

import br.edu.figsespaciais.*;

public class Principal {

	public static void main(String[] args) {
		Trapezio obj1 = new Trapezio();
		
		obj1.recebeBaseMaior(3);
		obj1.recebeBaseMenor(2);
		obj1.recebeAltura(7);
		obj1.calcArea();
		obj1.listaAtributos();
		
		/*
		Cubo obj2 = new Cubo();
	
		obj2.recebeLado();
		obj2.calcAreaSuperficie();
		obj2.calcVolume();
		obj2.listaAtributos();
		*/
	}
}
