package ort.tp1.guia3.ej06;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Bicicleta {

	private static final int MAX_KMS = 2000;
	private String marca;
	private String modelo;
	private int cantKms;

	public Bicicleta(String marca, String modelo, int cantKms) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cantKms = cantKms;
	}

	public boolean cumpleRequisitos() {
		return this.cantKms <= MAX_KMS;
	}
	

}