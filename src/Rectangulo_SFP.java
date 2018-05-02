/**
 * Clase rectángulo extendida de FiguraGeométrica
 * @author Sergio Fernández Pina
 * @version 1.1
 *
 */

public class Rectangulo_SFP extends FiguraGeometrica_SFP {
	private double l1;
	private double l2;
	
/**
 * Constructor de la clase, con los siguentes parametros de entrada:
 * @param tipoFigura
 * @param lG
 * @param lP
 */
	public Rectangulo_SFP(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Se sobrescribe el método area para la subclase Rectangulo_SFP
 * devuelve el valor del area multiplicando los parametros l1y12
 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
/**
 * Se sobrescribe el método perimetro para la subclase Rectangulo_SFP
 * devulve el valor del perimetro parametro l1*2+parametrol2*2 
 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
