package com.principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora extends JFrame {

	static double pValor = 0.0;
	static double sValor = 0.0;
	static double rs = 0.0;
	static String op = "";

	
	
	
	public static void main(String[] args) {

		
		JFrame calc = new JFrame();
		calc.setTitle("Calculadora");
		calc.setSize(245, 400);
		calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		calc.setLocationRelativeTo(null);
		calc.setResizable(false);

		calc.getContentPane().setLayout(null);
		JLabel lblDisplay = new JLabel("0", JLabel.RIGHT);
		lblDisplay.setBounds(5, 5, 225, 30);
		lblDisplay.setBackground(Color.WHITE);
		lblDisplay.setOpaque(true);
		calc.add(lblDisplay);

		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");

		JButton btnPonto = new JButton("•");
		JButton btnSoma = new JButton("+");
		JButton btnSubtrair = new JButton("-");
		JButton btnMultiplicar = new JButton("X");
		JButton btnDividir = new JButton("÷");
		JButton btnIgual = new JButton("=");

		btn1.setBounds(5, 50, 50, 50);
		calc.add(btn1);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("1");
				else
					lblDisplay.setText(lblDisplay.getText() + "1");

			}
		});

		btn2.setBounds(64, 50, 50, 50);
		calc.add(btn2);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("2");
				else
					lblDisplay.setText(lblDisplay.getText() + "2");

			}
		});

		btn3.setBounds(123, 50, 50, 50);
		calc.add(btn3);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("3");
				else
					lblDisplay.setText(lblDisplay.getText() + "3");
			}
		});

		btnMultiplicar.setBounds(180, 50, 50, 50);
		calc.add(btnMultiplicar);
		btnMultiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pValor = Double.parseDouble(lblDisplay.getText());
				op = "multiplicar";
				lblDisplay.setText("");
				
				
			}
		});
		
		

		btn4.setBounds(5, 110, 50, 50);
		calc.add(btn4);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("4");
				else
					lblDisplay.setText(lblDisplay.getText() + "4");
			}
		});

		btn5.setBounds(64, 110, 50, 50);
		calc.add(btn5);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("5");
				else
					lblDisplay.setText(lblDisplay.getText() + "5");
			}
		});

		btn6.setBounds(123, 110, 50, 50);
		calc.add(btn6);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (lblDisplay.getText().equals("0"))
					lblDisplay.setText("6");
				else
					lblDisplay.setText(lblDisplay.getText() + "6");
			}
		});

		btnDividir.setBounds(180, 110, 50, 50);
		calc.add(btnDividir);
		btnDividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pValor = Double.parseDouble(lblDisplay.getText());
				op = "dividir";
				lblDisplay.setText("");
				
				
			}
		});
		

		btn7.setBounds(5, 170, 50, 50);
		calc.add(btn7);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(lblDisplay.getText().equals("0"))
				lblDisplay.setText("7");
			else
				lblDisplay.setText(lblDisplay.getText()+"7");
			}
		});
		
		
		
		
		
		

		btn8.setBounds(64, 170, 50, 50);
		calc.add(btn8);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(lblDisplay.getText().equals("0"))
				lblDisplay.setText("8");
			else
				lblDisplay.setText(lblDisplay.getText()+"8");
			}
		});
		
		
		
		
		btn9.setBounds(123, 170, 50, 50);
		calc.add(btn9);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(lblDisplay.getText().equals("0"))
				lblDisplay.setText("9");
			else
				lblDisplay.setText(lblDisplay.getText()+"9");
			}
		});
		
		
		
		

		btnSubtrair.setBounds(180, 170, 50, 50);
		calc.add(btnSubtrair);
		btnSubtrair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pValor = Double.parseDouble(lblDisplay.getText());
				op = "subtrair";
				lblDisplay.setText("");
				
				
			}
		});
		
		
		
		
		

		btnPonto.setBounds(5, 230, 50, 50);
		calc.add(btnPonto);
		btnPonto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent evt) {
				lblDisplay.setText(lblDisplay.getText()+".");
				//Desabilitar o botão ponto
				btnPonto.setEnabled(false);
				
			}
		});
		
		
		

		btn0.setBounds(64, 230, 50, 50);
		calc.add(btn0);
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(lblDisplay.getText().equals("0"))
					lblDisplay.setText("0");
				else
					lblDisplay.setText(lblDisplay.getText()+"0");
			}
		});
		
		
		
		
		

		btnIgual.setBounds(123, 230, 50, 50);
		calc.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(op.equals("soma")) {
					
					rs = pValor + Double.parseDouble(lblDisplay.getText());
					lblDisplay.setText(rs+"");
					
				}
				else if(op.equals("subtrair")) {
					
					rs = pValor - Double.parseDouble(lblDisplay.getText());
					lblDisplay.setText(rs+"");
					
				}
				else if(op.equals("multiplicar")) {
					
					rs = pValor * Double.parseDouble(lblDisplay.getText());
					lblDisplay.setText(rs+"");
					
				}
				else if(op.equals("dividir")) {
					
					rs = pValor / Double.parseDouble(lblDisplay.getText());
					lblDisplay.setText(rs+"");
					
				}



			}
		});	
		
		

		btnSoma.setBounds(180, 230, 50, 50);
		calc.add(btnSoma);
		btnSoma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pValor = Double.parseDouble(lblDisplay.getText());
				op = "soma";
				lblDisplay.setText("");
				
				
			}
		});
		
		
		

		calc.setVisible(true);
	}

}










