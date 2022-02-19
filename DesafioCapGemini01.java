package CapGeminiDesafios;

import java.util.Scanner;

public class DesafioCapGemini01 {

	public static void main(String[] args) {
		try (// Entrada das vari�veis
		Scanner entrada = new Scanner(System.in)) {
			// Leitura das vari�veis
			System.out.println("Digite um n�mero inteiro: ");
			 // Vari�vel i recebe a entrada
			int i = entrada.nextInt();
			// Vari�vel n recebe a vari�vel i
			int n = i; 			   
			// Condi��o "For" para criar um Array
			for ( i = 1; i <= n; i++) { 
			// Condi��o "For" para colocar barras de espa�os em Fun��o da quantidade do n�mero i da entrada
			// A grosso modo, essa condi��o faz com que altura e largura tenham o mesmo valor	
				for (int s = 1; s <= n - i; s++) { 
					
					System.out.print(" ");
				}
			// Condi��o "For" para remover uma unidade do i para criar o tri�ngulo
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
