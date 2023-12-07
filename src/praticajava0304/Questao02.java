package praticajava0304;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Nota 1: ");
	        float nota1 = leia.nextFloat();

	        System.out.println("Nota 2: ");
	        float nota2 = leia.nextFloat();

	        System.out.println("Nota 3: ");
	        float nota3 = leia.nextFloat();

	        System.out.println("Nota 4: ");
	        float nota4 = leia.nextFloat();

	        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

	        System.out.println("Média final: " + mediaFinal);
		}
	}

}
