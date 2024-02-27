package primeirosexercicios;
import java.util.Scanner;

public class ExercicioNumero3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Adicione seu salario bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.println("Adicione seu adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Adicione seu horas extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.println("Adicione seu descontos: ");
		descontos = scanner.nextFloat();
		
		scanner.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5)- descontos;
		
		System.out.println("Seu salario liquido é de: " + salarioLiquido);
		descontos = scanner.nextFloat();

	}

}
