/**
 * 
 */
package calculadoraPorLineaDeComandos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author joaquin
 * Interfaz de usuario:
 * Se encarga de la entrada y salida de datos por línea de comandos.
 */
public class UI {

	private ArrayList<Double> operandos;
	private ArrayList<Character> operadores;
	
	/**
	 * Constructor de UI:
	 * Inicializa los ArrayList "operandos" y "operadores".
	 */
	public UI() {
		operandos	= new ArrayList<Double> ();
		operadores	= new ArrayList<Character>();
	}
	
	void display(){
		System.out.println("Resultado");
	}
	
	@SuppressWarnings("unused")
	private void get_expresion(){
	}
	
	Boolean verificar_expresion(){
		if(verificar_arrays_vacios())return false;
		if (operandos.size()==operadores.size()+1) return true;
		return false;
	}
	
	Boolean verificar_arrays_vacios(){
		if (operandos.isEmpty() && operadores.isEmpty()) return true;
		return false;
	}
	
	Boolean verificar_array_operaciones_admitidas(){
		Iterator<Character> operadores_iterator = operadores.iterator();
		while (operadores_iterator.hasNext()){
			if (operadores_iterator.next() == '+' || 
				operadores_iterator.next() == '-' ||
				operadores_iterator.next() == '*' ||
				operadores_iterator.next() == '/' ||
				operadores_iterator.next() == '%')
			{
				return true;
			}
		}
		return false;
	}
	
	Boolean verificar_array_operandos_admitidos(){
		@SuppressWarnings("unused")
		Iterator<Double> operandos_iterator = operandos.iterator();
		return false;
	}
	
	void set_data(){
		this.operadores.add('+');
		this.operadores.add('-');
		this.operadores.add('-');
		
		this.operandos.add((double) 1);
		this.operandos.add((double) 2);
		this.operandos.add((double) 0);
		this.operandos.add((double) 1);
			
	}
	
	@SuppressWarnings("unused")
	private void add_operador(Character a){
		this.operadores.add(a);
	}
}
