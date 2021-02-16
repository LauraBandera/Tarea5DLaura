/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author laura
 */
public class Traductor{
	private Map<String, String> traductorIngEsp;

	public Traductor() {
		traductorIngEsp = new TreeMap<String, String>();
	}

	public void guardarEntrada(String pIngles, String pEspaniol) {
		traductorIngEsp.put(pIngles, pEspaniol);
	}

	public void borrarEntrada(String pIngles) {
		if (traductorIngEsp.containsKey(pIngles)) {
			traductorIngEsp.remove(pIngles);
		}
	}

	public void modificarEntrada(String pIngles, String pEspaniol) {
		this.guardarEntrada(pIngles, pEspaniol);
	}

	public String traduccion(String pIngles) {
		Iterator<Entry<String, String>> it = traductorIngEsp.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			if (e.getKey().equals(pIngles)) {
				return e.getValue();
			}
		}
		return "Traducción no encontrada";
	}
	
	public ArrayList<String> creacionListaIngles() {
		ArrayList<String> vocabularioIng = new ArrayList<>();
		Iterator<Entry<String, String>> it = traductorIngEsp.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			vocabularioIng.add(e.getKey());
		}
		return vocabularioIng;
	}
	
	public ArrayList<String> traducciones() {
		ArrayList<String> vocabularioEsp = new ArrayList<>();
		Iterator<Entry<String, String>> it = traductorIngEsp.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			vocabularioEsp.add(e.getValue());
		}
		
		return vocabularioEsp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((traductorIngEsp == null) ? 0 : traductorIngEsp.hashCode());
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
		Traductor other = (Traductor) obj;
		if (traductorIngEsp == null) {
			if (other.traductorIngEsp != null)
				return false;
		} else if (!traductorIngEsp.equals(other.traductorIngEsp))
			return false;
		return true;
	}

}
