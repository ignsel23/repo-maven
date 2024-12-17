import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	void testSomma() 
	{
		Calcolatrice c = new Calcolatrice();
		
	double res = c.somma(5,6);
		
		assertEquals(11,res);
	}

	@Test
	void publictestSomma2() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(6,6);
		
		assertEquals(12,res);
	}
	
	@Test
	void testSommaNegativo() 
	{
		Calcolatrice c = new Calcolatrice();
		
		double res = c.somma(10,-5);
		
		assertEquals(10,res);
	}
}
