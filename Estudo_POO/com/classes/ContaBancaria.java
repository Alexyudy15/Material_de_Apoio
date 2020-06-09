package com.classes;

public abstract class ContaBancaria {
	//Atributos da conta bancária
	
	protected int nBanco;
	protected int nAgencia;
	protected int nConta;
	protected double saldo;
	protected String titular;
	
	public String depositar(double valor) {
		saldo += valor;
		return "Valor depositado com sucesso!";
	}
	
	public String sacar(double valor) {
		saldo -= valor;
		return "Retire suas notas";
	}
	
	
	public double obterSaldo() {
		return saldo;
	}
}
