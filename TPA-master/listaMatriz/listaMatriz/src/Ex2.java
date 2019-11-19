import java.util.*;
public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a[][] = new int[3][3];
        int i, j, maiorN=0, menorN=1000, colunaNA=0, colunaNB=0, linhaNA=0, linhaNB=0;
        Random x = new Random();
        
        

        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                a[i][j] = x.nextInt(1000);
                System.out.print(a[i] [j]+ " ");

                if (j == 2) {
                    System.out.println("\n");
                }
                
                if(a[i][j]>maiorN) {
                    maiorN = a[i][j];
                    colunaNA = j;
                    linhaNA = i;

                }
                
                if(a[i][j]<=menorN){
                    menorN = a[i][j];
                    colunaNB = j;
                    linhaNB = i;
                }
                }
            }
        			System.out.println("Maior número = "+maiorN);
                    System.out.println("Coluna: "+(colunaNA+1));
                    System.out.println("Linha: "+(linhaNA+1));

                    System.out.println("Menor número = "+menorN);
                    System.out.println("Coluna: "+(colunaNB+1));
                    System.out.println("Linha: "+(linhaNB+1));

        }

    }