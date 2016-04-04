package calculadoraPorLineaDeComandos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TEST_Calc {

	@Test
	public void testResolver() {
		Double num=(double) 5;
		assertEquals(Calc.resolver(null,null),num);
	}
	
	@Test
	public void test_set_data(){
	}

}
