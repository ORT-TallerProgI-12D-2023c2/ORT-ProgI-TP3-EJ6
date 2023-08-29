package ort.tp1.guia3.ej06;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		Taller t = new Taller();
		
		ArrayList<Bicicleta> lista = new ArrayList<>();
		
		lista.add( new BicicletaElectrica("Tesla", "T-1000", 5000, 300) );
		lista.add( new Bicicleta("Pepo", "PAB", 1500) );
		lista.add( new BicicletaElectrica("Tesla", "T-800", 2500, 180) );
		lista.add( new Bicicleta("Pepo", "PAB", 3000) );
		
		System.out.println( t.cantServiciosPosibles(lista) );
	}

}