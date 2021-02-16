/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author laura
 */
public class Traductor {
    private Map<String, String> traductorIngEsp;

    public Traductor() {
        traductorIngEsp = new HashMap<String, String>();
    }
    
    public void guardarEntrada(String pIngles, String pEspaniol){
        traductorIngEsp.put(pIngles, pEspaniol);
    }
    
    public void borrarEntrada(String pIngles){
        if(traductorIngEsp.containsKey(pIngles)){
            traductorIngEsp.remove(pIngles);
        }
    }
    
    public void modificarEntrada(String pIngles, String pEspaniol){
        this.guardarEntrada(pIngles, pEspaniol);
    }
    
    
    
}
