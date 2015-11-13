/*
 * Primo.java
 * 
 * Copyright 2015 Ciclo DAM <matinal@DAM>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

public class Primo {
    
    public static void main(String args[]) { 
	esPrimo(3);
	
    
    
    public static void esPrimo(int numero){
		int contador = 2;
		boolean primo=false;
		while (numero!=0 && contador!=numero){
			if (numero % contador == 0)
			primo = true;
			contador++;
			}
		if (esPrimo=true)
			System.out.println(numero+" es primo");
		else
			System.out.println(numero+" no es primo");
		}
		
	}
}
