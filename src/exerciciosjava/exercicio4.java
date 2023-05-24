package exerciciosjava;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, diferenca;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		n1 = leia.nextFloat();

		System.out.println("Digite o segundo valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		n4 = leia.nextFloat();
		
		 diferenca = (n1 * n2) - (n3 * n4);
		 
		 System.out.println("a diferença do produto entre n1 e n2 pelo "
		 		+ "produto entre n3 e n4 é:  " + diferenca);
		 
		 

	}

}
