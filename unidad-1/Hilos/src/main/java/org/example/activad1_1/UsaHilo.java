package org.example.activad1_1;

import org.example.activad1_1.HiloSimple;

public class UsaHilo {
	
	public static void main (String[] args) throws InterruptedException {
		HiloSimple hs = new HiloSimple();
		hs.start();
				
		System.out.println("Terminó de ejecutarse UsaHilo");
	}

}
