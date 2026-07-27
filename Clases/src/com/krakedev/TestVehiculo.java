package com.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();		
		
		v.setAnio("2021");
		v.setMarca("Chevrolet");
		v.setModelo("Captiva");
		
		System.out.println("=========Vehículo 1=========");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		

		Vehiculo v2 = new Vehiculo();
		
		v2.setAnio("2018");
		v2.setMarca("Kía");
		v2.setModelo("Sonet");
		
		System.out.println("=========Vehículo 2=========");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());

	}

}
