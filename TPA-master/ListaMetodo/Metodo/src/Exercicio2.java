import java.util.*;
public class Exercicio2 {
	public static void main(String args[]) {
		tabuada();
	}
	public static void tabuada() {
		Scanner ler=new Scanner(System.in);
		int i, t, r;
		System.out.println("Digite um número");
		t=ler.nextInt();
		for(i=1; i<=10; i++) {
			r=t*i;
			System.out.println(t+"X"+i+" = "+r);
		}
	}
}
