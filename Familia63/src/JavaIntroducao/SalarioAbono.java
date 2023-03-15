package JavaIntroducao;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario,abono,novo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o seu salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\n Ditite o abono: ");
		abono = leia.nextFloat();
		
		novo = (salario+abono);
		
		System.out.println("\n O seu novo salário é de: "+novo);
		
	}

}
