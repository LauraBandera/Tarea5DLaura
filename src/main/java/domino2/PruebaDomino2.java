package domino2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PruebaDomino2 {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Domino d1 = new Domino();

        /* Mostramos el número de fichas inicial*/
        System.out.println("El número de fichas actual es de: " + d1.numeroFichas());
        ArrayList<FichaDomino> listaFichas = d1.fichas();
        System.out.println("El listado de las fichas es: ");
        listaFichas.forEach(item -> System.out.println(item.toString()));
        System.out.println("------------------------------------");
        
        FichaDomino fd1 = new FichaDomino(5, 6);
        FichaDomino fd2 = new FichaDomino(5, 2);
        d1.eliminarFicha(fd1);
        d1.eliminarFicha(fd2);
        /* Mostramos el número de ficchas después de borrar una ficha válida*/
        System.out.println("El número de fichas actual es de: " + d1.numeroFichas());
        
        d1.introducirFicha(fd1);
        /* Mostramos el número de ficchas después de añadir una*/
        System.out.println("El número de fichas actual es de: " + d1.numeroFichas());
        
        System.out.println("¿Contiene el set de fichas elemntos? " + d1.tieneFichas());
        
        listaFichas = d1.fichas();
        
        System.out.println("El listado de las fichas es: ");
        listaFichas.forEach(item -> System.out.println(item.toString()));
        System.out.println("------------------------------------");
        
        System.out.println("¿Contiene el set de fichas la ficha [5|6]? " + d1.contieneFicha(fd1));
        System.out.println("¿Contiene el set de fichas la ficha [5|2]? " + d1.contieneFicha(fd2));
        
        Comparator<FichaDomino> criterio = Comparator.comparing(FichaDomino::getSuperior).thenComparing(FichaDomino::getInferior);
        Collections.sort(listaFichas, criterio);
        
        System.out.println("El listado de las fichas es: ");
        listaFichas.forEach(item -> System.out.println(item.toString()));
        System.out.println("------------------------------------");
        
    }
    
}
