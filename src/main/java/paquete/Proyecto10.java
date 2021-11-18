package paquete;

import java.util.Scanner;

public class Proyecto10 {
	
	public static void main(String[] args) {
		
		String techo = "|------|";
		String cuerpo = "|      |";
		String suelo = "|      |";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de plantas que quieres meter: ");
		byte np = Byte.parseByte(sc.nextLine());
		System.out.println("Introduce el numero de casas por piso que quieres: ");
		byte nc = Byte.parseByte(sc.nextLine());
		
		System.out.println("El edificio que has creado es tal que asi: ");
		
		System.out.println("|----------------------------|");
		System.out.println("|     13 Rue del Percebe     |");
		System.out.println("|----------------------------|");
		
		for (byte i = 0; i < np; i++) {
			for (byte j = 0; j < nc; j++) {
				System.out.print(techo);

			}	
			System.out.println("");
			
			for (byte k = 0; k < nc; k++) {
				System.out.print(cuerpo);

			}	
			System.out.println("");
				
			for (byte l = 0; l < nc; l++) {
				System.out.print(suelo);

			}	
			System.out.println("");
			
			}
			
			
			
			
			
		}
	
}
