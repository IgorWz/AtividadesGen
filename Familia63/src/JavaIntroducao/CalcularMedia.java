package JavaIntroducao;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {

		double nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Insira a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("\n Insira a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("\n Insira a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.println("\n Insira a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\nA sua média foi de: "+media);
		
		
		
		
	}

}
