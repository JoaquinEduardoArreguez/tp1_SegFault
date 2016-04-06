/**
 * 
 */
package calculadoraPorLineaDeComandos;

import java.util.ArrayList;

/**
 * @author joaquin
 *
 */
public class Calc {
	private UI interfaz;

	/**
	 * 
	 */
	public Calc() {
		set_UI(new UI());
	}
	
	Double resolver(ArrayList<Double> operandos,ArrayList<Character> operadores){
		return (double) 5;
	}
	
	void dar_resultado(Double resultado){
		this.interfaz.display(resultado);
	}
	
	UI get_UI(){
		return interfaz;
	}

	void set_UI(UI interfaz) {
		this.interfaz = interfaz;
	}

}
