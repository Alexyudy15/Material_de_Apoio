package com.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.classes.Aluno;

public class CadastroAluno extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame janela = new JFrame();
		janela.setTitle("Cadastro de Alunos");
		janela.setSize(450,400);
		janela.setLocationRelativeTo(null);//Centralizar no monitor
		janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//gerenciador de Layout Nenhum
		janela.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id do Aluno:");
		lblId.setBounds(10,10,100,30);
		janela.add(lblId);
		
		JTextField txtId = new JTextField();
		txtId.setBounds(10,40,100,30);
		janela.add(txtId);
		
		
		
		
		JLabel lblNome = new JLabel("Nome do Aluno:");
		lblNome.setBounds(10,70,100,30);
		janela.add(lblNome);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(10,100,400,30);
		janela.add(txtNome);
		
		
		

		
		JLabel lblEmail = new JLabel("E-Mail do Aluno:");
		lblEmail.setBounds(10,130,100,30);
		janela.add(lblEmail);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(10,160,400,30);
		janela.add(txtEmail);
		
				
		JLabel lblIdade = new JLabel("Idade do Aluno:");
		lblIdade.setBounds(10,190,100,30);
		janela.add(lblIdade);
		
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(10,220,100,30);
		janela.add(txtIdade);
		
		

		
		JLabel lblCurso = new JLabel("Entre com o Curso:");
		lblCurso.setBounds(10,250,130,30);
		janela.add(lblCurso);
		
		JTextField txtCurso = new JTextField();
		txtCurso.setBounds(10,280,400,30);
		janela.add(txtCurso);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(310,320,100,30);
		janela.add(btnCadastrar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

					//instancia da classe aluno
				Aluno al = new Aluno();
				al.id = Integer.parseInt(txtId.getText());
				al.nome = txtNome.getText();
				al.email = txtEmail.getText();
				al.idade = Integer.parseInt(txtIdade.getText());
				al.curso = txtCurso.getText();
				
				//chamar o método para cadastrar
				System.out.println(al.cadastro());
				
			}
		});
		
		JButton btnGrafico = new JButton("Abrir Gráfico");
		btnGrafico.setBounds(10, 320, 120, 30);
		janela.add(btnGrafico);
		
		btnGrafico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AlunoGrafico ag = new AlunoGrafico();
				
			}
		});
		
		
		
		janela.setResizable(false);
		
		janela.setVisible(true);
		
		
	}

}
