/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * interfaz.java
 *
 * Created on 16/11/2011, 07:44:27 AM
 */

package analizador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class interfaz extends javax.swing.JFrame {

    /** Creates new form interfaz */
    List<TokenEvaluado> tokenslist;
    public interfaz() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        menuArchivo = new javax.swing.JMenuBar();
        menuSubir = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jButton1.setText("Analizar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Errores:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Token", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Analizador Léxico");

        menuSubir.setText("Subir Archivo");
        menuSubir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSubirMousePressed(evt);
            }
        });

        jMenu4.setText("Subir Archivo");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        menuSubir.add(jMenu4);

        menuArchivo.add(menuSubir);
        menuArchivo.add(jMenu3);

        setJMenuBar(menuArchivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(319, 319, 319)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
             probarLexerFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public String filePath;
    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu4MouseClicked

    private void menuSubirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSubirMousePressed
        // TODO add your handling code here:
        /*JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {     
            filePath = f.getAbsolutePath();
            jButton1.setEnabled(true);
        }*/
    }//GEN-LAST:event_menuSubirMousePressed
    private String fileName;
    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        if (f != null) {     
            filePath = f.getAbsolutePath();
            fileName = f.getName();
            File output = new File(fileName);
            try {
                output.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jMenu4MousePressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws IOException {
        File err = new File(DEFAULT_ERR_FILE);
        File directorio = new File("C:\\MINICSHARP");
        directorio.mkdir();
        err.createNewFile();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    
    private String newOut="";
    private ArrayList listaErrores;
    private static final String DEFAULT_ERR_FILE = "Output.err";
    
    public void IniciarProcesoDeSalida(){
        Writer writer = null;
        Writer writer2 = null;
    	String output ="";
    	for (int i = 0; i < listaErrores.size(); i++) {
			output = output + listaErrores.get(i).toString()+System.lineSeparator();
		}
    	try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("C:\\MINICSHARP\\"+DEFAULT_ERR_FILE), "utf-8"));
            writer.write(output);
            
            writer2 = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("C:\\MINICSHARP\\"+fileName), "utf-8"));
            writer2.write(newOut);
        } catch (IOException ex) {
            // report
        } finally {
            try {writer.close();writer2.close();} catch (IOException ex) {/*ignore*/}
        }
        JOptionPane.showMessageDialog(null, "Archivos de salida generado, dirigase a: 'C:\\MINICSHARP\\' "+"para ver sus resultados!");
    }
    
    public void probarLexerFile() throws IOException{
        listaErrores = new ArrayList();
        tokenslist = new LinkedList<TokenEvaluado>();
        Reader reader = new BufferedReader(new FileReader(filePath));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        int errores = 0;
        String nuevoString = "";
        String concatenado = "";
        while (true){
            Token token =lexer.yylex();
            nuevoString = nuevoString + concatenado;
            TokenEvaluado tokenitem=new TokenEvaluado();
            if (token == null){
                resultado = resultado +"<<<<<<<<<<<<<ERRORES>>>>>>>>>>>>>>>"+System.getProperty("line.separator")+"TOTAL: "+errores+System.getProperty("line.separator");
                listaErrores.add("<<<<<<<<<<<<<ERRORES>>>>>>>>>>>>>>>");
                listaErrores.add("TOTAL: "+errores);
                if (errores==0) {
                    resultado = resultado+"TODOS LOS TOKENS ENCONTRADOS EN ESTE"+System.getProperty("line.separator")+"ARCHIVO SON ACEPTADOS EN MINI C#!";
                    listaErrores.add("TODOS LOS TOKENS ENCONTRADOS EN ESTE ARCHIVO SON ACEPTADOS EN MINI C#!");
                    newOut = nuevoString;
                }else{
                    resultado = resultado+"NO TODOS LOS TOKENS ENCONTRADOS EN ESTE"+System.getProperty("line.separator")+"ARCHIVO SON ACEPTADOS EN MINI C#!";
                    listaErrores.add("NO TODOS LOS TOKENS ENCONTRADOS EN ESTE ARCHIVO SON ACEPTADOS EN MINI C#!");
                    newOut = "";
                }
                textArea1.setText(resultado);
                tablaResultado();
                IniciarProcesoDeSalida();
                return;
            }
            switch (token){
                case ESPACIO:
                    concatenado = lexer.lexeme;
                break;
                case ARGBD:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Argumento acceso base de datos";
                    concatenado = lexer.lexeme.toUpperCase();
                    tokenslist.add(tokenitem);
                break;
                case SIGNIN:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Signo interrogación";
                    tokenslist.add(tokenitem);
                break;    
                case FUN:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Función";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case ARR:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Arroba";
                    tokenslist.add(tokenitem);
                break;         
                case SLASH:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Slash";
                    tokenslist.add(tokenitem);
                break;        
                case ETI:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Etiqueta inicial";
                    tokenslist.add(tokenitem);
                break;
                case ETF:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Etiqueta final";
                    tokenslist.add(tokenitem);
                break;
                case PAI:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Corchete inicial";
                    tokenslist.add(tokenitem);
                break;
                case PAF:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Corchete final";
                    tokenslist.add(tokenitem);
                break;
                case PUNTO:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="punto";
                    tokenslist.add(tokenitem);
                break;
                case CONSTP:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Constante predefinida";
                    concatenado = lexer.lexeme.toUpperCase();
                    tokenslist.add(tokenitem);
                break;        
                case REAL:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Numero real";
                    tokenslist.add(tokenitem);
                break; 
                case DOSPUNTOS:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Dos puntos";
                    tokenslist.add(tokenitem);
                break; 
                case BOOL:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Booleano";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case CONSTANTE:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Definición de una constante";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case ACCDB:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Acceso a la base de datos";
                    tokenslist.add(tokenitem);
                break;
                case VARPRE:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Variable predefinida";
                    concatenado = lexer.lexeme.toUpperCase();
                    tokenslist.add(tokenitem);
                break;
                case SELEC:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control switch";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case INCLUI:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control include";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case CONTIN:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control continue";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case RET:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control return";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case BREA:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control break";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case COMMENT:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Comentario";
                    tokenslist.add(tokenitem);
                    break;
                case ELS:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control else";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case MIENTR:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control while";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case HMIENTR:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control do-while";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case PARA:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control for";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case PARAC:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control foreach";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case COMILLA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Comilla";
                    tokenslist.add(tokenitem);
                    break;
                case PALABRARESERVADA:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Palabra reservada";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case OPERADORARITMETICO:
                    if(lexer.lexeme.contains(".") && lexer.lexeme.length() > 1){
                        errores++;
                        listaErrores.add("Error, símbolo "+lexer.lexeme+" no reconocido. "+"Línea: "+(lexer.linea+1));
                        resultado=resultado+ "Error, símbolo "+lexer.lexeme+" no reconocido. "+"Línea: "+(1+lexer.linea)+System.getProperty("line.separator");
                        tokenitem.nombre=lexer.lexeme;
                        tokenitem.tipo="NO RECONOCIDO";
                        tokenslist.add(tokenitem);
                    }else{
                        concatenado = lexer.lexeme;
                        tokenitem.nombre=lexer.lexeme;
                        tokenitem.tipo="Operador Aritmético";
                        tokenslist.add(tokenitem);
                    }
                    break;
                case COMA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Coma";
                    tokenslist.add(tokenitem);
                    break;
                case SI:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Sentencia de control if";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                break;
                case CADENA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Cadena de texto";
                    tokenslist.add(tokenitem);
                    break;
                case ENT:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Tipo de dato entero";
                    tokenslist.add(tokenitem);
                    break;
                case REA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Tipo de dato real";
                    tokenslist.add(tokenitem);
                    break;
                case TIPODEDATOL:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Tipo de dato lógico";
                    tokenslist.add(tokenitem);
                    break;
                case ERROR:
                    errores++;
                    listaErrores.add("Error, símbolo "+lexer.lexeme+" no reconocido. "+"Línea: "+(lexer.linea+1));
                    resultado=resultado+ "Error, símbolo "+lexer.lexeme+" no reconocido. "+"Línea: "+(1+lexer.linea)+System.getProperty("line.separator");
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="NO RECONOCIDO";
                    tokenslist.add(tokenitem);
                break;
                case PUNTOYCOMA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Fin de línea";
                    tokenslist.add(tokenitem);
                    break;
                case OPERADORLOGICO:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Operador lógico";
                    tokenslist.add(tokenitem);
                    break;
                case INICIOPHP:
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Inicio php";
                    concatenado = lexer.lexeme.toLowerCase();
                    tokenslist.add(tokenitem);
                    break;
                case FINPHP:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Fin php";
                    tokenslist.add(tokenitem);
                break;
                case LLAVEA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Llave inicial";
                    tokenslist.add(tokenitem);
                break;
                case LLAVEC:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Llave final";
                    tokenslist.add(tokenitem);
                break;
                case ASIGNACION:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Operador de asignación";
                    tokenslist.add(tokenitem);
                break;
                case COMPARACION:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Operador de comparación";
                    tokenslist.add(tokenitem);
                break;
                case DIFERENTE:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Operador de diferencia";
                    tokenslist.add(tokenitem);
                break;
                case TEXTO:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Texto";
                    tokenslist.add(tokenitem);
                break;
                case VARIABLE:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Declaracion de variable";
                    tokenslist.add(tokenitem);
                break;
                case ID: {
                    if (lexer.lexeme.length() > 31) {
                        concatenado = lexer.lexeme.substring(0, 31);
                        tokenitem.nombre = concatenado;
                        tokenitem.tipo="Identificador";
                        tokenslist.add(tokenitem);
                        tokenitem=new TokenEvaluado();
                        errores++;
                        listaErrores.add("Error, símbolo "+lexer.lexeme.substring(32, lexer.lexeme.length()-1)+" no reconocido. "+"Línea: "+(lexer.linea+1));
                        resultado=resultado+ "Error, símbolo "+lexer.lexeme.substring(32, lexer.lexeme.length()-1)+" no reconocido. "+"Línea: "+(1+lexer.linea)+System.getProperty("line.separator");
                        tokenitem.nombre=lexer.lexeme.substring(32, lexer.lexeme.length()-1);
                        tokenitem.tipo="NO RECONOCIDO";
                        tokenslist.add(tokenitem);
                    }else{
                        concatenado = lexer.lexeme;
                        tokenitem.nombre=lexer.lexeme;
                        tokenitem.tipo="Identificador";
                        tokenslist.add(tokenitem);
                    }
                    break;
                }
                case INT:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Entero decimal";
                    tokenslist.add(tokenitem);
                    break;
                case HEXA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Hexadecimal";
                    tokenslist.add(tokenitem);
                    break;
                case PAA:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Paréntesis inicial";
                    tokenslist.add(tokenitem);
                break;
                case PAC:
                    concatenado = lexer.lexeme;
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.tipo="Paréntesis final";
                    tokenslist.add(tokenitem);
                break;
                default:
                    
            }
    }
 }
    public void tablaResultado(){
        Object[][] matriz = new Object [tokenslist.size()][2];
        for(int i =0; i<tokenslist.size();i++){
            matriz[i][0] = tokenslist.get(i).nombre;
            matriz[i][1] = tokenslist.get(i).tipo;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz,
            new String [] {
                "Nombre", "Tipo"
        }
        ));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private javax.swing.JMenuBar menuArchivo;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JMenu menuSubir;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables

}
