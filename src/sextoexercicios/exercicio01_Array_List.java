package sextoexercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class exercicio01_Array_List {

	public static void main(String[] args) {

		int i;
		String collor;
		ArrayList<String> collors = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			collor = scanner.nextLine();
			collors.add(collor);
		}

		System.out.println("Listar todas as cores: " + collors);

		Collections.sort(collors);
		System.out.println("Cores em ordem decrescente: " + collors);

		scanner.close();
	}
}
