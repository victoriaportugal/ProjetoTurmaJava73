package quintosexercicios;

public class Exercicio03_Matrizes {

	public static void main(String[] args) {

        int[][] numeroMatriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

  
        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < numeroMatriz.length; i++) {
            System.out.print(numeroMatriz[i][i] + " ");
        }
        
        System.out.println("");

        System.out.println("Elementos da Diagonal Secundária:");
        for (int i = 0; i < numeroMatriz.length; i++) {
            System.out.print(numeroMatriz[i][numeroMatriz.length - 1 - i] + " ");
        }

        System.out.println("");

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < numeroMatriz.length; i++) {
            somaDiagonalPrincipal += numeroMatriz[i][i];
        }
        System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < numeroMatriz.length; i++) {
            somaDiagonalSecundaria += numeroMatriz[i][numeroMatriz.length - 1 - i];
        }
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
		


