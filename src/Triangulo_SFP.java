/**
 * Triangulo_SFP subclase extendida de FiguraGeometrica_SFP
 * @author Sergio Fernández Pina
 * @version 1.1
 * Declaramos los atributos double lado1,lado2,lado3
 */
public class Triangulo_SFP extends FiguraGeometrica_SFP {
	private double lado1;
	private double lado2;
	private double lado3;
/**
 * Constructor de la clase
 * @param tipoFigura :Cadena tipoFigura
 * @param lado1		 :Recibe el parametro para el atributo lado1
 * @param lado2		 :Recibe el parametro para el atributo lado2
 * @param lado3		 :Recibe el parametro para el atributo lado3
 */
	public Triangulo_SFP(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

/**
 * Se sobrescribe el método perimetro para la subclase 
 * @return :devuelve el valor del perimetro sumando lado1 + lado2 + lado2
 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

/**
 * Se sobrescribe el método area para la subclase 
 * el metodo llama al método de la superclase semiPerimetro
 * @return :devuelve el valor del area, raiz caudrada de (sp*(sp-lado1)*(sp-lado2)*(sp-lado3))
 */
	
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
}
