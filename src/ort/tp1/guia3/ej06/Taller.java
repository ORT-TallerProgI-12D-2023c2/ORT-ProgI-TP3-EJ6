package ort.tp1.guia3.ej06;

import java.util.ArrayList;
import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Taller {

	public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {
		int cont = 0;
		for (Bicicleta bicicleta : bicis) {
			if (bicicleta.cumpleRequisitos()) {
				cont++;				
			}
		}
		return cont;
	}

}