package exerciciosjava;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		float salario = 0.0f,abono = 0.0f,novoSalario = 0.0f;
		
Scanner leia = new Scanner (System.in);
		
		System.out.println("Cálculo do novo salário");
		
		System.out.println("Digite seu salário: ");
		salario = leia.nextFloat();

		System.out.println("Digite seu abono:  ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário é: R$" +"%.2f", novoSalario);
		
	}

}
