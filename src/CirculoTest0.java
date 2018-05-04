import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CirculoTest0  {
	
	private Circulo_SFP Circulo;
	private double res;
	
	
	
	@Before
	public void inicio() {
	Circulo=new Circulo_SFP(0.0,"circulo");
	}
	
	@After
	public void fin () {
		Circulo=null;
	}
	
	@Test
	public void testCirculo_SFP() {
		assertNotNull(Circulo);
	}
	
	@Test
	public void testArea() {
		res=Circulo.area();
		System.out.print(res);
		assertEquals(0.0,res,0);
	}

	@Test
	public void testPerimetro() {
		res=Circulo.perimetro();
		System.out.print(res);
		assertEquals(0.0,res,0);
		}

}