package TDD;

import static org.junit.Assert.*;

import org.junit.Test;


public class AsocArrayTest {
	
	@Test
	public void IntroducirDatosConPut()  {
		AsocArray sc = new AsocArray ();
		sc.put("nombre", "luis");
		assertEquals (sc.get("nombre"), "luis");
	}
	
	@Test
	public void IntroducirSoloUnDatoConPut()  {
		AsocArray sc = new AsocArray ();
		sc.put("nombre", null);
		assertEquals (sc.get("nombre"),null);
	}
	
}