package Calc;

public class Main {

	static Calculadora Calc;
	
	public Main(){

	}
	
	public static void main(String[] args) {
		Calc = new Calculadora();
		while(true){
		Calc.calcular();
		}
	}

}
