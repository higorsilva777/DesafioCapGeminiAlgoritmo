package CapGeminiDesafios;

import java.util.Scanner;

public class DesafioCapGemini02 {

	public static void main(String[] args) {
		
	        String password;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Digite uma senha: ");
	        password = in.next();

	        boolean hasLetter = false;
	        boolean hasDigit = false;

	        if (password.length() >= 8) {
	            for (int i = 0; i < password.length(); i++) {
	                char x = password.charAt(i);
	                if (Character.isLetter(x)) {

	                    hasLetter = true;
	                }

	                else if (Character.isDigit(x)) {

	                    hasDigit = true;
	                }

	                if(hasLetter && hasDigit){

	                    break;
	                }
	            }
	            if (hasLetter && hasDigit) {
	                System.out.println("Senha forte");
	            } else {
	                System.out.println("Senha fraca");
	            }
	        } else {
	            System.out.println("Digite ao menos 6 caracteres");
	     }
	     in.close();
	}
}

