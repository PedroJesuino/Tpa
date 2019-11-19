import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int a[] = new int [10];
	int b[] = new int [10];
	int c[] = new int [10];
	int i = 0,y = 0,z = 0;
		
	for (i = 0;i<10;i++) {
		System.out.printf("Informe o %d numero do vetor A\n", (i+1));
		a[i] = in.nextInt();
		System.out.printf("Informe o %d numero do vetor B\n", (i+1));
		b[i] = in.nextInt();
	}
		for (y = 0;y<10;y++) {
			for (z = 0,i = 0;i<10;i++) {
				
			if (a[y] == b[i]) {
				z++;
			}
			
			if (z==1) {
				c[y] = a[y];
			}
		
		
			}
		}
		System.out.print("[");
		for (y = 0;y<10;y++) {
			System.out.printf(" %d" ,c[y]);
		}
		System.out.println("]");
	}

}
