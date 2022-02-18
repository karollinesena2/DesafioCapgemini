package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import desafios.DesafioDois;
import desafios.DesafioTres;
import desafios.DesafioUm;

public class DesafiosTest {

	DesafioUm desafioUm = new DesafioUm();
	DesafioTres desafioTres = new DesafioTres();
	DesafioDois desafioDois = new DesafioDois();

	String string = "ifailuhkqq";
	String password = "senhA#$#";

	@Test
	public void testSuccessCreateLadder() {
		String resultExpected = "     *";
		String result = desafioUm.createLadder(6);
		assertEquals(resultExpected, result);
	}
	
	@Test
	public void testSuccessGetAnagram() {
		Integer resultExpected = 3;
		Integer result = desafioTres.getQuantityAnagram(string);
		assertEquals(resultExpected, result);
	}
	
	@Test
	public void testSuccessGet() {
		String resultExpected = "Sua senha foi cadastrada com SUCESSO !";
		desafioDois.createPassword(password);
		assertEquals(resultExpected, desafioDois.msgSucess);
	}
	
}
