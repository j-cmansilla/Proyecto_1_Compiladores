package analizador;
import static analizador.Token.*;
%%
%class Lexer
%line
%type Token

/*Comentarios*/
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
Comment = {TraditionalComment} | {EndOfLineComment} 
TraditionalComment   = "/*" [^*] ~"*/"
ComentarioError   = "/*" [^*] !"*/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?



/* EXPRESIONES REGULARES */

//Palabras reservadas

PalabraReservada = "void"|"int"|"double"|"bool"|"string"|"class"|"interface"|"null"|"this"|"extends"|"if"|"else"|"implements"|"for"|"while"|"return"|"break"|"New"|"NewArray"

//Operadores lógicos y aritméticos
operadoresA = "+"|"-"|"*"|"/"|"%"|"<"|"<="|">"|">="|"="|"=="|"!="|"&&"|"||"|"!"|";"|","|"."|"["|"]"|"[]"|"("|")"|"()"|"{"|"}"|"{}"

//Identificadores
identificador = ({L}|"_") ({L}|{D}|"_"){1,31}

//Numeros reales
real = "-"({D}{D}*"."{D}*|{D}{D}*"."{D}*"E"("+"|"-"){D}*)|({D}{D}*"."{D}*|{D}{D}*"."{D}*"E"("+"|"-"){D}*)
hexadecimal = "0X"({D}|("A"|"B"|"C"|"D"|"E"|"F"))*

//Comillas y textos
texto = "\"" ~"\""

textoError = "\"" ~[\n]

//Tipo de dato lógicos
tipoDeDatoL = "true"|"false"

//Espacios en blanco, tabulaciones y saltos de línea
Espacio = [ ]
WHITE=[ \t\r\n]

//Letras y números
L = [a-zA-Z_]
D = [0-9]

%{
//Variables globales para ser accedidas después
public String lexeme;
public int linea;
%}
%%

/*PALABRAS RESERVADAS, VARIABLES Y CONSTANTES, TIPOS DE DATO Y ACCESO A LA BASE DE DATOS */
{PalabraReservada} {lexeme=yytext(); return PALABRARESERVADA;}
{real} {{lexeme=yytext(); return REAL;}}
/*COMENTARIOS*/

/*COMENTARIOS*/
{ComentarioError} {lexeme=yytext(); return ERROR;}
{Comment} {lexeme=yytext(); return COMMENT;}
{hexadecimal} {{lexeme=yytext(); return HEXA;}}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}


/* TEXTOS, ESPACIOS EN LAS LINEAS */
/*{textoError} {lexeme=yytext(); return ERROR;}*/
{texto} {lexeme=yytext(); return TEXTO;}

{WHITE} {lexeme=yytext(); return ESPACIO;}


/*OPERADORES ARITMETICOS Y LOGICOS*/
{operadoresA} {lexeme=yytext(); return OPERADORARITMETICO;}
/*COMILLAS*/

/*TIPOS DE DATO LOGICOS*/
{tipoDeDatoL} {lexeme=yytext(); return TIPODEDATOL;}

/*IDENTIFICADOR*/
{identificador} {lexeme=yytext(); return ID;}



/*TOKEN NO RECONOCIDO*/
. {lexeme=yytext();linea = yyline; return ERROR;}
