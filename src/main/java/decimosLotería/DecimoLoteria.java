package decimosLotería;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class DecimoLoteria {

	private Map<String, Integer> decimos;

	public DecimoLoteria() {
		decimos = new TreeMap<String, Integer>();
		String dec = "";
		for(int i = 0; i < 1000; i++) {
			if(i/10 == 0) {
				dec = "0000";
			}else if(i/100 == 0) {
				dec = "000";
			}else if(i/1000 == 0) {
				dec = "00";
			}
			decimos.put(dec + i, i*20);
		}
	}

	public void guardarEntrada(String decimo, Integer premio) {
		decimos.put(decimo, premio);
	}

	public void borrarEntrada(String decimo) {
		if (decimos.containsKey(decimo)) {
			decimos.remove(decimo);
		}
	}

	public void modificarEntrada(String decimo, Integer premio) {
		this.guardarEntrada(decimo, premio);
	}
	
	public Integer saberPremio(String decimo) {		
		Iterator<Entry<String, Integer>> it = decimos.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			if (e.getKey().equals(decimo)) {
				return e.getValue();
			}
		}
		return -1;
	}
	
	public void mostrarDecimosPremiados() {
		ArrayList<String> dec = new ArrayList<>(decimos.keySet());
		ArrayList<Integer> prem = new ArrayList<>(decimos.values());
		
		for(int i = 0; i<dec.size(); i++) {
			System.out.println("Para el decimo " + dec.get(i) + " el premio es de " + prem.get(i));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((decimos == null) ? 0 : decimos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DecimoLoteria other = (DecimoLoteria) obj;
		if (decimos == null) {
			if (other.decimos != null)
				return false;
		} else if (!decimos.equals(other.decimos))
			return false;
		return true;
	}
	
	
}
