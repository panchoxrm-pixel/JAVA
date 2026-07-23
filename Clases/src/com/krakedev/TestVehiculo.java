package com.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();		
		
		v.anio = "2021";
		v.marca = "Chevrolet";
		v.modelo = "Captiva";
		
		System.out.println("=========Vehículo 1=========");
		
		System.out.println("Año: " + v.anio);
		System.out.println("Marca: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		

		Vehiculo v2 = new Vehiculo();
		
		v2.anio = "2018";
		v2.marca = "Kía";
		v2.modelo = "Sonet";
		
		System.out.println("=========Vehículo 2=========");
		
		System.out.println("Año: " + v2.anio);
		System.out.println("Marca: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);

	}

}
