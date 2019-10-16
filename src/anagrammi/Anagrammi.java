package anagrammi;

import java.util.HashSet;
import java.util.Set;

public class Anagrammi {
	
	private Set<String> anagrammi;
	private String parola;
	private char[] c;
	int d;
	
	public Anagrammi(String s) {
		anagrammi=new HashSet<>();
		parola=s;
		c= new char[parola.length()];
		for(int i=0;i<c.length;i++) {
			c[i]=' ';
		}
		d=0;
		
	}
	
	public void anagrammo(int p) {
		for(int i=0;i<parola.length();i++) {
			if(c[i]==' ') {
				c[i]=parola.charAt(p);
				if(p>0) {
					anagrammo(p-1);
				}
				if(p==0) {
					anagrammi.add(String.valueOf(c));
					d++;
				}
				c[i]=' ';
			}
		}
	} 
	
	public int fattoriale(int a) {
		if(a==1) return 1;
		else return a*fattoriale(a-1);
	}
	
	public void print() {
		for(String a:anagrammi) {
			System.out.println(a);
		}
		System.out.println("volte "+ d);
		System.out.println("fattoriale "+fattoriale(parola.length()));
	}
	

}
