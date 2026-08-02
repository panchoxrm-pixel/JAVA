package com.krakedev.test;

import com.krakedev.Vehiculo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo("2021", "Chevrolet", "Captiva");				
		
		System.out.println("=========Vehículo 1=========");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		

		Vehiculo v2 = new Vehiculo("2018", "Kía", "Sonet");
		
		System.out.println("=========Vehículo 2=========");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());

	}

}
