package com.example.practica1.Component;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Componente_Implement implements Componente_Dependencia{

	@Override
	public void salida_mensaje(String mensaje) {
	System.out.println(mensaje);
		
	}

	@Override
	public String leer_teclado() {
		System.out.println("porfavor ingresa un nombre");
		Scanner leer=new Scanner(System.in);
		return leer.nextLine();
	}

}
