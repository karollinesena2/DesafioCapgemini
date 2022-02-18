package desafios;

import java.util.Scanner;

public class DesafioDois {
	public DesafioDois() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String password;
	private static Scanner getPassword;
	private static int firstTry = 0;
	private static int secondTry = 1;
	
	public static String msgSucess = "";

	public static void main(String[] args) {
		callScanner(firstTry);
	}

	public static void createPassword(String password) {
		Integer minimumSize = 6;
		String caracterSpecial = "[a-zA-Z.? ]*";

		// verificando se a string é vazia ou nula
		if (password.isEmpty() || password == null) {
			System.out.println();
			callScanner(secondTry);
			return;
		}

		//verificando se o tamanho da string é menor que o tamanho minimo
		if (password.length() < minimumSize) {
			System.out.println(ErroMessageEnum.SIZE_PASS.msg);
			callScanner(secondTry);
			return;
		}

		// verificando se a string tem letra maiuscula
		if (!checkCaracterUppercase(password)) {
			System.out.println(ErroMessageEnum.UPPERCASE_PASS.msg);
			callScanner(secondTry);
			return;
		}

		// verificando se a string nao contem caractere especial
		if (password.matches(caracterSpecial)) {
			System.out.println(ErroMessageEnum.CARACTER_PASS.msg);
			callScanner(secondTry);
			return;
		}
		
		msgSucess = "Sua senha foi cadastrada com SUCESSO !";
		
		System.out.println(msgSucess);
	}

	// metodo para chamar o input
	public static void callScanner(int n) {
		if (n == firstTry) {
			System.out.printf("Digite sua senha:\n");
		} else {
			System.out.printf("Tente novamente uma senha:\n");
		}
		getPassword = new Scanner(System.in);
		password = getPassword.next();
		
		//passando variavel global para funcionar o test com junit
		createPassword(password);
	}

	// metodo para checar se tem letra maiuscula
	public static boolean checkCaracterUppercase(String pass) {
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isUpperCase(pass.charAt(i))) {
				return true;
			}
		}
		return false;
	}

}
