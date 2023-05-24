package exerciciosjava;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Cálculo do salário líquido");
		
		System.out.println("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5) - descontos);
		
		System.out.printf("Seu salário líquido é de:R$ " + salarioLiquido);
		

	}

}
