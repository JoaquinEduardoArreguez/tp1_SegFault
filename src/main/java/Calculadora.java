package Calc;


public class Calculadora {

	private static final Integer NULL = null;
	UI pantalla;
	private String operandos[];
	Integer operandos_enteros[];
	private	String operadores[];
	private String expresion;
	
	public Calculadora(){
		
		pantalla = new UI();
		operandos_enteros = new Integer[1000];
		
	}
	
public void cargar_datos(){
	expresion = pantalla.pedir_cuenta();
	//expresion = "12+24-16-45";
	operadores = expresion.split("[^+-]+");
	operandos = expresion.split("[+-]");
	

	
}

private boolean check_syntax(){
	if(operadores.length != operandos.length){
		return false;
	}else{return true;}
	
}

private boolean pasar_a_entero(){

	for(int i = 0 ; i<operandos.length ; i++){
		try{operandos_enteros[i] = Integer.parseInt(operandos[i]);	}
		catch(NumberFormatException e){
			return false;
		}
	}
	return true;
}

private int hacer_cuenta(){
	
	int indice_operandos = 0;
	int operando1_aux, operando2_aux;
	
	operando1_aux = operandos_enteros[indice_operandos];
	indice_operandos++;
	operando2_aux = operandos_enteros[indice_operandos];
	
	for(int indice_operadores = 1; indice_operadores<operadores.length ; indice_operadores++){
		
		if(operadores[indice_operadores].equals("+")){
			operandos_enteros[indice_operandos] = operando1_aux+operando2_aux;
		}
		if(operadores[indice_operadores].equals("-")){
			
			operandos_enteros[indice_operandos] = operando1_aux-operando2_aux;
	
		}
		operando1_aux = operandos_enteros[indice_operandos];
		
		if(operandos_enteros[indice_operandos+1] != NULL){
		indice_operandos++;
		operando2_aux = operandos_enteros[indice_operandos];
		}
		
	}
	
	return operandos_enteros[indice_operandos];
	
}


public void calcular(){
	int resultado = 0;
	cargar_datos();
	
	if(check_syntax()){
	
	if(!pasar_a_entero()){
		System.out.println("Checkee su sintaxis.");
		return;
	}
	resultado = hacer_cuenta();
	System.out.println(expresion+" = "+resultado);
	}else{
		System.out.println("Checkee su sintaxis.");
	}
	
	
}

}
