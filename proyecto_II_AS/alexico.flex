
/* --------------------------Codigo de Usuario----------------------- */
package analizadores;

import java_cup.runtime.*;
import java.io.Reader;

%% //inicio de opciones

/* ------ Seccion de opciones y declaraciones de JFlex -------------- */

%class AnalizadorLexico

/*
    Activar el contador de lineas, variable yyline
    Activar el contador de columna, variable yycolumn
*/
%line
%column

/*
   Activamos la compatibilidad con Java CUP para analizadores
   sintacticos(parser)
*/
%cup

/*
    Declaraciones

    El codigo entre %{  y %} sera copiado integramente en el
    analizador generado.
*/
%{
    /*  Generamos un java_cup.Symbol para guardar el tipo de token
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }

    /* Generamos un Symbol para el tipo de token encontrado
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
%}


/*
    Macro declaraciones

    Declaramos expresiones regulares que despues usaremos en las
    reglas lexicas.
*/

/*  Un salto de linea es un \n, \r o \r\n dependiendo del SO   */

WHITE=[ \t\r\n]
L = [a-zA-Z_]
D = [0-9]
ComentarioError   = "/*" [^*]+
Archivo = "<" ~{LineTerminator}
Includes = "#include"
OperadoresA = "+"|"*"|"/"|"%"
OperadoresC = "<"|"<="|">"|">="|"=="|"!="
OperadoresL = "&&"|"||"
Identificador = ({L}|"_") ({L}|{D}|"_")*
//Numeros reales
Real = [0-9]+\.?[0-9]+([eE]{Entero}.?[0-9]*)?
Hexadecimal = "0"("X"|"x")({D}|("A"|"B"|"C"|"D"|"E"|"F")|("a"|"b"|"c"|"d"|"e"|"f"))*
Entero = [0-9]{D}*
Textos = (\"([^\"\\\n]|\\.)*\")
textoError = "\"" ~[\n]
TipoDeDatoL = "true"|"false"
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
Comment = {TraditionalComment} | {EndOfLineComment}
TraditionalComment   = "/*" ~"*/"

EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?



/* Espacio es un espacio en blanco, tabulador \t, salto de linea
    o avance de pagina \f, normalmente son ignorados */


/* Una literal entera es un numero 0 oSystem.out.println("\n*** Generado " + archNombre + "***\n"); un digito del 1 al 9
    seguido de 0 o mas digitos del 0 al 9 */



%% //fin de opciones
/* -------------------- Seccion de reglas lexicas ------------------ */

/*
   Esta seccion contiene expresiones regulares y acciones.
   Las acciones son código en Java que se ejecutara cuando se
   encuentre una entrada valida para la expresion regular correspondiente */

   /* YYINITIAL es el estado inicial del analizador lexico al escanear.
      Las expresiones regulares solo serán comparadas si se encuentra
      en ese estado inicial. Es decir, cada vez que se encuentra una
      coincidencia el scanner vuelve al estado inicial. Por lo cual se ignoran
      estados intermedios.*/

<YYINITIAL> {
    //{ComentarioError} {AnalizadorSintacticoInterfaz.getAnalizador().setError("Error Lexico, token:   "+yytext()+"     , linea: "+(1+yyline)+" , columna: "+(yycolumn+1)+". Token no valido!");AnalizadorSintacticoInterfaz.getAnalizador().error = true;}
    {Includes} {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
                TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.INCLUDES, yytext()); }
    {Archivo} {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
                TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.ARCHIVO, yytext()); }
    {Comment} {}
    //{textoError}   {AnalizadorSintacticoInterfaz.getAnalizador().setError("Error Lexico, token:   "+yytext()+"     , linea: "+(1+yyline)+" , columna: "+(yycolumn+1)+". Token no valido!");AnalizadorSintacticoInterfaz.getAnalizador().error = true;}


    ";"     {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
                TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.PUNTOYCOMA, yytext()); }

    "[]"   {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.CORCH, yytext()); }

    "const"   {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
        return symbol(sym.CONSTANTE, yytext()); }

    "void"   {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.VD, yytext()); }

    "("      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.PAR_A, yytext()); }

    ")"      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.PAR_C, yytext()); }

    ","     {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.COMA, yytext()); }

    "class" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.CLASE, yytext()); }

    "extends" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.HERENCIA, yytext()); }

    "implements" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.IMPLEMENTA, yytext()); }

    "interface" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.INTERFAZ, yytext()); }

    "if" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.SI, yytext()); }

    "else" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.SINO, yytext()); }

    "for" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.PARA, yytext()); }

    "while" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.MIENTRAS, yytext()); }

    "return" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.RETORNA, yytext()); }

    "break" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.ROMPE, yytext()); }

    "Print" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.IMPRIMIR, yytext()); }

    "this" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.ESTO, yytext()); }

    "int" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.TDE, yytext()); }

    "double" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.TDD, yytext()); }

    "bool" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.TDB, yytext()); }

    "string" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.TDS, yytext()); }

    "[" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.CORCH_A, yytext()); }

    "]" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.CORCH_C, yytext()); }

    "{" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.LL_A, yytext()); }

    "}" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.LL_C, yytext()); }


    "!"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.NEGACION, yytext()); }

    "Malloc"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.M_OC, yytext()); }

    "ReadInteger"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.LEER_EN, yytext()); }

    "ReadLine" {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.LEER_LIN, yytext()); }

    "."  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.PUNTO, yytext()); }

    "null"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.NULO, yytext()); }

    "New"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.NUEVO, yytext()); }

    "NewArray"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.NUEVO_A, yytext()); }

    "GetByte"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.OBTENER_BYTES, yytext()); }

    "SetByte"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.SET_BYTES, yytext()); }

    "-"  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.MENOS, yytext()); }

    "="  {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                return symbol(sym.IGUAL, yytext()); }


    {TipoDeDatoL} {return symbol(sym.BOOLCONST, yytext()); }

    {OperadoresA}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.OPERADORESA, yytext()); }

    /* Si se encuentra un entero, se imprime, se regresa un token numero
        que representa un entero y el valor que se obtuvo de la cadena yytext
        al convertirla a entero. yytext es el token encontrado. */
    {Real}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.DECIMAL, yytext()); }

    {Entero}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.ENTERO, yytext()); }

    {Hexadecimal}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.ENTERO, yytext()); }

    {OperadoresC}     {return symbol(sym.OPERADORESC, yytext());}

    {OperadoresL}     {return symbol(sym.OPERADORESL, yytext());}

    {Identificador}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.IDENTIFICADOR, yytext()); }
    {Textos}      {   TablaDeSimbolos.getTabla().setLinea(yyline+1);
            TablaDeSimbolos.getTabla().setColumna(yycolumn+1);
                      return symbol(sym.TEXTO, yytext()); }

    /* No hace nada si encuentra el espacio en blanco */
    {WHITE}       { /* ignora el espacio */ }
    {LineTerminator} {}


}


/* Si el token contenido en la entrada no coincide con ninguna regla
    entonces se marca un token ilegal */
.                    { AnalizadorSintacticoInterfaz.getAnalizador().setError("Error Lexico, token:   "+yytext()+"     , linea: "+(1+yyline)+" , columna: "+(yycolumn+1)+". Token no valido!");AnalizadorSintacticoInterfaz.getAnalizador().error = true;}
