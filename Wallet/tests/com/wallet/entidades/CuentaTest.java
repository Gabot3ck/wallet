package com.wallet.entidades;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class CuentaTest {
	private static Cuenta cuenta;
	
	@BeforeAll
	public static void setUpObject() {
		System.out.println("Configuración inicial");
		cuenta = new Cuenta(1, "Gabriel", 100000);
	}
	
	@AfterAll
	public static void tearDownClass() {
		System.out.println("Limpieza final de la clase");
		cuenta = null;
	}
	
	//Test de deposito de 100000 + el saldo inicial de 100000 se obtiene 200000
	@Test
	public void testDepositar() {
      System.out.println("Depositar 100000");
      assertEquals(200000, cuenta.depositar(100000));
	}
	
	
	//Test de retiro de 50000 del saldo de 200000 se obtiene 150000
	@Test
	public void testRetirar() {
      System.out.println("Retirar 50000");
      assertEquals(150000, cuenta.retirar(50000));
	}

}
