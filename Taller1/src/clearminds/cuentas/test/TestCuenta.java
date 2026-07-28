package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(1892);
		
		Cuenta cuenta2 = new Cuenta("03444", "B", 980);
		
		Cuenta cuenta3 = new Cuenta("03445");
		cuenta3.setTipo("A");

		Cuenta cuenta4 = new Cuenta("23456");
		cuenta4.setSaldo(8600);
		cuenta4.setTipo("C");
		
		Cuenta cuenta5 = new Cuenta("49034", "A", 7805);
				
		Cuenta cuenta6 = new Cuenta("22663");
		cuenta6.setSaldo(3333);
		
		
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		cuenta4.imprimir();
		cuenta5.imprimir();
		cuenta6.imprimir();
		
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
