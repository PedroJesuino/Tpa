import java.util.*;
public class Exercicio {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	int i = 1, continuar;
	menu ();
	while(i<=5) {
		System.out.println("Deseja continuar: 1 para sim e 2 para não");
		continuar=ler.nextInt();
		if(continuar == 1) {
			menu ();
			i=1;
		}
		else if(continuar == 2) {
			break;
		}
	}
	}
	public static void fatorial(int f) {
		int i = f - 1;
		
		while (i>0) {
			f = f*i;
			i--;
		}
		System.out.println("Seu Fatorial é: " +f);
	}//Fim do método
	
	public static void tabuada() {
		Scanner ler=new Scanner(System.in);
		int i, t, r;
		System.out.println("Digite um número");
		t=ler.nextInt();
		for(i=1; i<=10; i++) {
			r=t*i;
			System.out.println(t+"X"+i+" = "+r);
		}
	}//Fim do método
	public static void aposentadoria (int sexo, int idade) {
		int aposentadoria;
		if (sexo == 1) {
			aposentadoria=65-idade;
			System.out.println("Falta "+aposentadoria+" anos para você se aposentar");	
		}
		else if(sexo == 2) {
			aposentadoria=60-idade;
			System.out.println("Falta "+aposentadoria+" anos para você se aposentar");
		}
	}//Fim do método
	public static void potencia (int b, int e) {
		int i,b2 = 1;
		for (i = 0;i<e;i++) {
			b2 = b2 * b;
		}
		System.out.println("A potencia fica: " +b2);
	}//Fim do método
	public static void menu () {
		Scanner ler = new Scanner (System.in);
		int menu;
		System.out.println("Digite 1 para Fatorial \nDigite 2 para Tabuada \nDigite 3 para Aposentadoria \nDigite 4 para Potencia\nDigite 5 para sair");
		menu=ler.nextInt();
		
		if(menu == 1) {
		int f;
		System.out.println("Digite um valor.");
		f = ler.nextInt();
		fatorial(f);
		}
		else if(menu == 2) {
			tabuada();
		}
		else if(menu == 3){
			int sexo, idade;
			System.out.println("Digite 1 para Homem \nDigite 2 para Mulher");
			sexo=ler.nextInt();
			System.out.println("Digite a sua idade:");
			idade=ler.nextInt();
			aposentadoria(sexo, idade);
		}
		else if (menu == 4) {
			int b , e;
			System.out.println("Digite a Base");
			b =ler.nextInt();
			System.out.println("Digite o expoente");
			e = ler.nextInt();
			potencia(b,e);
		}
		else if (menu == 5) {
			System.exit(0);
		}
	}
}