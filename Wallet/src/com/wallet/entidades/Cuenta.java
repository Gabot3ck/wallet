package com.wallet.entidades;


public class Cuenta {
	private int numeroCuenta;
	private String titular;
	private double saldo;

	
	//constructor por defecto
	public Cuenta() {
		this.numeroCuenta = 0;
		this.titular="";
		this.saldo = 0.0;
	}
	
	public Cuenta(int numeroCuenta, String titular, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//metodo para mostrar info de la cuenta
	public void mostrarInformacion(){
		System.out.println("Numero de cuenta:  " + numeroCuenta);
		System.out.println("Titular : " + titular);
		System.out.println("Saldo: " + saldo);
	}
	
	// Hacer depósitos a la cuenta
	public double depositar( double cantidad ){
		if(cantidad > 0) {
			this.saldo += cantidad;
			System.out.println("Acaba de recibir un depósito de CLP $" + cantidad + " en su cuenta");
		}else {
			System.out.println("Favor ingrese una cantidad para depositar");
		}
		return this.saldo;
	}
	
	
	//Hacer retiros de la cuenta, siempre y cuando existan el monto suficiente
	public double retirar( double cantidad ) {
		if( cantidad < saldo && cantidad > 0 ) {
			saldo -= cantidad;
			System.out.println("Acaba de retirar CLP $ " + cantidad + " de su cuenta");
		} else {
			System.out.println("El monto de su retiro excede su saldo actual");
		}
		
		return saldo;
	}
		
	
	//getters y setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
