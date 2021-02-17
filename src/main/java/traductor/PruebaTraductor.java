package traductor;

import java.util.ArrayList;

public class PruebaTraductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Traductor t1 = new Traductor();

		t1.guardarEntrada("cat", "gato");
		t1.guardarEntrada("car", "coche");
		t1.guardarEntrada("dog", "gato");
		t1.guardarEntrada("bed", "cama");
		t1.guardarEntrada("ring", "anillo");
		t1.guardarEntrada("floor", "suelo");
		t1.guardarEntrada("bird", "pájaro");
		t1.guardarEntrada("lips", "labios");
		t1.guardarEntrada("finger", "dedo");
		t1.guardarEntrada("head", "cabeza");
		
		t1.modificarEntrada("dog", "perro");
		
		ArrayList<String> vocIng = t1.creacionListaIngles();
		vocIng.forEach(item -> System.out.println(item.toString()));
		
		t1.borrarEntrada("bird");
		System.out.println("La traducción para la palabra ring es: " + t1.traduccion("ring"));
		

		ArrayList<String> vocEsp = t1.traducciones();
		vocEsp.forEach(item -> System.out.println(item.toString()));
		
		
	}

}
