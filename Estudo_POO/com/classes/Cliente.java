package com.classes;

public class Cliente {
	//Atributos da classe Cliente
	public int id;
	public String nome;
	public String email;
	public int idade;
	
	public void cadastrarCliente() {
		System.out.println("Cliente Cadastrado!");
		System.out.println("Id: "+id);
		System.out.println("Nome: "+nome);
		System.out.println("E-Mail: "+email);
		System.out.println("Idade: "+idade);
	}
}
