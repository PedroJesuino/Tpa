import java.util.Random;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a[][] = new int[4][4];
        int i=0, j=0, k=0, l=0, n, n1=0, v=0;
        Random aleatorio = new Random();

        for(i=0; i<4; i++){
        	
            for(j=0; j<4; j++){
            	
            	
                a[i][j] = aleatorio.nextInt(75);
                System.out.print(a[i][j]+" ");
                if(j==3){
                    System.out.println("\n");
                    
                }

            }
        }

        for(v=1; v<=50; v++){
        	System.out.println("Cante o Numero.");
                n = ler.nextInt();
                System.out.println(n);
            for(n1=0, i=0; i<4; i++) {
                for(j=0; j<4; j++){

                    if(n==a[i][j]){
                        n1++;
                        k=k+n1;
                        
                        System.out.println("O número cantado tem na cartela");

                    }
                }
            }
                if(n1==0){
                    System.out.println("O número cantado não tem na cartela");

                }

                if(k==16){
                    System.out.println("BINGOOO!!");
                    System.out.println("Demorou "+v+" rodadas para você ganhar!");
                    break;
                }
        }

    }
}