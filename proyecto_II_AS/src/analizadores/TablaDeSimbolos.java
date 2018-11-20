/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analizadores;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import sun.java2d.pipe.ValidatePipe;
/**
 *
 * @author JMansilla
 */
public class TablaDeSimbolos {
    
    /**
     * @return the TipoActual
     */
    public String getTipoActual() {
        return TipoActual;
    }

    /**
     * @param TipoActual the TipoActual to set
     */
    public void setTipoActual(String TipoActual) {
        this.TipoActual = TipoActual;
    }

    /**
     * @return the AmbitoActual
     */
    public int getAmbitoActual() {
        return AmbitoActual;
    }

    /**
     * @param AmbitoActual the AmbitoActual to set
     */
    public void setAmbitoActual(int AmbitoActual) {
        this.AmbitoActual = AmbitoActual;
    }

    /**
     * @return the ArchivoActual
     */
    public String getArchivoActual() {
        return ArchivoActual;
    }

    /**
     * @param ArchivoActual the ArchivoActual to set
     */
    public void setArchivoActual(String ArchivoActual) {
        this.ArchivoActual = ArchivoActual;
    }

    
    
    private static TablaDeSimbolos miTabla;
 
    private final Hashtable<String, Value> st;  
    
    private final ArrayList<Hashtable<String, Value>> tablaSimbolos;
    
    public  static TablaDeSimbolos getTabla() {
        
    if (miTabla==null) {
        miTabla=new TablaDeSimbolos();
    }
        return miTabla;
    }
    
    private String TipoActual;
    private int AmbitoActual;
    private String ArchivoActual; 
    
    public void aumentarAmbito(){
        AmbitoActual = AmbitoActual +1;
    }
    public void reducirAmbito(){
        AmbitoActual = AmbitoActual -1;
    }
    //Constructor
    public TablaDeSimbolos  () {
        st = new Hashtable<>();
        tablaSimbolos = new ArrayList<>();
    }
    
    public Value get(String key) {
        if (key == null) throw new IllegalArgumentException("calls get() with null key");
        return st.get(key);
    }
    
    public void put(String key, Value val) {
        if (key == null) throw new IllegalArgumentException("calls put() with null key");
        if (val == null) st.remove(key);
        else             st.put(key, val);
        System.err.println("");
    }
    
    public void delete(String key) {
        if (key == null) throw new IllegalArgumentException("calls delete() with null key");
        st.remove(key);
    }
    
    public boolean contains(String key) {
        if (key == null) throw new IllegalArgumentException("calls contains() with null key");
        return st.containsKey(key);
    }
    
    public int size() {
        return st.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
