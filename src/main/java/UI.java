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
	
	ArrayList<Double> get_operandos(){
		return this.operandos;
	}
	
	ArrayList<Character> get_operadores(){
		return this.operadores;
	}
	
	void display(Object dato){
		System.out.println(dato);
	}
	
	@SuppressWarnings("unused")
	private void get_expresion(){
	}
	
	Boolean verificar_expresion(){
		if(!verificar_arrays_vacios()){
			if (operandos.size()==operadores.size()+1){
				if (verificar_array_operaciones_admitidas()){
					return true;
				}
			}
		}
		return false;
	}
	
	Boolean verificar_arrays_vacios(){
		if (operandos.isEmpty() || operadores.isEmpty()) return true;
		return false;
	}
	
	Boolean verificar_array_operaciones_admitidas(){
		Iterator<Character> operadores_iterator = operadores.iterator();
		while (operadores_iterator.hasNext()){
			Character aux=operadores_iterator.next();
			if (aux != '+' && aux != '-') return false;
		}
		return true;
	}
	
	Boolean verificar_array_operandos_admitidos(){
		@SuppressWarnings("unused")
		Iterator<Double> operandos_iterator = operandos.iterator();
		return false;
	}
	
	void add_operador(Character a){operadores.add(a);}
	void remove_operador(int index){operadores.remove(index);}
	int get_operadores_size(){return operadores.size();}
	
	void add_operando(Double a){operandos.add(a);}
	void remove_operando(int index){operandos.remove(index);}
	int get_operandos_size(){return operandos.size();}
}
