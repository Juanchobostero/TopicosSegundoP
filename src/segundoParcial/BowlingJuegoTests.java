package segundoParcial;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BowlingJuegoTests {
	private juegoBowling juego;


	@Test
	public void anotacion_no_puede_ser_menor_a_cero(){
		
		Assert.assertEquals(0, juego.puntaje());
		
	}

}
