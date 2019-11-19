import java.util.*;
public class Exercicio4 {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int vetor [] [] = new int [5] [5];
		int linha,coluna,aux;
		
		for (linha = 0;linha<5;linha++) {
			for (coluna = 0;coluna<5;coluna++) {
			if (linha>=coluna) {
				vetor [linha][coluna] = 1;
			
			}else {
				vetor[linha][coluna] = 0;
			}
			System.out.print(vetor[linha][coluna]+" ");
			if (coluna==4) {
				System.out.print("\n");
			}
			}
		}
			
	}
}