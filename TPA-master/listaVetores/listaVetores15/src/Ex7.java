import java.util.*;
public class Ex7 {


    public static void main(String args[]){

    	int A[]=new int[15];
    	int B[]=new int[15];
    	int fat=1;
    	Random ran = new Random();

    	System.out.println("Elementos de A:");
		for(int i=0;i<15;i++)
    	{
    		A[i]=ran.nextInt(15);
    		System.out.print(A[i] + " ");
    	}

    	System.out.println("\n\nElementos de B:");	
    	for(int i=0;i<=14;i++)
    	{
    		for(int j=A[i];j>=2;j--){
    			fat*=j;
    		}
    		B[i]=fat;
    		System.out.println(A[i] + "!" + "=" +B[i] + " ");
    		fat = 1;
    	} 			    	
    }
}


