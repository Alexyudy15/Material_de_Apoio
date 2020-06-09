package com.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.classes.Cliente;

public class UsarCliente extends JFrame{

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setSize(500,400);
		/*
		 * Estamos pedindo para que a janela pegue o conteúdo do painel
		 * e organize com o layout com um gerenciador. Neste caso não
		 * utilizaremos nenhum gerenciador, por isso setamos o comando null
		 */
		janela.getContentPane().setLayout(null);
		janela.setTitle("Cadastro de Clientes");
		
		JLabel lblId = new JLabel("Id do Cliente:");
		lblId.setBounds(10, 50, 100, 30);
		janela.add(lblId);
		
		JTextField txtId = new JTextField();
		txtId.setBounds(110,50,70,30);
		janela.add(txtId);
		
		
		
		JLabel lblNome = new JLabel("Nome do Cliente:");
		lblNome.setBounds(10,85,100,30);
		janela.add(lblNome);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(110,85,300,30);
		janela.add(txtNome);
		
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(10,120,100,30);
		janela.add(lblEmail);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(110,120,300,30);
		janela.add(txtEmail);
		
		JLabel lblIdade= new JLabel("Idade:");
		lblIdade.setBounds(10,155,100,30);
		janela.add(lblIdade);
		
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(110,155,50,30);
		janela.add(txtIdade);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(350,300,130,30);
		janela.add(btnCadastrar);
		
		
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		//para alinhar a janela ao centro da tela
		janela.setLocationRelativeTo(null);
		
		
		btnCadastrar.addActionListener(new ActionListener() {	

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				Cliente cli = new Cliente();
				cli.id = Integer.parseInt(txtId.getText());
				cli.nome = txtNome.getText();
				cli.email = txtEmail.getText();
				cli.idade = Integer.parseInt(txtIdade.getText());
				
				cli.cadastrarCliente();
				
				//Janela de confirmação
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
				
				//vamos limpar as caixas de texto
				txtId.setText("");
				txtNome.setText("");
				txtEmail.setText("");
				txtIdade.setText("");
				
				
				
				
				
			}
		   }
		);
		//Não permitir redimensionar
		janela.setResizable(false);
		
		janela.setVisible(true);
		
		
	}

}
