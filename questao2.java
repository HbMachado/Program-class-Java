package atvd51;

import java.util.Scanner; 
public class questao2 {
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		String usuario;
		String senha;
		boolean infoV = false;
		do {
			
			System.out.println("Faça login com o usuário: ");
			usuario = imput.next();
			System.out.println("Digite a senha: ");
			senha = imput.next();
			
		if(usuario.equalsIgnoreCase(senha)) {
			infoV = false;
			System.out.println("O usuário e senha digitadas são iguais, digite novamente");
			
		
		}else {
			infoV = true;
			System.out.println("O usuário: "+usuario);
			System.out.println("Senha: "+senha);
			
		}
		}while(!infoV);
		
	}

}


