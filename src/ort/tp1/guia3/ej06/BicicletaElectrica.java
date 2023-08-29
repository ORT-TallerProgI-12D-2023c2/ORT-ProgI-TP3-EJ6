package ort.tp1.guia3.ej06;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class BicicletaElectrica extends Bicicleta {

	private static final int MAX_POT = 250;
	private int potencia;

	public BicicletaElectrica(String marca, String modelo, int cantKms, int potencia) {
		super(marca, modelo, cantKms);
		this.potencia = potencia;
	}

	public boolean cumpleRequisitos() {
		// Punto B)
		// return potencia <= MAX_POT;
		// Punto C)
		return super.cumpleRequisitos() && potencia <= MAX_POT;
	}

}