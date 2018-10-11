/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadores;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author arturo
 */
public class Principal {

    public final static int GENERAR = 1;
    public final static int EJECUTAR = 2;
    public final static int SALIR = 3;

    /**
     * Es un menu para elegir entre generar el analizador lexico y sintactico, o
     * ejecutarlos sobre un archivo de pruebas.
     *
     * @param args the command line arguments
     * @return 
     */
    
    public String generarArchivos(){
        java.util.Scanner in = new Scanner(System.in);
        String archLexico = "alexico.flex";
        String archSintactico = "asintactico.cup";
        String[] alexico = {archLexico};
        String[] asintactico = {"-parser", "AnalizadorSintactico", archSintactico};
        jflex.Main.main(alexico);
        try {
            java_cup.Main.main(asintactico);
        } catch (Exception ex) {
            return ex.toString();
        }
        //movemos los archivos generados
        boolean mvAL = moverArch("AnalizadorLexico.java");
        boolean mvAS = moverArch("AnalizadorSintactico.java");
        boolean mvSym= moverArch("sym.java");
        if(mvAL && mvAS && mvSym){
            return "Generados exitosamente!"+System.getProperty("line.separator");
        }
        return "ERROR!";
    }
    
    public String ejecutarAnalizador(String pathArchivo){
        String[] archivoPrueba = {pathArchivo};
        //AnalizadorSintactico(archivoPrueba);
        AnalizadorSintactico analizador = new AnalizadorSintactico();
        analizador.analizarSintacticamente(archivoPrueba);
        System.out.println("Ejecutado!");
        return "El archivo analizado no contiene errores!";
    }
    
    public static void main(String[] args) {
        AnalizadorSintacticoInterfaz.getAnalizador().show();
    }

    public static boolean moverArch(String archNombre) {
        boolean efectuado = false;
        File arch = new File(archNombre);
        if (arch.exists()) {
            System.out.println("\n*** Moviendo " + arch + " \n***");
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "analizadores" + File.separator + arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if (arch.renameTo(new File(nuevoDir))) {
                System.out.println("\n*** Generado " + archNombre + "***\n");
                efectuado = true;
            } else {
                System.out.println("\n*** No movido " + archNombre + " ***\n");
            }

        } else {
            System.out.println("\n*** Codigo no existente ***\n");
        }
        return efectuado;
    }
}