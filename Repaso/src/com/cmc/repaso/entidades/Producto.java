package com.cmc.repaso.entidades;

public class Producto {
	
	private String nombre;
	private double precio;	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		
		if(precio >= 0) {
			this.precio = precio;
		}else {
			this.precio = precio * -1;
		}
	}	
	
	public double calcularPrecioPromo(int porcentajeDescuento) {
		
		double valorDescuento = (precio * porcentajeDescuento) / 100;
		double precioConDescuento = precio - valorDescuento;
		return precioConDescuento;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		setPrecio(precio);
	}

}
