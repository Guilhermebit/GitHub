package br.com.UniasselviCadeiraL�gica;
import java.util.Scanner;

public class AlgoritmoPares {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		
		int num = scan.nextInt();
		
		while(num != 0) {
			
			if((num % 2) == 0) {
				
				System.out.println("O n�mero digitado � par: " + num);
				num = scan.nextInt();
			}
			
			else {
				
				System.out.println("O n�mero digitado � �mpar: " + num);
				num = scan.nextInt();
			}
		}
	}

}
