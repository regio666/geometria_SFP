/**
 * Superclase FiguraGeometrica_SFP 
 * @author Sergio Fernández Pina
 * @version 1.1
 * La clase declara el atributo String tipoFigura :Guardará el nombre del objeto figuraGeometrica
 */
public abstract class FiguraGeometrica_SFP {

	protected String tipoFigura;

/**
 * Constructor de la clase superclase,   
 * @param tipoFigura :Parametro para guardar la cadena "nombre figura" de la subclase
 */
	public FiguraGeometrica_SFP(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

/**
 * Método abstracto double area
 * @return :será definido por las subclases
 */
	public abstract double area();
/**
 * Método abstracto double perimetro
 * @return :se definirá en las subclases
 */
	public abstract double perimetro();

/**
 * Método Getter
 * @return :devuelve la cadena tipoFigura
 */
	public String getTipoFigura() {
		return tipoFigura;
	}
	
/**
 * Método Setter
 * @param tipoFigura :Recoge y actualiza el parámetro String tipoFigura.
 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

/**
 * Método semiPerimetro
 * @return :devuelve el valor de la mitad del atributo perimetro
 */
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}


