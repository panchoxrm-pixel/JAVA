package com.cmc.repaso.entidades;

public class Item {
	
	public String nombre;
	public int productosActuales;
	public int productosDevueltos;
	public int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Productos actuales: " + productosActuales);
		System.out.println("Productos devueltos: " + productosDevueltos);
		System.out.println("Productos vendidos: " + productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		this.productosActuales = this.productosActuales - productosVendidos;
		this.productosVendidos = this.productosVendidos + productosVendidos;
	}
	
	public void devolver(int productosDevueltos) {
		this.productosActuales = this.productosActuales + productosDevueltos;
		this.productosVendidos = this.productosVendidos - productosDevueltos;
		this.productosDevueltos = this.productosDevueltos + productosDevueltos;
	}
	
}


