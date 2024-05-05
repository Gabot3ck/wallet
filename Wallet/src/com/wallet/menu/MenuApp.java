package com.wallet.menu;

import java.util.Scanner;

import com.wallet.calculadoras.CalculadoraCambioMoneda;
import com.wallet.entidades.Cliente;
import com.wallet.entidades.Cuenta;

public class MenuApp {
	
	private Cuenta cuenta;
	private Cliente cliente;
	
	
	public MenuApp(Cuenta cuenta,  Cliente cliente ) {
		this.cuenta = cuenta;
		this.cliente = cliente;
	}
	
	
	public void mostrarMenu( ) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("------- MENU ALKE WALLET -------");
			System.out.println("1 - Ver saldo disponible");
			System.out.println("2 - Realizar deposito");
			System.out.println("3 - Retirar fondos");
			System.out.println("4 - Mostrar información del cliente");
			System.out.println("5 - Convertir CLP$ pesos a USD$ dólares");
			System.out.println("6 - Convertir USD$ dólares a CLP$ pesos");
			System.out.println("7 - Salir");
			System.out.println("Seleccione una opción: ");
			
			int opcion = scan.nextInt();
			
			switch( opcion ) {
				case 1:
					System.out.println("Su saldo disponible es: $ " + cuenta.getSaldo());
					break;
					
				case 2:
					System.out.println("Ingrese el monto a depositar: ");
					double deposito = scan.nextDouble();
					cuenta.depositar(deposito);
					break;
					
				case 3:
					System.out.println("Ingrese el monto a retirar: ");
					double retiro = scan.nextDouble();
					cuenta.retirar(retiro);
					break;
				case 4:
					System.out.println("Sus datos son los siguientes: ");
					cliente.mostrarInformacion();
					break;
					
				case 5:
					System.out.println("Ingrese el monto en CLP$ pesos a convertir:");
					double cantidadCLP = scan.nextDouble();
					CalculadoraCambioMoneda calculadoraCLP = new CalculadoraCambioMoneda(cantidadCLP);
					System.out.println("El valor de cambio es USD$ " 
										+ calculadoraCLP.convertirMoneda(0.001065)
										+ "dólares");
					break;
		
				case 6:
					System.out.println("Ingrese el monto en USD$ dólares a convertir:");
					double cantidadUSD = scan.nextDouble();
					CalculadoraCambioMoneda calculadoraUSD = new CalculadoraCambioMoneda(cantidadUSD);
					System.out.println("El valor de cambio es CLP$ " 
										+ calculadoraUSD.convertirMoneda(942.28)
										+ "pesos");
					break;
					
				case 7:
					continuar = false;
					System.out.println("Gracias por usar el sistema...");
					break;
					
				default:
					System.out.println("Ingrese una opción válida");
			}

			if( continuar ) {
				System.out.println("¿Desea continuar? (Sí:1 / No:0)");
				int continuarMenu = scan.nextInt();
				if( continuarMenu == 0 ) {
					continuar = false;
					System.out.println("Gracias por usar ALKE WALLET...");
				}
			}
		}
		
		scan.close();
	}

}
