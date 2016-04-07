package Calc;

import java.lang.String;
import java.util.Scanner;


public class UI {
	
	String operacion;
	Scanner entrada;

	public UI(){
		entrada = new Scanner(System.in);
	}
public String pedir_cuenta(){
	System.out.println("Ingrese el calculo a procesar:");
	operacion = entrada.next();
	return operacion;
}


}
