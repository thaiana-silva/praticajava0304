package praticajava0304;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Salário Bruto: ");
			float salarioBruto = leia.nextFloat();

			System.out.println("Adicional Noturno: ");
			float adicionalNoturno = leia.nextFloat();

			System.out.println("Horas Extras: ");
			float horasExtras = leia.nextFloat();

			System.out.println("Descontos: ");
			float descontos = leia.nextFloat();

			float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

			System.out.println("Salário Líquido: " + salarioLiquido);
		}

	}

}
