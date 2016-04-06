/**
 * 
 */
package calculadoraPorLineaDeComandos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author joaquin
 * Interfaz de usuario:
 * Se encarga de la entrada y salida de datos por línea de comandos.
 */
public class UI {

	private ArrayList<Double> operandos;
	private ArrayList<Character> operadores;
	private Scanner scanner;
	String op_admitidas = "+,-";
	
	/**
	 * Constructor de UI:
	 * Inicializa los ArrayList "operandos" y "operadores".
	 */
	public UI() {
		operandos	= new ArrayList<Double> ();
		operadores	= new ArrayList<Character>();
		scanner = new Scanner (System.in);
	}
	
	ArrayList<Double> get_operandos(){
		return this.operandos;
	}
	
	ArrayList<Character> get_operadores(){
		return this.operadores;
	}
	
	void display(Object dato){System.out.println(dato);}
	
	@SuppressWarnings("unused")
	private String get_expresion(){
		System.out.println("Escriba la expresión a procesar y presione [ENTER] al finalizar:");
		System.out.println("Sólo se aceptan las operaciones "+ op_admitidas);
		return scanner.nextLine().trim();
	}
	
	Boolean procesar_expresion(String expresion){
		operandos = new ArrayList<Double>();	//Limpio operandos
		operadores = new ArrayList<Character>();//Limpio operadores
		
		ArrayList<String> operandos_string = new ArrayList<String>(Arrays.asList(expresion.split("[+-]")));
		for (String source : operandos_string) {
			try{
				add_operando(Double.parseDouble(source));
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("La operación que ingresó está mal escrita, ingresela correctamente.");
				return false;
				}
		}
		
		ArrayList<String> operadores_string = new ArrayList<String>(Arrays.asList(expresion.split("[^[+-]]*")));
		Iterator<String> operadores_string_iterator = operadores_string.iterator();
		while (operadores_string_iterator.hasNext()){
			System.out.println("operador::"+operadores_string_iterator.next()+"::");
		}
		return true;
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
	
	/*
	Boolean verificar_array_operandos_admitidos(){
		
		for (String source : value)
		
		String regExp = "[\x00-\x20]*[+-]?(NaN|Infinity|((((\p{Digit}+)(\.)?((\p{Digit}+)?)([eE][+-]?(\p{Digit}+))?)|(\.((\p{Digit}+))([eE][+-]?(\p{Digit}+))?)|(((0[xX](\p{XDigit}+)(\.)?)|(0[xX](\p{XDigit}+)?(\.)(\p{XDigit}+)))[pP][+-]?(\p{Digit}+)))[fFdD]?))[\x00-\x20]*";
		Iterator<Double> operandos_iterator = operandos.iterator();
		while (operandos_iterator.hasNext()){
			Double aux=operandos_iterator.next();
			
			
		}
		return false;
	}
	*/
	
	void add_operador(Character a){operadores.add(a);}
	void remove_operador(int index){operadores.remove(index);}
	int get_operadores_size(){return operadores.size();}
	
	void add_operando(Double a){operandos.add(a);}
	void remove_operando(int index){operandos.remove(index);}
	int get_operandos_size(){return operandos.size();}
}
