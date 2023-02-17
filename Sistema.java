import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner(System.in);
		Scanner ent = new Scanner(System.in);
		
		double total = 0;
		System.out.println("Bem vindo ao carrinho de compras");
		while (true) {
		
		System.out.println("Informe o codigo produto");
		String nome = ent.nextLine();
		System.out.println("Digite o preco do pruduto");
		double preco = ent.nextDouble();
		System.out.println("Digite a quantidade do produto");
		int num = (int) ent.nextDouble();
		ent.nextLine();
		
		
		
		System.out.printf("A quantidade deprodutos e de  " + num +"\nTotal a pagar e de  R$" + num * preco + " Obrigado por comprar " + nome);
		
		
		//nova compra
		
		System.out.println("\nRealizar outra compra");
		String resposta = ent.nextLine();
		if("n".equalsIgnoreCase(resposta))
			break;
		
		
		
		System.out.println("\n\"Nova compra\"\n");
		System.out.println("Favor iniciar com as informacoes");
		
	}
		
		
		System.out.println("Volte sempre!");
		
		
		
		
			
		}
	}

	

