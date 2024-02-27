package primeirosexercicios;
import java.util.Scanner;

public class ExercicioNumero2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("1º Nota: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("2º Nota: ");
		nota2 = scanner.nextFloat();
		
		System.out.println("3º Nota: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("4º Nota: ");
		nota4 = scanner.nextFloat();
		
		scanner.close();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4; 
		System.out.println("Sua media final é " + mediaFinal);

	}

}
