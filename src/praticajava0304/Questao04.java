package praticajava0304;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("numero1: ");
	        float n1 = leia.nextFloat();

	        System.out.println("numero2: ");
	        float n2 = leia.nextFloat();

	        System.out.println("numero3: ");
	        float n3 = leia.nextFloat();

	        System.out.println("numero4: ");
	        float n4 = leia.nextFloat();

	        float diferenca = (n1 * n2) - (n3 * n4);

	        System.out.println("Diferença: " + diferenca);
		}
	}

}
