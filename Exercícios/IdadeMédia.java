package br.com.UniasselviCadeiraL�gica;
import java.util.Scanner;


/* Algoritmo que le um n�mero X de idades, e mostra:
 * 
 -> A soma das idades
 -> A quantidade informada
 -> A m�dia das idades
 */

public class IdadeM�dia {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		int idade,cont,media;
		int soma = 0;
		
		scanner = new Scanner(System.in);
		
		for(cont =0 ;cont < 5; cont++) {
			
		System.out.println("Digite uma rela��o de idades:");
		idade = scanner.nextInt();
		
		soma = soma + idade;
		
		
	  }
		
		media = soma / cont;
		
		System.out.println("A soma das idades �: " + soma);
		System.out.println("A quantidade �: " + cont);
		System.out.println("A m�dia das idades �:" + media);
		
   }

}
