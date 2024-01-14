package Calculator_simple.Calculator_simple;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void testAddition() {
		
		double result = App.sum(4.0, 5.0);
		double expected_result=9;
		assertEquals(expected_result,result,0.001);
	}

	
}
