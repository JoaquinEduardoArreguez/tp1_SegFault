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
	operadores = expresion.split("[^*+-]+");
	operandos = expresion.split("[*+-]");
	
}

private boolean check_syntax(){
	if(operadores.length != operandos.length){
		return false;
	}
	
	int contador_por = 0;
	int contador_mas = 0;
	
	for(String aux: operadores){
		if(aux.equals("*")){
			contador_por++;
		}
		
		if(aux.equals("+")){
			contador_mas++;
		}
	}
	
	if((contador_por > 0 && contador_mas > 0) ||  contador_por > 1){
		return false;
	}else{return true;}
	
}

private boolean pasar_a_entero(){

	for(int i = 0 ; i<1000 ; i++){
		operandos_enteros[i]=null;
	
	}
	
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
		if(operadores[indice_operadores].equals("*")){
			
			operandos_enteros[indice_operandos] = operando1_aux*operando2_aux;
		}
		
		operando1_aux = operandos_enteros[indice_operandos];
		
		if(operandos_enteros[indice_operandos+1] != NULL){
		indice_operandos++;
		operando2_aux = operandos_enteros[indice_operandos];
		}
		
	}
	int aux=operandos_enteros[indice_operandos];
	return aux;
	
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
