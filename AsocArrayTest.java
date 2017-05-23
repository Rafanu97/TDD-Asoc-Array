package TDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AsocArrayTest {
	
	@Test
	public void ArrayAsociativoPut (){
		AsocArray a = new AsocArray();
		AsocArray b = new AsocArray();
		b.put("nombre", "luis");
		a.put("nombre", "luis");
		assertEquals(a.get("nombre"), b.get("nombre"));
		assertEquals(a.getValue("luis"),b.getValue("luis"));
	}
		
	@Test
	public void AsocArrayVacio (){
		AsocArray a = new AsocArray();	
		assertEquals (a.get(null), null);
		assertEquals(a.getValue(null),null);
	}
	
	
	
	@Test (expected=UndefinedKeyException.class)
	public void getBuscaClaveNoExistente ()  {
		AsocArray a= new AsocArray();
		a.put("nombre", "luis");
		a.get( "e");
	    	
	}
	
	@Test
	public void getValue()  {
		AsocArray a = new AsocArray();
		a.put("nombre", "luis");
		assertEquals("luis", a.get("nombre"));
	}
	
	@Test
	public void getValueOrElse() throws Exception {
		AsocArray a= new AsocArray();
		a.put("nombre", "luis");
		
	}
	
}