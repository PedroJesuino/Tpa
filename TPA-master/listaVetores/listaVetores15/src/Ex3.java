import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[],i,d,j = 1;
	a = new int [11];
		for (i = 1;i<=10;i++) {
			System.out.println("Digite os valores");
			a[i] = in.nextInt();
			
			for (d = 0,j = 1;j<=a[i];j++) {
				if (a[i] % j ==0) {
					
					d++;
				}
				
			}
			System.out.println(d);
			if(d <= 2) {
				System.out.println("É Primo");
			}else {
				System.out.println("Não é primo");
			}
		}
		
	}
}

