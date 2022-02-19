package CapGeminiDesafios;

import java.util.Scanner;

public class DesafioCapGemini01 {

	public static void main(String[] args) {
		try (// Entrada das variáveis
		Scanner entrada = new Scanner(System.in)) {
			// Leitura das variáveis
			System.out.println("Digite um número inteiro: ");
			 // Variável i recebe a entrada
			int i = entrada.nextInt();
			// Variável n recebe a variável i
			int n = i; 			   
			// Condição "For" para criar um Array
			for ( i = 1; i <= n; i++) { 
			// Condição "For" para colocar barras de espaços em Função da quantidade do número i da entrada
			// A grosso modo, essa condição faz com que altura e largura tenham o mesmo valor	
				for (int s = 1; s <= n - i; s++) { 
					
					System.out.print(" ");
				}
			// Condição "For" para remover uma unidade do i para criar o triângulo
				for (int j = 1; j <= i; j++) { 
					System.out.print("*");
				}
			// Quebra de linha
				System.out.println();
			}
			// Fechamento da entrada
		}
	}
}
