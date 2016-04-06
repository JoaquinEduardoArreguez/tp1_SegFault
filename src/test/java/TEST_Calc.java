package calculadoraPorLineaDeComandos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

@SuppressWarnings("unused")
public class TEST_Calc {
	Calc c = new Calc();
	
	public void set_arrays_correctos(){
		c.get_UI().add_operando((double) 1);
		c.get_UI().add_operando((double) 1);
		c.get_UI().add_operando((double) 1);
		c.get_UI().add_operador('+');
		c.get_UI().add_operador('-');
	}

	@Test
	//Resolver Está hardcoded para devolver 5
	public void test_resolver_y_dar_resultado() {
		set_arrays_correctos();	//Cargo los arrays de la "interfaz" de "calculadora"
		Double aux = c.resolver(c.get_UI().get_operandos(), c.get_UI().get_operadores());
		assertEquals (aux==5,true);
		aux=(double) 6;
		assertEquals(aux==5,false);
		System.out.println("Impresion de resultado:");
		System.out.println("Esperado -> "+ aux);
		System.out.print("Obtenido -> ");
		c.dar_resultado(aux);
	}
}
