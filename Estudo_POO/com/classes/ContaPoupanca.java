package com.classes;

public class ContaPoupanca extends ContaBancaria{

	private double rendimento;
	
	public String abrirConta() {
		
		
		
		return null;
	}
	
	public void setNBanco(int nBanco) {
		super.nBanco = nBanco;
	}
	
	public int getNBanco() {
		return super.nBanco;
	}
	
	
	public void setNAgencia(int nAgencia) {
		super.nAgencia = nAgencia;
	}
	
	public int getNAgencia() {
		return super.nAgencia;
	}
	
	public void setNConta(int nConta) {
		super.nConta = nConta;
	}
	
	public int getNConta() {
		return nConta;
	}
	
	public void setSaldo(double saldo) {
		super.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setTitular(String titular) {
		super.titular = titular;
	}
	public String getTitular() {
		return titular;
				
	}
	
	@Override
	public String sacar(double valor) {
		
		String msg = "";
		
		if(valor > saldo)
			msg = "Saldo insuficiente";
		else {
			saldo-=valor;
			msg = "Retire suas notas";
		}
		return msg;
	}
	
	public String calcularRendimento(double percentual) {
		
		
		
		
	}
	
	
}






















