package JavaIntroducao;

import java.util.Scanner;

public class SalarioDois {

	public static void main(String[] args) {

		float salario,adicional,horas,descontos,liquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\n Digite seu adicional noturno: ");
		adicional = leia.nextFloat();
		
		System.out.println("\n Digite suas horas extras: ");
		horas = leia.nextFloat();
		
		System.out.println("\n Digite os seus descontos: ");
		descontos = leia.nextFloat();
		
		liquido = salario+adicional+horas+descontos;
		
		System.out.println("\n Este é o seu salário liquido: "+liquido);
				
	}

}
