package com.classes;

public class Usuario {
	//Vamos definir as caracteristicas do usu�rio
	//Ele ter�: Id, Nome, Login, Senha e N�vel 
	//de acesso.
	public int id;
	public String nome;
	public String login;
	public String senha;
	public String nivelAcesso;
	
	//Vamos criar um m�todo(a��o) para realizar o 
	//cadastro do Usu�rio.
	//Este m�todo deve retornar uma mensagem de cadastro
	//realizado. Portanto seu retorno ser� do tipo
	//String
	public String cadastro() {
		String msg = "";
		msg += "Cadastro realizado do usu�rio:\n" + 
				"Nome: " + nome + "\n" +
				"Login: " + login + "\n"+
				"N�vel de Acesso: "+nivelAcesso;
				
		return msg;
	}
	
	
	
	
	public String logar(String usuario, String senha) {
		String msg = "";
		
		if(usuario.equals(login) && senha.equals(this.senha)) {
			msg = "Bem Vindo!\n Voc� est� logado.";
		} 
		else {
			msg = "Nome de usu�rio ou senha incorretos.";
		}
		return msg;
	}
	public String logout() {
		return "Voc� saiu do sistema";
	}
	
	
}
