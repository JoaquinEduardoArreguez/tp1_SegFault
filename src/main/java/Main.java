/**
 * 
 */
package calculadoraPorLineaDeComandos;

/**
 * @author joaquin
 *
 */
public class Main {
	static Calc calculadora;

	/**
	 * 
	 */
	public Main() {
		calculadora = new Calc();
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		calculadora.interfaz.display();

	}

}
