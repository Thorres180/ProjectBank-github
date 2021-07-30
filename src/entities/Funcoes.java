package entities;

public class Funcoes {
	private int conta;
	private String titular;
	private double balance;
	
	
	public Funcoes(int conta, String titular) {
		this.conta= conta;
		this.titular= titular;
	}
	
	public Funcoes(int conta, String titular, double depositoInicial) {
		this.conta= conta;
		this.titular= titular;
		deposito(depositoInicial);
	}
	
	public int getConta() {
		return conta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular= titular;
	}
	public double getBalance() {
		return balance;
	}
	public void deposito(double valorDeposito) {
		balance+= valorDeposito;
	}
	public void saque(Double valorSaque) {
		balance-= valorSaque + 5.0;
	}
	public String toString() {
		return "Conta:  "+ conta+ ", Titular: "+ titular+ ", saldo: R$ "+ String.format("%.2f", balance);
	}

	
}
