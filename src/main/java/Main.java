/**
 * 
 */
package calculadoraPorLineaDeComandos;

/**
 * @author joaquin
 *
 */
public class Main {
	Calc calculadora;

	/**
	 * 
	 */
	public Main() {
		calculadora = new Calc();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculadora.interfaz.display();

	}

}
