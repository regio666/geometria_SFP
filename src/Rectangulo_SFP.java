/**
 * Clase rect�ngulo extendida de FiguraGeometrica_SFP
 * @author Sergio Fern�ndez Pina
 * @version 1.1
 * Con la clase se declaran los atributos double l1 y l2
 */

public class Rectangulo_SFP extends FiguraGeometrica_SFP {
	private double l1;
	private double l2;
	
/**
 * Constructor de la clase, con los siguentes parametros de entrada:
 * @param tipoFigura :cadena con el tipo de figura
 * @param lG :parametro para lado 1
 * @param lP :parametro para lado 2
 */
	public Rectangulo_SFP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Se sobrescribe el m�todo area para la subclase Rectangulo_SFP
 * @return :devuelve el valor del area multiplicando los parametros l1y12
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
/**
 * Se sobrescribe el m�todo perimetro para la subclase Rectangulo_SFP
 * @return :devuelve el valor del perimetro parametro l1*2+parametrol2*2 
 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
