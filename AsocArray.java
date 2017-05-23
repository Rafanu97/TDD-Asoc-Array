package TDD;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.Test;

public class AsocArray extends Object{
	  
	private class Nodo {
        String clave;
        String valor;
        Nodo siguiente;

        public Nodo() {
            this(null,null,null);
        }

        public Nodo (String clave, String valor, Nodo siguiente) {
            this.clave = clave;
            this.valor = valor;
            this.siguiente = siguiente;
        }
        
    }
    
    private Nodo first;
 

    public AsocArray() {
        this.first = null;
       
    }
    
    public AsocArray (String key, String value) {
        first = new Nodo (key,value,null);
      
    }
    
    public AsocArray (AsocArray array) {
        Nodo sc = array.first;
        Nodo dst = null;
        
        while (sc != null) {
            
            if (dst == null) {
                first = new Nodo(sc.clave,sc.valor,null);
                dst = first;
            }
            else
                dst.siguiente = new Nodo (sc.clave, sc.valor, null);
            
            sc = sc.siguiente;
        }
        
    }
    
    public void put(String key, String value) {
        Nodo curr = first;
        Nodo prev = null;
        
        while (curr != null && curr.clave.compareTo(key) != 0) {
            prev = curr;
            curr = curr.siguiente;
        }
        
        if (curr != null) 
            curr.valor = value;
        else {
            
            if (prev == null)
                first = new Nodo(key,value,null);
            else
                prev.siguiente = new Nodo(key,value,null);
            
        }
        
    }
	
    
    
    public String get(String clave) {
    	 Nodo nodo = first;
         
         while (nodo != null && nodo.clave.compareTo(clave) != 0)
           nodo = nodo.siguiente;
        
      if (nodo==null){
    	  throw new UndefinedKeyException("error");
      }
        
        return nodo.valor;
    }
    
    

	
	
	
	
	
	
	
	
}