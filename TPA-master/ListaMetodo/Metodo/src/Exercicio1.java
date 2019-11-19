import java.util.*;
public class Exercicio1 {
	public static void main(String[]args) {
		potencia();
	}
	public static void potencia() {
		Scanner ler= new Scanner(System.in);
		int p, r;
		System.out.println("Digite um número");
		p=ler.nextInt();
		r=p*p*p*p;
		System.out.println("O resultado é: "+r);
		}
}
