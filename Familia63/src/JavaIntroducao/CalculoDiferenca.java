package JavaIntroducao;

import java.util.Scanner;

public class CalculoDiferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	float[] num = new float[5];
	
	float diferenca;
	int i;
	
	Scanner read = new Scanner (System.in);
	
	for(i = 1;i<=4;i++) {
	
	System.out.println("\nDigite o número "+i);
	num [i] = read.nextFloat();
		
	}
	
	diferenca = (num[1]*num[2])-(num[3]*num[4]);
	
	System.out.println("\nA diferença entre "+num[1]+" * "+num[2]+" e "+num[3]+" * "+num[4]+" é "+diferenca);
	
	
	}
	
	
}
