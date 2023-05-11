package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosDaConta;

public class Conta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosDaConta dadosDaConta;
	
		System.out.println("Entre com o numero da conta:");
		int numero = sc.nextInt();
		
		System.out.println("Entre com o nome do titular:");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Havera algum deposito inicial (s/n)?");
		char resposta = sc.next().charAt(0);
	
		
		if (resposta == 's') {
			
			System.out.println("Qual valor do deposito inicial?");
			double valordoDepositoInicial = sc.nextDouble();
			dadosDaConta = new DadosDaConta(numero, titular, valordoDepositoInicial);  
		}
		else {
			dadosDaConta = new DadosDaConta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: " );
		System.out.println(dadosDaConta);
		
		System.out.println();
		System.out.println("Entre com um valor pra deposito");
		double valorpraDeposito = sc.nextDouble();
		dadosDaConta.deposito(valorpraDeposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(dadosDaConta);
		
		System.out.println("Entre com um valor para saque");
		double valorpraSaque = sc.nextDouble();
		dadosDaConta.saque(valorpraSaque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(dadosDaConta);
		sc.close();
	}

}
