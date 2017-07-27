package br.com.decc.algoritmos;

import java.util.ArrayList;
import java.util.List;

import br.com.decc.data.Stream;
import br.com.decc.data.exception.CharNotFoundException;

/**
 * Classe utilitária para manipulação de textos
 * @author douglas@decc.com.br
 */
public class ManText {
	
	public  static final String REGEXP_VOGAIS = "[AEIOU]";
	public  static final String REGEXP_CONSOANTES = "[B-DF-HJ-NQ-TV-Z]";
	private static final String BLANK = "";

	/**
	 * Busca a primeira vogal não repetida após uma consoante que foi precedida por uma vogal a partir de um Stream simples
	 * @param input Stream simples
	 * @return char encontrado que atende as condições
	 * @throws CharNotFoundException
	 */
	public static char firstChar(Stream input) throws CharNotFoundException {

		String findChar = BLANK;

		if(input!=null && input.hasNext()){
			String curChar = BLANK;
			String lastChar = BLANK;
			curChar = String.valueOf(input.getNext()).toUpperCase();
			List<String> last = new ArrayList<>();

			while (input.hasNext()) {
				lastChar = curChar;
				last.add(lastChar);
				curChar = String.valueOf(input.getNext()).toUpperCase();

				if (curChar.matches(REGEXP_VOGAIS)) {
					if (lastChar.matches(REGEXP_CONSOANTES)) {
						if (!last.contains(curChar) && BLANK.equals(findChar)) {
							findChar = curChar;
						}else{
							if(findChar.equals(curChar)){
								findChar = BLANK;
							}
						}
					}
				}
			}
		}
		if(BLANK.equals(findChar)) throw new CharNotFoundException("Nenhum caracter encontrado");
		return findChar.charAt(0);
	}
}
