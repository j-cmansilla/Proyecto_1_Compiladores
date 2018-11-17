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
    
    private ArrayList<String> tablaSimbolos;
    
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
    private ArrayList<String> TablaSalida;
    public boolean insertarEnTabla(String id, String tipoDeDato, String tipo){
        String key = id+TablaDeSimbolos.getTabla().getArchivoActual()+TablaDeSimbolos.getTabla().getAmbitoActual();
        String value = "";
        if (tipoDeDato.equals("int")) {
          value = "0";
        }
        if (tipoDeDato.equals("double")) {
          value = "0.00";
        }
        if (tipoDeDato.equals("bool")) {
          value = "true";
        }
        if (tipoDeDato.equals("string")) {
          value = "";
        }
        Value valor = new Value(id, tipoDeDato,TablaDeSimbolos.getTabla().getAmbitoActual(), TablaDeSimbolos.getTabla().getArchivoActual(), TablaDeSimbolos.getTabla().getClaseActual(), tipo, true,TablaDeSimbolos.getTabla().getFuncionActual(),value);
        if(TablaDeSimbolos.getTabla().isEmpty()){
            TablaDeSimbolos.getTabla().put(key,valor);
            TablaDeSimbolos.getTabla().imprimirTabla(valor);
            return true;
        }else{
            if (!TablaDeSimbolos.getTabla().contains(key)){
                TablaDeSimbolos.getTabla().put(key,valor);
                TablaDeSimbolos.getTabla().imprimirTabla(valor);
                return true;
            }else{
                AnalizadorSintacticoInterfaz.getAnalizador().setError("Error semantico, identificador "+id.toString()+" ya fue declarado!");
                AnalizadorSintacticoInterfaz.getAnalizador().error = true;
            }
        }
        return false;
    }
    
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
        TablaSalida = new ArrayList<>();
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
        ArrayList<String> elementosAEliminar = new ArrayList();
        
        for (int i = 0; i < tamanio; i++) {
            if (get(tablaSimbolos.get(i)).getAmbito() == getAmbitoActual()) {
               elementosAEliminar.add(tablaSimbolos.get(i));
               st.remove(tablaSimbolos.get(i));
            } 
        }
        for (int i = 0; i < elementosAEliminar.size(); i++) {
            if (tablaSimbolos.contains(elementosAEliminar.get(i))) {
                tablaSimbolos.remove(elementosAEliminar.get(i));
            }
        }
    }
    
    public boolean asignarValor(String valor){
        if (valor.equals("")) {
            
        }
        return false;
    }
    
    public void imprimirTabla(Value value){
        String salida = "                 "+value.getTipoDato().toUpperCase();
        salida = salida + (System.getProperty("line.separator")+"*************************************"+System.getProperty("line.separator"));
        salida = salida +"#     IDENTIFICADOR: "+value.getNombre()+System.getProperty("line.separator");
        salida = salida +"#     TIPO DE DATO: "+value.getTipo()+System.getProperty("line.separator");
        salida = salida+"#      CLASE: "+value.getClase()+System.getProperty("line.separator");
        salida = salida+"#      FUNCION: "+value.getFuncion()+System.getProperty("line.separator");
        salida = salida+"#      ARCHIVO:"+value.getArchivo()+System.getProperty("line.separator");
        salida = salida+"#      TIPO: "+value.getTipoDato()+System.getProperty("line.separator");
        salida = salida+"#      VALOR: "+value.getValor()+System.getProperty("line.separator");
        salida = salida+"*************************************"+System.getProperty("line.separator");
        AnalizadorSintacticoInterfaz.getAnalizador().setError(salida);
        TablaSalida.add(salida);
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
