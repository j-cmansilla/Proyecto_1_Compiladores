/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

/**
 *
 * @author JMansilla
 */
public class Value {

    /**
     * @return the Valor
     */
    public String getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Ambito
     */
    public int getAmbito() {
        return Ambito;
    }

    /**
     * @param Ambito the Ambito to set
     */
    public void setAmbito(int Ambito) {
        this.Ambito = Ambito;
    }

    /**
     * @return the Archivo
     */
    public String getArchivo() {
        return Archivo;
    }

    /**
     * @param Archivo the Archivo to set
     */
    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    /**
     * @return the Clase
     */
    public String getClase() {
        return Clase;
    }

    /**
     * @param Clase the Clase to set
     */
    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    /**
     * @return the TipoDato
     */
    public String getTipoDato() {
        return TipoDato;
    }

    /**
     * @param TipoDato the TipoDato to set
     */
    public void setTipoDato(String TipoDato) {
        this.TipoDato = TipoDato;
    }

    /**
     * @return the EsParametro
     */
    public boolean isEsParametro() {
        return EsParametro;
    }

    /**
     * @param EsParametro the EsParametro to set
     */
    public void setEsParametro(boolean EsParametro) {
        this.EsParametro = EsParametro;
    }

    /**
     * @return the Funcion
     */
    public String getFuncion() {
        return Funcion;
    }

    /**
     * @param Funcion the Funcion to set
     */
    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }

    /**
     * @return the Nombre
     */
    public Value(String Nombre, String Tipo, int Ambito, String Archivo, String Clase, String TipoDato, boolean EsParametro, String Funcion,String Valor) {    
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Ambito = Ambito;
        this.Archivo = Archivo;
        this.Clase = Clase;
        this.TipoDato = TipoDato;
        this.EsParametro = EsParametro;
        this.Funcion = Funcion;
        this.Valor = Valor;
    }
    
    private String Nombre;
    private String Tipo;
    private int Ambito;
    private String Archivo; 
    private String Clase;
    private String TipoDato;
    private boolean EsParametro; 
    private String Funcion;
    private String Valor;
}
