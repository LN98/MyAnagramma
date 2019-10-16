package anagrammi;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		long inizio;
		long fine;
//		String s = "1234";
//		
//		char[] c = new char[s.length()];
//		for(int i=0;i<c.length;i++) {
//			c[i]=' ';
//		}
//		
//		inizio = System.currentTimeMillis();
//		for (int i = 0; i < c.length; i++) {
//			if (c[i] == ' ' ){
//				c[i] = s.charAt(3);
//
//				for (int k = 0; k < s.length(); k++) {
//					if (c[k] == ' ') {
//						c[k] = s.charAt(2);
//
//						for (int q = 0; q < s.length(); q++) {
//							if (c[q] == ' ') {
//								c[q] = s.charAt(1);
//								
//								for(int g=0;g<s.length();g++) {
//									if(c[g]==' ') {
//										c[g]=s.charAt(0);
//										for(int l=0;l<s.length();l++) {
//											System.out.print(c[l]);
//										}
//										System.out.println("");
//										c[g]=' ';
//									}
//								}
//								c[q] = ' ';
//							}
//
//						}
//						c[k] = ' ';
//					}
//				}
//				c[i] = ' ';
//			}
//		}
		//algoritmo
		String p;
		
		Scanner s=new Scanner(System.in);
		System.out.println("inserisci la parola:");
		p=s.next();
		inizio = System.currentTimeMillis();
		Anagrammi a=new Anagrammi(p);
		
		inizio = System.currentTimeMillis();
		a.anagrammo(p.length()-1);
		fine= System.currentTimeMillis();
		a.print();

				
		
		System.out.println(fine-inizio);
	}

}
