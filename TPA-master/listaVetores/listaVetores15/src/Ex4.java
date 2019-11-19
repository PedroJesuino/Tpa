import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[],i,n;
	a = new int [11];
		for (i = 1;i<=10;i++) {
			System.out.println("Digite os valores");
			a[i] = in.nextInt();
			
			for (n = 0;n<=a[i];n++) {
				if (n % 2 == 0) {
					
					System.out.println(n);
					
				}
		}
		}
	}
}