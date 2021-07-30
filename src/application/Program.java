package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcoes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		Funcoes funcoes;
		
		System.out.print("Digite o numero da conta: ");
		 int conta= sc.nextInt();
		System.out.print("Nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Existe um deposito inicial (s/n)? ");
		char resposta= sc.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial= sc.nextDouble();
			funcoes= new Funcoes(conta, titular, depositoInicial);
		}
		else {
			funcoes= new Funcoes(conta, titular);
		}
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(funcoes);
		
		System.out.println();
		System.out.println("1-Deposito");
		System.out.println("2-Saque");
		System.out.println("3-Saldo");
		System.out.println("0-Sair");
		int operacao = sc.nextInt();
		while(operacao !=0) {
			
		switch(operacao) {
		case 1:
			System.out.print("Qual o valor do deposito? ");
			double valorDeposito= sc.nextDouble();
			funcoes.deposito(valorDeposito);
			System.out.println("Dados da conta atualizados.");
			System.out.println(funcoes);
			break;
		case 2:
			System.out.print("Qual o valor para saque? ");
			double valorSaque= sc.nextDouble();
			funcoes.saque(valorSaque);
			System.out.println("Dados da conta atualizados.");
			System.out.println("Por favor, retire o seu dinheiro.");
			System.out.println(funcoes);
			break;
		case 3:
			System.out.println("Dados da conta: ");
			System.out.println(funcoes);
			break;
		}
		System.out.println();
		System.out.println("1-Deposito");
		System.out.println("2-Saque");
		System.out.println("3-Saldo");
		System.out.println("0-Sair");
		operacao = sc.nextInt();
		}

		
		sc.close();
	}

}
