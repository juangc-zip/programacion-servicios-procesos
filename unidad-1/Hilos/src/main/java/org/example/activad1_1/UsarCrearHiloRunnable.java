package org.example.activad1_1;

public class UsarCrearHiloRunnable {

	public static void main(String[] args) {
		CrearHiloRunnable hilo = new CrearHiloRunnable();
		Thread t = new Thread(hilo); 
		t.start();

	}

}
