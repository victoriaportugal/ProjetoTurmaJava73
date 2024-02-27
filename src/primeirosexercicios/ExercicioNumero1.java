package primeirosexercicios;
import java.util.Scanner;

public class ExercicioNumero1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual é seu atual salario? ");
		salario = leia.nextFloat();
		
		System.out.println("Qual é seu abono? ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Seu salario atual é: " + novoSalario + "!");
		
	}

}
