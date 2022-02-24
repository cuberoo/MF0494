/**
 * 
 */
package modelo;

import java.util.Objects;

/**
 * @author juanc
 *
 */
public class Infractor {
	
	String DNI;
	String Nombre;
	String Apellido;
	int Antiguedad;
	float Sancion;
	int Puntos;
	
	public Infractor(){
		DNI = "";
		Nombre = "";
		Apellido = "";
	}

	public Infractor(String dni, String nombre, String apellido, int antiguedad, float sancion, int puntos ) {
		this.DNI = dni;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Antiguedad = antiguedad;
		this.Sancion = sancion;
		this.Puntos = puntos;
	}

	/**
	 * @return el dNI
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * @param dNI el dNI a establecer
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	/**
	 * @return el apellido
	 */
	public String getApellido() {
		return Apellido;
	}

	/**
	 * @param apellido el apellido a establecer
	 */
	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	/**
	 * @return el antiguedad
	 */
	public int getAntiguedad() {
		return Antiguedad;
	}

	/**
	 * @param antiguedad el antiguedad a establecer
	 */
	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}

	/**
	 * @return el sancion
	 */
	public float getSancion() {
		return Sancion;
	}

	/**
	 * @param sancion el sancion a establecer
	 */
	public void setSancion(float sancion) {
		Sancion = sancion;
	}

	/**
	 * @return el puntos
	 */
	public int getPuntos() {
		return Puntos;
	}

	/**
	 * @param puntos el puntos a establecer
	 */
	public void setPuntos(int puntos) {
		Puntos = puntos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DNI);
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infractor other = (Infractor) obj;
		return Objects.equals(DNI, other.DNI);
	}

	@Override
	public String toString() {
		return "Infractores [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Antiguedad="
				+ Antiguedad + ", Sancion=" + Sancion + ", Puntos=" + Puntos + "]";
	}
	
	
}
