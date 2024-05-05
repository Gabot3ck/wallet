package com.wallet.calculadoras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class CalculadoraCambioMonedaTest {
	private static CalculadoraCambioMoneda calculadora;
	
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("Limpieza final de la clase");
		calculadora = null;
	}
	
	
	@Test
	public void testConvertirMonedaCLP() {
		System.out.println("Convertir CLP$ 100000 pesos a dólares");
		calculadora = new CalculadoraCambioMoneda(100000);
		assertEquals(106.5, calculadora.convertirMoneda(0.001065));
	}
	
	@Test
	public void testConvertirMonedaUSD() {
		System.out.println("Convertir USD$ 1000 dólares a pesos");
		calculadora = new CalculadoraCambioMoneda(1000);
		assertEquals(942280, calculadora.convertirMoneda(942.28));
	}

}
