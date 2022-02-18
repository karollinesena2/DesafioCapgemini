package desafios;

public class DesafioUm {
	
	// alterando o valor da variavel, aumenta ou diminui a escada;
	private static int lenghtLadder = 6;

	public static void main(String[] args) {
		createLadder(lenghtLadder);
	}

	public static String createLadder(int n) {
		String space = " ";
		String asterisc = "*";
		String ladder = "";
		
		// for adicionando espaços;
		for (int i = 0; i < (n - 1); i++) {
			ladder += space;
		}
		
		// for adicinando asteriscos;
		for (int i = 0; i < lenghtLadder; i++ ) {
			//so adiciona ate a string ter o tamanho da variavel lenghtLadder;
			if(ladder.length() < lenghtLadder) {
				ladder += asterisc;
			}
		}

		System.out.println(ladder);
		int p = n-1;
		
		// parar o loop quando o N valer 1;
		if(p == 0) {
			return ladder;
		}
		createLadder(p);

		return ladder;
	}

}
