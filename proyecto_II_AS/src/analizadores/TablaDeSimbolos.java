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
     * @return the ClaseActual
     */
    public String getClaseActual() {
        return ClaseActual;
    }

    /**
     * @param ClaseActual the ClaseActual to set
     */
    public void setClaseActual(String ClaseActual) {
        this.ClaseActual = ClaseActual;
    }

    /**
     * @return the FuncionActual
     */
    public String getFuncionActual() {
        return FuncionActual;
    }

    /**
     * @param FuncionActual the FuncionActual to set
     */
    public void setFuncionActual(String FuncionActual) {
        this.FuncionActual = FuncionActual;
    }
    
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
    
    private final ArrayList<String> tablaSimbolos;
    
    public  static TablaDeSimbolos getTabla() {
        
    if (miTabla==null) {
        miTabla=new TablaDeSimbolos();
    }
        return miTabla;
    }
    
    private String TipoActual;
    private int AmbitoActual;
    private String ArchivoActual; 
    private String ClaseActual; 
    private String FuncionActual;
    
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
    
    public void agregarTemporales(String llave){
        tablaSimbolos.add(llave);
    }
    
    public void removerTemporales(){
        int tamanio = tablaSimbolos.size();
        for (int i = 0; i < tamanio; i++) {
            if (get(tablaSimbolos.get(i)).getAmbito() == getAmbitoActual()) {
               delete(tablaSimbolos.get(i));
                tablaSimbolos.remove(i); 
            } 
        }
    }
    
    public void imprimirTabla(Value value){
        AnalizadorSintacticoInterfaz.getAnalizador().setError("");
        AnalizadorSintacticoInterfaz.getAnalizador().setError("####################################");
        AnalizadorSintacticoInterfaz.getAnalizador().setError("Nombre: "+value.getNombre());
        AnalizadorSintacticoInterfaz.getAnalizador().setError("Tipo: "+value.getTipo());
        AnalizadorSintacticoInterfaz.getAnalizador().setError("Clase: "+value.getClase());
        AnalizadorSintacticoInterfaz.getAnalizador().setError("Funcion: "+value.getFuncion());
        AnalizadorSintacticoInterfaz.getAnalizador().setError("Archivo:"+value.getArchivo());
        AnalizadorSintacticoInterfaz.getAnalizador().setError("####################################");
        AnalizadorSintacticoInterfaz.getAnalizador().setError("");
    }
    
    public void put(String key, Value val) {
        if (key == null) throw new IllegalArgumentException("calls put() with null key");
        if (val == null) {
            st.remove(key);
        }else{
            st.put(key, val);
            agregarTemporales(key);
        }  
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
