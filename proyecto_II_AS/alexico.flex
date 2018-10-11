
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
OperadoresA = "+"|"*"|"/"|"%"
OperadoresC = "<"|"<="|">"|">="|"=="|"!="
OperadoresL = "&&"|"||"
Identificador = ({L}|"_") ({L}|{D}|"_")*
//Numeros reales
Real = [0-9]+\.?[0-9]+([eE]{Entero}.?[0-9]*)?
Hexadecimal = "0"("X"|"x")({D}|("A"|"B"|"C"|"D"|"E"|"F")|("a"|"b"|"c"|"d"|"e"|"f"))*
Entero = [0-9]{D}*
Textos = (\"([^\"\\\n]|\\.)*\")
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
    {Comment} {}


    ";"     {   System.out.print(yytext());
                      return symbol(sym.PUNTOYCOMA, yytext()); }

    "[]"   {   System.out.print(yytext());
                return symbol(sym.CORCH, yytext()); }

    "void"   {   System.out.print(yytext());
                return symbol(sym.VD, yytext()); }

    "("      {   System.out.print(yytext());
                return symbol(sym.PAR_A, yytext()); }

    ")"      {   System.out.print(yytext());
                return symbol(sym.PAR_C, yytext()); }

    ","     {   System.out.print(yytext());
                return symbol(sym.COMA, yytext()); }

    "class" {   System.out.print(yytext());
                return symbol(sym.CLASE, yytext()); }

    "extends" {   System.out.print(yytext());
                return symbol(sym.HERENCIA, yytext()); }

    "implements" {   System.out.print(yytext());
                return symbol(sym.IMPLEMENTA, yytext()); }

    "interface" {   System.out.print(yytext());
                return symbol(sym.INTERFAZ, yytext()); }

    "if" {   System.out.print(yytext());
                return symbol(sym.SI, yytext()); }

    "else" {   System.out.print(yytext());
                return symbol(sym.SINO, yytext()); }

    "for" {   System.out.print(yytext());
                return symbol(sym.PARA, yytext()); }

    "while" {   System.out.print(yytext());
                return symbol(sym.MIENTRAS, yytext()); }

    "return" {   System.out.print(yytext());
                return symbol(sym.RETORNA, yytext()); }

    "break" {   System.out.print(yytext());
                return symbol(sym.ROMPE, yytext()); }

    "Print" {   System.out.print(yytext());
                return symbol(sym.IMPRIMIR, yytext()); }

    "this" {   System.out.print(yytext());
                return symbol(sym.ESTO, yytext()); }

    "int" {   System.out.print(yytext());
                return symbol(sym.TDE, yytext()); }

    "double" {   System.out.print(yytext());
                return symbol(sym.TDD, yytext()); }

    "bool" {   System.out.print(yytext());
                return symbol(sym.TDB, yytext()); }

    "string" {   System.out.print(yytext());
                return symbol(sym.TDS, yytext()); }

    "[" {   System.out.print(yytext());
                return symbol(sym.CORCH_A, yytext()); }

    "]" {   System.out.print(yytext());
                return symbol(sym.CORCH_C, yytext()); }

    "{" {   System.out.print(yytext());
                return symbol(sym.LL_A, yytext()); }

    "}" {   System.out.print(yytext());
                return symbol(sym.LL_C, yytext()); }


    "!"  {   System.out.print(yytext());
                return symbol(sym.NEGACION, yytext()); }

    "Malloc"  {   System.out.print(yytext());
                return symbol(sym.M_OC, yytext()); }

    "ReadInteger"  {   System.out.print(yytext());
                return symbol(sym.LEER_EN, yytext()); }

    "ReadLine" {   System.out.print(yytext());
                return symbol(sym.LEER_LIN, yytext()); }

    "."  {   System.out.print(yytext());
                return symbol(sym.PUNTO, yytext()); }

    "null"  {   System.out.print(yytext());
                return symbol(sym.NULO, yytext()); }

    "New"  {   System.out.print(yytext());
                return symbol(sym.NUEVO, yytext()); }

    "NewArray"  {   System.out.print(yytext());
                return symbol(sym.NUEVO_A, yytext()); }

    "GetByte"  {   System.out.print(yytext());
                return symbol(sym.OBTENER_BYTES, yytext()); }

    "SetByte"  {   System.out.print(yytext());
                return symbol(sym.SET_BYTES, yytext()); }

    "-"  {   System.out.print(yytext());
                return symbol(sym.MENOS, yytext()); }

    "="  {   System.out.print(yytext());
                return symbol(sym.IGUAL, yytext()); }


    {TipoDeDatoL} {return symbol(sym.BOOLCONST, yytext()); }

    {OperadoresA}      {   System.out.print(yytext());
                      return symbol(sym.OPERADORESA, yytext()); }

    /* Si se encuentra un entero, se imprime, se regresa un token numero
        que representa un entero y el valor que se obtuvo de la cadena yytext
        al convertirla a entero. yytext es el token encontrado. */
    {Real}      {   System.out.print(yytext());
                      return symbol(sym.DECIMAL, yytext()); }

    {Entero}      {   System.out.print(yytext());
                      return symbol(sym.ENTERO, yytext()); }

    {Hexadecimal}      {   System.out.print(yytext());
                      return symbol(sym.ENTERO, yytext()); }

    {OperadoresC}     {return symbol(sym.OPERADORESC, yytext());}

    {OperadoresL}     {return symbol(sym.OPERADORESL, yytext());}

    {Identificador}      {   System.out.print(yytext());
                      return symbol(sym.IDENTIFICADOR, yytext()); }
    {Textos}      {   System.out.print(yytext());
                      return symbol(sym.TEXTO, yytext()); }

    /* No hace nada si encuentra el espacio en blanco */
    {WHITE}       { /* ignora el espacio */ }
    {LineTerminator} {}


}


/* Si el token contenido en la entrada no coincide con ninguna regla
    entonces se marca un token ilegal */
.                    { AnalizadorSintacticoInterfaz.getAnalizador().setError("Error Lexico, token:   "+yytext()+"     , linea: "+(1+yyline)+" , columna: "+(yycolumn+1)+". Token no valido!");}
