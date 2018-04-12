package Examen_UF2_Gloria;

/* hola que tal això es una altre prova pel git hub */

public class CalculadoraExamTest {
	
	public static void main(String[] args) {
		CalculadoraExam c1= new CalculadoraExam(3, 2); //Per fer el test de la potencia
		CalculadoraExam c2= new CalculadoraExam(10, 2); //Per fer el test del residu, que doni true
		CalculadoraExam c3= new CalculadoraExam(7, 3); //Per fer el test del resido, que doni false
		
		//Test de la potència
		if(c1.potencia() == 9) {
			System.out.println("Test de la potència CORRECTE.");
		}
		else {
			System.out.println("Test de la potència INCORRECTE");
		}
		//Test del residu
		if(c2.residu()) {
			System.out.println("Test del residu true CORRECTE, dona parell.");
		}
		else {
			System.out.println("Test del residu true INCORRECTE, dona senar");
		}
		if(!c3.residu()) {
			System.out.println("Test del residu false CORRECTE, dona senar");
		}
		else {
			System.out.println("Test del residu false INCORRECTE, dona parell");
		}

	}

}
