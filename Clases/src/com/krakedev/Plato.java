package com.krakedev;

public class Plato {

	public String nombre;
	public String tipo;
	public double precio;
	public boolean disponible;
	
	public Plato(String nombre, String tipo, double precio, boolean disponible) {
	    this.nombre = nombre;
	    this.tipo = tipo;
	    this.precio = precio;
	    this.disponible = disponible;
	}
	
	public Plato() {} // Constructor vacío opcional.
	
}