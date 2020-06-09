package com.classes;

public class Usuario {
	//Vamos definir as caracteristicas do usuário
	//Ele terá: Id, Nome, Login, Senha e Nível 
	//de acesso.
	public int id;
	public String nome;
	public String login;
	public String senha;
	public String nivelAcesso;
	
	//Vamos criar um método(ação) para realizar o 
	//cadastro do Usuário.
	//Este método deve retornar uma mensagem de cadastro
	//realizado. Portanto seu retorno será do tipo
	//String
	public String cadastro() {
		String msg = "";
		msg += "Cadastro realizado do usuário:\n" + 
				"Nome: " + nome + "\n" +
				"Login: " + login + "\n"+
				"Nível de Acesso: "+nivelAcesso;
				
		return msg;
	}
	
	
	
	
	public String logar(String usuario, String senha) {
		String msg = "";
		
		if(usuario.equals(login) && senha.equals(this.senha)) {
			msg = "Bem Vindo!\n Você está logado.";
		} 
		else {
			msg = "Nome de usuário ou senha incorretos.";
		}
		return msg;
	}
	public String logout() {
		return "Você saiu do sistema";
	}
	
	
}
