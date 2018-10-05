# Primer Proyecto - MINI C#, Analizador Sintáctico

Este proyecto fue diseñado con la finalidad de aceptar un archivo y por medio de un robusto algoritmo se analiza sintácticamente para determinar
si pertenece o no al lenguaje MINI C#. Todo esto fue posible con la ayuda de JFlex y Cup fue posible analizar token por token para determinar 
si estaba o no definido de forma correcta en dicho lenguaje. En el proyecto se utilizaron expresiones regulares bastante robustas para el manejo 
de los posibles errores que se pudieran ir obteniendo mediante la lectura del archivo de entrada, además en CUP fue posible crear la gramática 
que fue proporcinada por la ingeniera. Además fui muy cuidadoso de dejar las expresiones regulares en el orden correcto para evitar que algunos 
tokens que fueran reconocidos y por no dejarlo de la forma correcta esto pudiera alterar el resultado final. En JFlex están definidos ya los atributos
para esta tarea, los cuales son yyline y yytext, con la ayuda de estos dos parámetros fue posible obtener el token y la línea con error para 
posteriormente ser presentada en pantalla el resultado final. El principal 
funcionamiento se basa en un algoritmo escrito en Java, en el cual se crea una clase llamada sym.java (en mi caso, no tiene que llamarse así)
en esta clase se lleva un control de que tokens si están definidos por medio de mis expresiones regulares y mis reglas gramaticales, estos tokens son evaluados en una 
clase donde se define una interfaz donde se lee el archivo de entrada línea por línea y se va evaluando y determinando si vienen en el orden correcto o no.

## Cómo iniciar el programa?

1. Descargar el proyecto de github
2. Descomprimir el archivo 
3. Ir a la ruta \Proyecto_1_AnalizadorLexico\analizadorLexico-Java\dist
4. Correr el archivo minic.jar
5. En la pestaña de Subir Archivo, seleccionar un arhivo de entrada. 
6. Click en el botón de analizar. 
7. Al finalizar ir a la ruta: C:\MINICSHARP en donde encontrara el archivo de salida. 

## Prerequisitos

Tener instalado Java SE 8 (preferiblemente) y JDK 8(preferiblemente) en caso de que no se tenga la librería de JFlex, solo 
descargarla de la página oficial y agregarla al proyecto. 

## Correr las pruebas

1. En la pestaña de Subir Archivo, seleccionar un arhivo de entrada
2. Click en el botón de analizar  
