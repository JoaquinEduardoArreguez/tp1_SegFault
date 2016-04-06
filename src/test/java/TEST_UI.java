package calculadoraPorLineaDeComandos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TEST_UI {

	/*
	@Test
	public void test_verificar_expresion_correcta() {
		UI ui = new UI();
		ui.add_operador('+');
		ui.add_operador('-');
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);
		assertEquals(ui.verificar_expresion(),false);	//Tiene que dar false por el size de los arrays.
		ui.add_operando((double) 1);
		ui.add_operando((double) 1);
		ui.add_operando((double) 1);
		assertEquals(ui.verificar_expresion(),true);	//Arreglo el size de los arrays.
		ui.add_operador('+');							//Rompo el size agregando una operacion.
		assertEquals(ui.verificar_expresion(),false);	
		ui.add_operando((double) 1);					//Arreglo el size de los arrays.
		assertEquals(ui.verificar_expresion(),true);
		ui.add_operador('*');							//Agrego operacion no admitida y arreglo sizes.
		ui.add_operando((double) 1);
		//assertEquals(ui.verificar_expresion(),false);
		
	}*/
	
	@Test
	public void test_verificar_array_operaciones_admitidas(){
		UI ui = new UI();
		ui.add_operador('+');
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);
		ui.add_operador('-');
		assertEquals(ui.verificar_array_operaciones_admitidas(),true);
		ui.add_operador('*');
		assertEquals(ui.verificar_array_operaciones_admitidas(),false);
	}

}
