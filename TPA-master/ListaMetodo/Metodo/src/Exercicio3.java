import java.util.*;
import java.math.*;
public class Exercicio3 {
	public static void main (String [] args) {
		int vetor [] [] = new int [5] [5];
		int linha,coluna,aux;
		Random x = new Random();
		
		for (linha = 0;linha<5;linha++) {
			for (coluna = 0;coluna<5;coluna++) {
			vetor[linha][coluna]=x.nextInt(100);
			System.out.print(vetor[linha][coluna]+" ");
			
			if (coluna == 4 ) {
				System.out.print("\n");
				
			}
		
			
			}
		}
		System.out.println("\n");
		System.out.println(vetor[0][0]);
		System.out.println(vetor[1][1]);
		System.out.println(vetor[2][2]);
		System.out.println(vetor[3][3]);
		System.out.println(vetor[4][4]);
	}
}
