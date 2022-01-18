import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("informe o numero de linhas: ");
		int linhas = leitor.nextInt();
		System.out.println("informe o numero de colunas: ");
		int colunas = leitor.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Informe o valor: ");
				matriz[i][j] = leitor.nextInt();
			} // end for j
		} // end for i

		System.out.println("informe um numero que esteja dentro da matriz: ");
		int numero = leitor.nextInt();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (numero == matriz[i][j]) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				} else {
					System.out.println("Não está");
				} // end else
			} // end for j
		} // end for i

	} // end class main
}
