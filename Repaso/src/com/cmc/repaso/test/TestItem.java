package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		System.out.println("-----------Ítem 1-----------");
		
		Item i1 = new Item();
		i1.productosActuales = 20;
		i1.imprimir();
		i1.vender(12);
		i1.devolver(5);
		i1.imprimir();
		
		System.out.println("-----------Ítem 2-----------");
		
		Item i2 = new Item();
		i2.productosActuales = 100;
		i2.imprimir();
		i2.vender(40);
		i2.devolver(10);
		i2.imprimir();
	}

}
