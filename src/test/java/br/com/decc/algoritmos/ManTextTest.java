package br.com.decc.algoritmos;

import org.junit.Assert;
import org.junit.Test;

import br.com.decc.data.exception.CharNotFoundException;
import br.com.decc.data.impl.SimpleStream;

/**
 * Classe teste da classe ManText, no método firstChar
 * @author douglas@decc.com.br
 */
public class ManTextTest {

	/*
	 * Sucesso se encontrar o caracter
	 */
	@Test
	public void firstCharTest() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream("aAbaBABacafe")));
	}
	
	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTest() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream("aAbeBABacafe")));
	}
	
	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTestWithNullParameter() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(null));
	}

	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTestWithNullStream() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream(null)));
	}
	
	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTestWithEmptyStream() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream("")));
	}

	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTestWithOnlyVowels() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream("aeiouaeiou")));
	}

	/*
	 * Sucesso se não encontrar o caracter
	 */
	@Test(expected=CharNotFoundException.class)
	public void doNotFindfirstCharTestWithOnlyConsonants() throws Exception {
		Assert.assertEquals('E', ManText.firstChar(new SimpleStream("cbgtphlmn")));
	}
}
