package decimosLotería;

public class PruebaDecimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimoLoteria dl = new DecimoLoteria();
		
		dl.mostrarDecimosPremiados();
		System.out.println("El premio para el décimo 00034 es de " + dl.saberPremio("00034"));
		
	}

}
