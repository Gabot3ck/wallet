package com.wallet.calculadoras;

public class CalculadoraCambioMoneda {
	private double valorConvertir;
	
	
	
	public CalculadoraCambioMoneda(double valorConvertir) {
		this.valorConvertir = valorConvertir;
	}
	
	
	public double convertirMoneda( double precioCambio ) {
		double valorConvertido = this.valorConvertir * precioCambio;
		return valorConvertido;
	}
	
}
