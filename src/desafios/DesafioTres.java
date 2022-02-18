package desafios;
import java.util.ArrayList;

public class DesafioTres {

	public void main(String[] args) {
		String string = "ifailuhkqq";
		getQuantityAnagram(string);

	}

	public Integer getQuantityAnagram(String word) {
		ArrayList<String> anagram = new ArrayList<String>();

		// for realizado enquanto o i for menor que o tamanho da string recebida
		for (int i = 0; i < word.length(); i++) {
			// for realizado enquanto o j for menor que o tamanho da string recebida
			for (int j = 1; j < word.length(); j++) {
				// verificando se os caracteres nas posicoes I e J são iguas e se a variavel I e J são diferentes e o I é menor que J;
				if (word.charAt(i) == word.charAt(j) && i != j && i < j) {
					
					// verificando se o caractere da posicao I é igual o da posiçao I+1
					if (word.charAt(i) == word.charAt(i + 1)) {
						
						//pegando parte da string e adicionando no array
						String x = word.substring(i, i + 1);
						anagram.add(x);
					} else {
						
						//pegando parte da string e adicionando no array
						String y = word.substring(i, j);
						String z = word.substring(i + 1, j + 1);
						anagram.add(y);
						anagram.add(z);
					}
				}
			}
		}

		// imprime o tamanho do anagrama
		System.out.println(anagram.size());
		return anagram.size();
	}
}
