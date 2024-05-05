package com.wallet.ejecucion;

import com.wallet.entidades.*;
import com.wallet.menu.MenuApp;


public class Main {

	public static void main(String[] args) {
		//Crear un cliente con una cuenta existente con un saldo de CLP $ 0.00
		Cuenta billetera1 = new Cuenta(234788, "Gabriel", 0);
		Cliente cliente1 = new Cliente(1, "Gabriel", billetera1);
		
		//Crear la instancia de menu para luego mostrar las opciones del mismo
		MenuApp menu = new MenuApp(billetera1, cliente1);
		menu.mostrarMenu();
	}
}
