package sextoexercicios;

import java.util.Stack;

public class class_exemplo {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

		System.out.println("\nElementos da Pilha: " + pilha);

	}

}
