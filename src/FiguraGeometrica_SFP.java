/**
 * Superclase FiguraGeometrica_SFP 
 * @author Sergio Fern�ndez Pina
 * @version 1.1
 * La clase declara el atributo String tipoFigura :Guardar� el nombre del objeto figuraGeometrica
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
 * M�todo abstracto double area
 * @return :ser� definido por las subclases
 */
	public abstract double area();
/**
 * M�todo abstracto double perimetro
 * @return :se definir� en las subclases
 */
	public abstract double perimetro();

/**
 * M�todo Getter
 * @return :devuelve la cadena tipoFigura
 */
	public String getTipoFigura() {
		return tipoFigura;
	}
	
/**
 * M�todo Setter
 * @param tipoFigura :Recoge y actualiza el par�metro String tipoFigura.
 */
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

/**
 * M�todo semiPerimetro
 * @return :devuelve el valor de la mitad del atributo perimetro
 */
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
}


