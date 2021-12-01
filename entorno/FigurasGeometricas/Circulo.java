package FigurasGeometricas;

import java.util.Objects;

public class Circulo {
	double radio;
	double area;
	double longitud;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @author ikaslea
	 * 
	 *         contructor vacio
	 */
	public Circulo() {
		
		setRadio(1.0);
		// Constructor clase Circulo
		/*
		 * comentarios de bloques
		 */
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, radio);
	}

	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	public Circulo(double radioInicial) {
		setRadio(radioInicial);
		setArea(Math.PI * radioInicial * radioInicial);
		setLongitud(2.0 * Math.PI * radioInicial);

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" + area + ", longitud=" + longitud + "]";
	}

}
