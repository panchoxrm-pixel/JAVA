package clearminds.cuentas;

public class Cuenta {
	
	private String id;
	private String tipo;
	private double saldo;
	
	public String getId() {
		return id;
	}	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	public void imprimir() {
		System.out.println(	
				"************************\n" +
				"         CUENTA          " + "\n" +
				"************************\n" +					
				"Número de Cuenta: " + id + "\n" +
				"Tipo: " + tipo + "\n" +
				"Saldo: $ " + saldo + "\n" +
				"************************"
				);
	}
		
	public void imprimirConMiEstilo() {
		System.out.println(
				"=========================\n" +
				"         CUENTA          " + "\n" +
				"=========================\n" +					
				"Número de cuenta: " + id + "\n" +
				"Tipo: de cuenta" + tipo + "\n" +
				"Saldo disponible: $ " + saldo + "\n" +
				"========================="
				);
	}	
	
	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}
		
	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
}
