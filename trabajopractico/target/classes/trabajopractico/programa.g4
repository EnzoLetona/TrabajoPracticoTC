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
VOID: 'void';
CHAR: 'char';
FLOAT: 'float';
COMILLAS: '"';
RETURN: 'return';
PARENTESISA : '(';
PARENTESISC : ')';
LLAVEA: '{';
LLAVEC: '}';
PUNTOCOMA: ';';
MAS : '+';
MENOS: '-';
PRODUCTO:'*';
DIVISION:'/';
COMA: ',';
PALABRA : LETRA2+;
ENTERO : DIGITO+ ;
COMP : ('<'|'<='|'=='|'>'|'>=' |'!=');
WS : [ \t\r\n]+ -> skip;
OTRO : . ->skip;


programa : 
    instrucciones 
    ;
instrucciones: instruccion instrucciones 
             |
             ;

instruccion : declaracion  
            | asignacion 
            | iwhile 
            | iif
            | ifor
            | declaracionfuncion
            | definicionFunciones 
            | operacionesaritlogicas
            | llamadoFuncion
            | returnss 
            ;

// IF FOR Y WHILE

iwhile : WHILEF  PARENTESISA operacionesaritlogicas  PARENTESISC  LLAVEA  instrucciones  LLAVEC; //check
iif : IFF PARENTESISA operacionesaritlogicas PARENTESISC LLAVEA instrucciones LLAVEC ; //check
ifor : FORR PARENTESISA declaracionIndice PALABRA COMP variable PUNTOCOMA  PALABRA operador PARENTESISC  LLAVEA  instrucciones  LLAVEC; 

declaracionIndice: typeFor indice;

indice : PALABRA EQ variable PUNTOCOMA
       | PALABRA EQ variable COMA indice
       ;
typeFor: INT
       | DOUBLE
       | FLOAT
       |
       ;
operador: '++'
        | '--'
        ;
// ------------------------------------------------------------------------------------------------------------------------------------
asignacion : PALABRA  EQ  variable operacion PUNTOCOMA ; // check
operacion: operadores variable operacion
         | operadores variable 
         |
         ;

operadores: MAS
        | MENOS
        | PRODUCTO
        | DIVISION
        ;
// ------------------------------------------------------------------------------------------------------------------------------------
operacionesaritlogicas : variable COMP variable operadorLogico operacionesaritlogicas //check
                       | variable COMP variable 
                       ;


operadorLogico : '&&'
               | '||'
               ;


//declaracion : type  ( (PALABRA  EQ  ENTERO  (','|';') ) | (PALABRA  (','|';' ) ) )+ ;

declaracion: type declarar //check
           ;
declarar : PALABRA EQ variable COMA declarar
         | PALABRA COMA declarar
         | PALABRA EQ variable PUNTOCOMA
         | PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS COMA declarar
         | PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS PUNTOCOMA
         | PALABRA '['numerochar']' COMA declarar
         | PALABRA '['numerochar']' PUNTOCOMA
         | PALABRA PUNTOCOMA
         ;
         //| PALABRA EQ COMILLAS PALABRA COMILLAS PUNTOCOMA
         //| PALABRA EQ COMILLAS PALABRA COMILLAS declarar
numerochar : ENTERO
           | PALABRA
           |
           ;

/* DECLARACION DE FUNCIONES Y LLAMADOS */
declaracionfuncion: typeFunctions PALABRA PARENTESISA parametros PARENTESISC PUNTOCOMA
                  ;

parametros: type PALABRA COMA parametros
          | type PALABRA
          |
          ;

llamadoFuncion : PALABRA PARENTESISA concatenacionPalabras PARENTESISC PUNTOCOMA;
concatenacionPalabras: PALABRA COMA concatenacionPalabras
                     | PALABRA
                     |
                     ;

definicionFunciones: typeFunctions PALABRA PARENTESISA parametros PARENTESISC LLAVEA instrucciones LLAVEC ;
typeFunctions : type
              | VOID
              ;
//----------------------------------------------------------------------------
type: DOUBLE
    | INT  
    | CHAR
    | FLOAT
    ;
//| STRING
returnss: RETURN variable PUNTOCOMA
        | RETURN llamadoFuncion PUNTOCOMA
        ;

variable: PALABRA
        | ENTERO
        ;



//iwhile -> while (x comp y) { instrucciones }
