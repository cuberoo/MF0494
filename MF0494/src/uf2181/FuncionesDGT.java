/**
 * 
 */
package uf2181;

/**
 * @author Juan Carlos Cubero
 *
 */
public class FuncionesDGT {
	
	/**
	 * la funcion mediaPuntos que calcula la media de los elementos que estan almacenados en el vector
	 * @param puntos el vector al que se le hara la media
	 * @param suma es un int donde se almacena el resultado de la suma de los componenetes del vector
	 * @return devuelve la media realizada de los componentes del vector
	 */

	public double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	
	
	/**
	 * esta funcion comprueba la tasa maxima permitida medido tanto en arie como en sangre
	 * @param tipoConductor un string que demuestra que clase de conductor es, puede ser novel o general
	 * @param aire un booleano que indica si la muestra se quiere en aire o no
	 * @return se devuelve la tasa maxima permitida para el conductor
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
