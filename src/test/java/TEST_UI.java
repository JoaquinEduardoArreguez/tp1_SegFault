package calculadoraPorLineaDeComandos;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TEST_UI {
	
	UI ui = new UI();
	
	@Test
	public void test_verificar_arrays_vacios(){
		assertEquals(ui.verificar_arrays_vacios(),true);
	}
	
	@Test
	public void test_verificar_array_operaciones_admitidas(){
		//UI ui = new UI();
		ui.add_operador('+');
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);
		ui.add_operador('-');
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);
		ui.add_operador('*');
		assertEquals(ui.verificar_array_operaciones_admitidas(),false);
		ui.remove_operador(ui.get_operadores_size()-1);
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);		
	}

	@Test
	public void test_procesar_expresion(){
		String expresion = "5-3+9";
		expresion.replace("\n", "");
		ArrayList<Double> operandos_esperado = new ArrayList<Double>();
		operandos_esperado.add((double)5);
		operandos_esperado.add((double)3);
		operandos_esperado.add((double)9);
		ui.procesar_expresion(expresion);
		assertEquals(operandos_esperado,ui.get_operandos());
		//assertEquals(ui.procesar_expresion(expresion),true);
		
	}
}
