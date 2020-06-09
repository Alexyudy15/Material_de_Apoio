package com.classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Aluno {
	
	public int id;
	public String nome;
	public String email;
	public int idade;
	public String curso;
	
	public String cadastro() {
		
		FileWriter arquivo = null;
		try {
			arquivo = new FileWriter("c:\\ISO\\texto.csv",true);
			arquivo.append(id + 
					";"+nome+
					";"+email+
					";"+idade+
					";"+curso+"\r\n");
			
			
			arquivo.close();
		}
		catch(Exception e)
		{
			System.out.println("Erro ao tentar criar o arquivo."+e.getMessage());
		}
				
		
		return "Arquivo criado";
	}
	
	
	
	public int[] lerArquivo() {
		
		
		
		
		
		File fr = null;
		/*
		 * Criamos o vetor(array de uma dimensão
		 * chamado faixaEtaria para armazenar a 
		 * quantidade de faixas etárias dos alunos.
		 * Que ficará assim:
		 * Primeira posição: quantos alunos de 0 a 20;
		 * Segunda posição: quantos de 21 a 30;
		 * Terceira posição: quantos alunos acima de 30
		 */
		int[] faixaEtaria = new int[3];
		try {
			fr = new File("c:\\ISO\\texto.csv");
			int p1=0, p2=0, p3=0;
			

			Scanner li = new Scanner(fr);
			
			while(li.hasNextLine()) {
			
					
				String linha = li.nextLine();
						
				String[] colunas = linha.split(";");
				
				if(Integer.parseInt(colunas[3])<=20)
					p1++;
				else if(Integer.parseInt(colunas[3])<=30)
					p2++;
				else
					p3++;			
				
			}
			faixaEtaria[0] = p1;
			faixaEtaria[1] = p2;
			faixaEtaria[2] = p3;
			
			
					
			
		}
		catch(Exception ex) {
			System.out.println("Erro ao tentar ler arquivo: "+ex.getMessage());
		}
		
		return faixaEtaria;
		
		
	}
	

}
