grammar programa;

@header {
    package trabajopractico;
}



//fragment LETRA : [A-Za-z] ;

fragment DIGITO: [0-9];
fragment LETRA2: [A-Za-z];
EQ : '=';
DOUBLE: 'double' ;
WHILEF: 'while';
IFF : 'if';
FORR: 'for';
INT: 'int' ;
STRING: 'string';
CHAR: 'char';
FLOAT: 'float';
COMILLAS: '"';
PARENTESISA : '(';
PARENTESISC : ')';
LLAVEA: '{';
LLAVEC: '}';
PUNTOCOMA: ';';
COMA: ',';
PALABRA : LETRA2+;
ENTERO : DIGITO+ ;
COMP : ('<'|'<=' |'==' |'>'|'>=' |'!=');
WS : [ \t\r\n]+ -> skip;
OTRO : . ->skip;


programa : 
    instrucciones 
    ;
instrucciones: instruccion instrucciones |;

instruccion : declaracion  
            | asignacion 
            | iwhile 
            | iif
            | ifor
            | declaracionfuncion
            | definicionFunciones 
            ;

// IF FOR Y WHILE

iwhile : WHILEF  PARENTESISA variable  COMP  variable  PARENTESISC  LLAVEA  instrucciones  LLAVEC;
iif : IFF PARENTESISA variable COMP variable PARENTESISC LLAVEA instrucciones LLAVEC ;
ifor : FORR PARENTESISA declaracion PALABRA COMP variable PUNTOCOMA PALABRA '++' PARENTESISC  LLAVEA  instrucciones  LLAVEC;

// ------------------------------------------------------------------------------------------------------------------------------------
asignacion : PALABRA  EQ  variable  PUNTOCOMA ;

//declaracion : type  ( (PALABRA  EQ  ENTERO  (','|';') ) | (PALABRA  (','|';' ) ) )+ ;

declaracion: type declarar
           ;
declarar : PALABRA EQ ENTERO COMA declarar
         | PALABRA COMA declarar
         | PALABRA EQ ENTERO PUNTOCOMA
         | PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS COMA declarar
         | PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS PUNTOCOMA
         | PALABRA '['numerochar']' COMA declarar
         | PALABRA '['numerochar']' PUNTOCOMA
         | PALABRA PUNTOCOMA
         ;
         //| PALABRA EQ COMILLAS PALABRA COMILLAS PUNTOCOMA
         //| PALABRA EQ COMILLAS PALABRA COMILLAS declarar
numerochar : ENTERO
           |
           ;

/* DECLARACION DE FUNCIONES Y LLAMADOS */
declaracionfuncion: type PALABRA PARENTESISA parametros PARENTESISC PUNTOCOMA
                  ;

parametros: type PALABRA COMA parametros
          | type PALABRA
          ;

llamadoFuncion : PALABRA PARENTESISA concatenacionPalabras PARENTESISC PUNTOCOMA;
concatenacionPalabras: PALABRA COMA concatenacionPalabras
                     | PALABRA
                     |
                     ;

definicionFunciones: type PALABRA PARENTESISA parametros PARENTESISC LLAVEA instrucciones LLAVEC ;
//----------------------------------------------------------------------------
type: DOUBLE
    | INT  
    | CHAR
    | FLOAT
    |
    ;
//| STRING
variable: PALABRA
        | ENTERO
        ;



//iwhile -> while (x comp y) { instrucciones }
