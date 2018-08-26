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
ComentarioError   = "/*" 
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?



/* EXPRESIONES REGULARES */

//Palabras reservadas

PalabraReservada = "void"|"int"|"double"|"bool"|"string"|"class"|"interface"|"null"|"this"|"extends"|"if"|"else"|"implements"|"for"|"while"|"return"|"break"|"New"|"NewArray"

//Operadores lógicos y aritméticos
operadoresA = "+"|"-"|"*"|"/"|"%"|"<"|"<="|">"|">="|"="|"=="|"!="|"&&"|"||"|"!"|";"|","|"."|"["|"]"|"[]"|"("|")"|"()"|"{"|"}"|"{}"

//Identificadores
identificador = ({L}|"_") ({L}|{D}|"_")*

//Numeros reales
real = "-"({D}{D}*"."{D}*|{D}{D}*"."{D}*"E"("+"|"-"){D}*)|({D}{D}*"."{D}*|{D}{D}*"."{D}*"E"("+"|"-"){D}*)
hexadecimal = "0X"({D}|("A"|"B"|"C"|"D"|"E"|"F"))*

//Definición de constantes
constante = "define" | "const"

//Control de errores en variables


//Comillas y textos
comillas = [\"]
especialChars = "*"|"-" | "/" | "_" | "." | "," | "~" | "!" | "@" | "#" | "$" | "%" | "'" | "^" | "&" | "|" | "(" | ")" |" {" | "}" | "\\" |"["|"]"|"<"|">"|"?"|"="|"+"|":"|";"|"'"
texto = "'" ({Espacio}* {L}* {especialChars}* {D}*)* {Espacio}* "'" | {comillas} ({Espacio}* {L}* {especialChars}* {D}*)* {Espacio}* {comillas}
comilla = '|`

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
{Comment} {lexeme=yytext(); return COMMENT;}
/*COMENTARIOS*/
{ComentarioError} {lexeme=yytext(); return ERROR;}
{hexadecimal} {{lexeme=yytext(); return HEXA;}}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}


/* TEXTOS, ESPACIOS EN LAS LINEAS */
{texto} {lexeme=yytext(); return TEXTO;}
{WHITE} {lexeme=yytext(); return ESPACIO;}


/*SIMBOLOS*/
"\\" {lexeme=yytext(); return SLASH;}
"$" {lexeme=yytext(); return VARIABLE;}
"if" {lexeme=yytext(); return SI;}
"(" {lexeme=yytext(); return PAA;}
"@" {lexeme=yytext(); return ARR;}
"?" {lexeme=yytext(); return SIGNIN;}
"return" {{lexeme=yytext(); return RET;}}
")" {lexeme=yytext(); return PAC;}
"else" {{lexeme=yytext(); return ELS;}}
"break" {{lexeme=yytext(); return BREA;}}
"while" {{lexeme=yytext(); return MIENTR;}}
"do" {{lexeme=yytext(); return HMIENTR;}}
"for" {{lexeme=yytext(); return PARA;}}
"bool"|"boolean" {{lexeme=yytext(); return BOOL;}}
"foreach" {{lexeme=yytext(); return PARAC;}}
"switch" {{lexeme=yytext(); return SELEC;}}
"include" {{lexeme=yytext(); return INCLUI;}}
"continue" {{lexeme=yytext(); return CONTIN;}}
"function" {{lexeme=yytext(); return FUN;}}
"<?php" {lexeme=yytext(); return INICIOPHP;}
"?>" {lexeme=yytext(); return FINPHP;}
"{" {lexeme=yytext(); return LLAVEA;}
"}" {lexeme=yytext(); return LLAVEC;}
"="|"=>"|"&="|".="|"/=" {lexeme=yytext(); return ASIGNACION;}
"==" {lexeme=yytext(); return COMPARACION;}
"!=" {lexeme=yytext(); return DIFERENTE;}
";" {lexeme=yytext(); return PUNTOYCOMA;}
"," {lexeme=yytext(); return COMA;}
"." {lexeme=yytext(); return PUNTO;}
"<" {lexeme=yytext(); return ETI;}
">" {lexeme=yytext(); return ETF;}
"[" {lexeme=yytext(); return PAI;}
"]" {lexeme=yytext(); return PAF;}
":" {lexeme=yytext(); return DOSPUNTOS;}
"string" {lexeme=yytext(); return CADENA;}
"int" {lexeme=yytext(); return ENT;}
"float"|"double" {lexeme=yytext(); return REA;}

/*OPERADORES ARITMETICOS Y LOGICOS*/
{operadoresA} {lexeme=yytext(); return OPERADORARITMETICO;}
/*COMILLAS*/
{comilla} {lexeme=yytext(); return COMILLA;}
{comillas} {lexeme=yytext(); return COMILLA;}

/*TIPOS DE DATO LOGICOS*/
{tipoDeDatoL} {lexeme=yytext(); return TIPODEDATOL;}

/*IDENTIFICADOR*/
{identificador} {lexeme=yytext(); return ID;}



/*TOKEN NO RECONOCIDO*/
. {lexeme=yytext();linea = yyline; return ERROR;}
