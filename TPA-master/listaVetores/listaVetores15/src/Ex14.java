import java.util.*;
public class Ex14{
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        int i;

        for(i = 0; i<10; i++){
            System.out.println("Insira o "+(i+1)+" ºNumero do Vetor A");
            a[i] = ler.nextInt();
            System.out.println("Insira o "+(i+1)+" ºNumero do Vetor B");
            b[i] = ler.nextInt();

            if(a[i] > b[i]){
                c[i] = 1;
            }

            else if(a[i] == b[i]){
                c[i] = 0;    
            }

            else{
                c[i] = -1;
            }
        }
        System.out.print("C=[ ");
        for(i = 0; i<10; i++){
            System.out.printf(" %d",c[i]);
        }
        System.out.println(" ]");
    
    }
}