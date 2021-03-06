package domino2;

import java.util.Random;

public class FichaDomino {
	private int superior, inferior;
	static Random aleatorio = new Random();

	public FichaDomino(int superior, int inferior) {
		super();
		
		this.superior = pasoLimites(superior);
		this.inferior = pasoLimites(inferior);
	}
	
	//Método para simplificar código y evitar repeticiones (Se encarga de comprobar los valores límites y poner las
	//restricciones que pone el enunciado
	private int pasoLimites(int posible) {
		if(posible < 0 || posible > 6) {
			if((posible % 2) == 0) {
				return 6;
			}else {
				return 5;
			}
			
		}
		return posible;
	}

	//Constructor por defecto
	public FichaDomino() {
		super();
		//Al no poner nada dentro del constructor, se asume que pone valores por defectos, en este caso el valor
		//por defecto para los enteros es 0, lo que equivale a la ficha blanca
	}

	//Getters y Setters
	public Integer getSuperior() {
		return superior;
	}

	public void setSuperior(int superior) {
		this.superior = pasoLimites(superior);
	}

	public Integer getInferior() {
		return inferior;
	}

	public void setInferior(int inferior) {
		this.inferior = pasoLimites(inferior);
	}

	//Método toString
	@Override
	public String toString() {
		if(inferior == 0 && superior == 0) {
			return "[ | ]";
		}else if(inferior == 0) {
			return "[" + superior + "| ]";
		}else if(superior == 0) {
			return "[ |" + inferior + "]";
		}
		return "[" + superior + "|" + inferior + "]";
		
		/*String cadena="";
                switch (this.superior){
                    case 0:
                        cadena = "[ |";
                        break;
                    default:
                        cadena = "[" + this.superior +" |";
                        break;
                }
                
                
                switch (this.inferior){
                    case 0:
                        cadena += " ]";
                        break;
                    default:
                        cadena += this.inferior + "]";
                        break;
                }
                
                return cadena;
		  */
	}
	
	//Método que devuelve el valor de la suma de ambos números representados
	public byte getValorTotal() {
		return (byte) (superior + inferior);
	}
	
	//Método que genera fichas aleatorias
	public static FichaDomino generaFichaAleatoria() {
		//No hace falta que limitemos valores ya que el constructor lo hace solo
		int sup = aleatorio.nextInt(7);
		int inf = aleatorio.nextInt(7);
		
		FichaDomino ficha = new FichaDomino(sup, inf);
		return ficha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + inferior;
		result = prime * result + superior;
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
		FichaDomino other = (FichaDomino) obj;
		if (inferior != other.inferior)
			return false;
		if (superior != other.superior)
			return false;
		return true;
	}
	
	
	
}
