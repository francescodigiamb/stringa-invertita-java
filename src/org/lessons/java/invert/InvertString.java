package org.lessons.java.invert;

import java.util.Scanner;

public class InvertString {
	
	/* 
	 * Data una stringa inserita dall'utente 
	 * stampare a video la stringa invertita 
	 * per es: Java -> avaJ
	 */

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Inserisci una parola");
		
		String parola = scan.next();
		
		StringBuilder contrario = new StringBuilder();
		
		for (int i = (parola.length() - 1); i >= 0; i--) {
			contrario.append(parola.charAt(i));
		}
		
		System.out.println("L'inverso di " + parola + " è " + contrario);
		
	}
}
