package com.principal;

import javax.swing.JOptionPane;

import com.classes.*;

public class CriarUsuario {

	public static void main(String[] args) {

		
		
		
		//Vamos fazer uma inst�ncia da classe Usuario
		//e assim criar um novo usu�rio. 
		//Esse processo se d� com o comando NEW que 
		//materializa a nossa classe transformando-a
		//em um objeto
		Usuario user = new Usuario();
		String id, nome, login, senha, acesso;
		id = JOptionPane.showInputDialog("Digite o id do usu�rio");
		nome = JOptionPane.showInputDialog("Digite o nome");
		login = JOptionPane.showInputDialog("Digite o seu login");
		senha = JOptionPane.showInputDialog("Digite a sua senha");
		acesso = JOptionPane.showInputDialog("Digite o n�vel de acesso");
		
		//Vamos fazer a passagem dos dados digitados para a classe
		//Usuario, por meio do objeto user.
		user.id = Integer.parseInt(id);
		user.nome = nome;
		user.login = login;
		user.senha = senha;
		user.nivelAcesso = acesso;
		
		JOptionPane.showMessageDialog(null, user.cadastro());
		
		int escolha = JOptionPane.showConfirmDialog(null, "Voc� deseja logar?");
		
		if(escolha==0) {
			login = JOptionPane.showInputDialog("Digite o seu login");
			senha = JOptionPane.showInputDialog("Digite a sua senha");
			JOptionPane.showMessageDialog(null, user.logar(login, senha));
			
		}
		
		
	}

}











