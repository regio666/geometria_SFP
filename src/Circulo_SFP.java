/**
 * Clase Circulo extendida de FiguraGeometrica_SFP
 * @author Sergio Fernández Pina
 * @version 1.1
 */

/**
 * Se declara el atributo double radio, para luego pasarle el valor de r en el constructor
 * Con la clase se define el atributo double constante pi=3.1416
 */

public class Circulo_SFP extends FiguraGeometrica_SFP {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
/**
 * Constructor 	
 * @param r :parametro que recoge el radio del circulo
 * @param tipoFigura :cadena que recoje el tipo de figura
 */
	public Circulo_SFP(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	}
/**
 * Se sobrescribe el método area para la subclase Circulo_SFP
 * devuelve el valor del area multiplicando el radio^2* el atributo pi
 */
	@Override
	public double area() {
		return radio * radio * PI;

	}

/**
 * Se sobrescribe el método perimetro para la subclase Circulo_SFP
 * devuelve el valor del perimetro multiplicando radio * 2 * el atributo pi;
 */
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
