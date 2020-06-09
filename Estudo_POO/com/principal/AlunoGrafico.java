package com.principal;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.classes.Aluno;

public class AlunoGrafico extends JFrame {
	
	public AlunoGrafico() {
		this.setTitle("Gráfico");
		this.setLocation(500, 400);
		this.setSize(500,500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.getContentPane().setLayout(null);
		Aluno al = new Aluno();
		int[] p = al.lerArquivo();
		
		
		
		JLabel f20 = new JLabel("Qtd de alunos 20 anos:");
		f20.setBounds(10,400,150,30);
		this.add(f20);
		
		JLabel lblP1 = new JLabel();
		lblP1.setBounds(55,390-p[0]*10,30,p[0]*10);
		lblP1.setBackground(Color.CYAN);
		lblP1.setOpaque(true);
		this.add(lblP1);	
		
		
		
		JLabel f30 = new JLabel("Qtd de alunos 30 anos:");
		f30.setBounds(150,400,150,30);
		this.add(f30);
		
		JLabel lblP2 = new JLabel();
		lblP2.setBounds(190 , 390-p[1]*10 , 30 , p[1]*10);
		lblP2.setBackground(Color.GREEN);
		lblP2.setOpaque(true);
		this.add(lblP2);
		
		JLabel f60 = new JLabel("Qtd de alunos Maior 30:");
		f60.setBounds(300,400,150,30);
		this.add(f60);
		
		JLabel lblP3 = new JLabel();
		lblP3.setBounds(370,390-p[2]*10,30,p[2]*10);
		lblP3.setBackground(Color.PINK);
		lblP3.setOpaque(true);
		this.add(lblP3);
		
		
		
		
			
		
		this.setVisible(true);
		
	}
	
}
