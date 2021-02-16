package domino2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Domino {

    private Set<FichaDomino> juegoDomino;

    public Domino() {
        super();
        this.juegoDomino = new HashSet<>();

        //llenamos el set
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                juegoDomino.add(new FichaDomino(i, j));
            }
        }
    }

    public int numeroFichas() {
        return juegoDomino.size();
    }

    public void introducirFicha(FichaDomino fd) {
        this.comprobarFichaCorrecta(fd);
        juegoDomino.add(fd);
    }

    public boolean tieneFichas() {
        return !juegoDomino.isEmpty();
    }

    public boolean contieneFicha(FichaDomino fd) {
        //return juegoDomino.contains(fd);
        Iterator<FichaDomino> it = juegoDomino.iterator();
        this.comprobarFichaCorrecta(fd);
        while (it.hasNext()) {
            if (it.next().equals(fd)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<FichaDomino> fichas() {
        ArrayList<FichaDomino> listaFichas = new ArrayList<>();
        Iterator<FichaDomino> it = juegoDomino.iterator();
        while (it.hasNext()) {
            listaFichas.add((FichaDomino) it.next());
        }
        return listaFichas;
    }

    public void eliminarFicha(FichaDomino fd) {
        this.comprobarFichaCorrecta(fd);
        if (this.contieneFicha(fd)) {
            juegoDomino.remove(fd);
        }
    }

    private void comprobarFichaCorrecta(FichaDomino fd){
        if(fd.getSuperior() > fd.getInferior()){
            int aux = fd.getInferior();
            fd.setInferior(fd.getSuperior());
            fd.setSuperior(aux);
        }
    }
}
