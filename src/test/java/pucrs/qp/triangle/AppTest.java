package pucrs.qp.triangle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
//    extends TestCase
{

    //testEquilatero
	@Test
    public void testEquilatero()
    {
        int actual = App.identificaTriangulo(5, 5, 5);
        int expected = tipos.EQUILATERO.value();
        assertEquals(expected, actual);
    }
    //testEscaleno
	@Test
    public void testEscaleno()
    {
        int actual = App.identificaTriangulo(2, 3, 4);
        int expected = tipos.ESCALENO.value();
        assertEquals(expected, actual);
    }
	
	@Test
    public void testIsoceles()
    {
        int actual = App.identificaTriangulo(6, 6, 7);
        int expected = tipos.ISOSCELES.value();
        assertEquals(expected, actual);
    }
	
	
	@Test
    public void testInvalido()
    {
        int actual = App.identificaTriangulo(0, 0, 0);
        int expected = tipos.INVALIDO.value();
        assertEquals(expected, actual);
    }
}









