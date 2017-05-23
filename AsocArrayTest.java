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
	
	@Test
	public void BuscarClaveEnTabla (){
		AsocArray sc = new AsocArray ("nombre","luis");
		assertEquals (sc.get("nombre"), "luis");
	}
	
	
	@Test(expected = UndefinedKeyException.class)
	public void BuscarClaveEnTablaNoExistente (){
		AsocArray sc = new AsocArray ("nombre","luis");
		assertEquals (sc.get("eh"), "luis");
	}
	
	@Test
	public void BuscarClave()  {
		AsocArray sc = new AsocArray ("nombre","luis");
		assertEquals (sc.getOrElse("hola", "valorPorDefecto2"),"valorPorDefecto2" );
	}
	@Test
	public void existeClaveVerdadero (){
		AsocArray sc = new AsocArray ("nombre","luis");
		assertEquals (sc.containsKey("nombre"), true );
	}
	
	@Test
	public void existeClaveFalso() {
		AsocArray sc = new AsocArray ("nombre","luis");
		assertEquals (sc.containsKey("hola"), false );
	}
	
}