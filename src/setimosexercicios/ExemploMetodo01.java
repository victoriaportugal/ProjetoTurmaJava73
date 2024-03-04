package setimosexercicios;

public class ExemploMetodo01 {

	public static void main(String[] args) {

		int resultado = (somar(1, 2));

		System.out.println("O primeiro resultado é " + resultado);
		System.out.println("O segundo resultado é " + somar(8, 3));
		mensagem();
		saudacao();

	}

	public static int somar(int num1, int num2) {
		System.out.print("alo");
		return num1 + num2;
	}

	public static void saudacao() {
		System.out.println("Ola");
	}

	public static void mensagem() {
		System.out.println("Hello world");
	}
}
