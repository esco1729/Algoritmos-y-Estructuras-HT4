/**
 * 
 */
package src;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Jos� Auy�n
 *
 */
public class ControladorTest {

	/**
	 * Test method for {@link src.Controlador#operacionSuma(double, double)}.
	 */
	@Test
	public final void testOperacionSuma() {

		Controlador testSuma = new Controlador();
		double A1 = 2.0;
		double B1 = 4.0;
		double result = testSuma.operacionSuma(A1, B1);

		assertEquals(6.0, result, 0.0); // TODO
	}

	/**
	 * Test method for {@link src.Controlador#operacionResta(double, double)}.
	 */
	@Test
	public final void testOperacionResta() {
		Controlador testResta = new Controlador();
		double A2 = 7.0;
		double B2 = 5.0;
		double result = testResta.operacionResta(A2, B2);
		assertEquals(2.0, result, 0.0);
	}

	/**
	 * Test method for {@link src.Controlador#operacionMulti(double, double)}.
	 */
	@Test
	public final void testOperacionMulti() {
		Controlador testMulti = new Controlador();
		double A3 = 7.0;
		double B3 = 5.0;
		double result = testMulti.operacionMulti(A3, B3);
		assertEquals(35.0, result, 0.0);// TODO
	}

	/**
	 * Test method for {@link src.Controlador#operacionDivision(double, double)}.
	 */
	@Test
	public final void testOperacionDivision() {
		Controlador testDivision = new Controlador();
		double A4 = 8.0;
		double B4 = 2.0;
		double result = testDivision.operacionDivision(A4, B4);
		assertEquals(4.0, result, 0.0);// TODO
	}

}
