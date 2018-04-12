package Examen_UF2_Gloria;
public class CalculadoraExam {
	private int num1;
	private int num2;
	public CalculadoraExam(int a, int b) {
		num1=a;
		num2=b;
	}
	public int divideix() {
		int result=num1/num2;
		return result;
	}
	public boolean residu() {
		if(num1 % 2 == 0) {
			return true;
		}
		else return false;
	}
	public int potencia() {
		return (int) Math.pow(num1, num2);
	}
}
