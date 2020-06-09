package br.com.java;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "Corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "São Paulo";
		System.out.println("======Fundamentos do Array");
		System.out.println("Exemplo 1: Sem Array");
		System.out.println("Time: " + time1);
		
		//a linha abaixo cria um vetor simples
		String[] times = {"Corinthians","Palmeiras","Santos","São Paulo"};
		System.out.println("Exemplo 2: Com Array");
		//a linha abaixo recupera o conteúdo do índice [2] do Array
		System.out.println("Time: " + times[2]);
		// a linha abaixo modifica o conteúdo do indice [2] do array
		times[2] = "Flamengo";
				System.out.println("Exemplo 3: Modificando um Array");
		System.out.println("Time: " + times[2]);
		//obtendo o tamanho total do Array
		System.out.println("Total de times:" + times.length);
		
	}

}
