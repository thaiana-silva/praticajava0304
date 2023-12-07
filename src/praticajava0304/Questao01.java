package praticajava0304;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o salário: ");
	        float salario = scanner.nextFloat();
	        System.out.print("Digite o Abono: ");
	        float abono = scanner.nextFloat();
	        float novoSalario = salario + abono;
	        System.out.println("Novo Salário: " + novoSalario);
	        scanner.close();
	}

}
