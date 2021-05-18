grammar programa;

@header {
    package trabajopractico;
}

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
            | declaracionChar 
            ;

// IF FOR Y WHILE

iwhile : WHILEF  PARENTESISA operacionesaritlogicas  PARENTESISC  LLAVEA  instrucciones  LLAVEC; //check
iif : IFF PARENTESISA operacionesaritlogicas PARENTESISC LLAVEA instrucciones LLAVEC ; //check
ifor : FORR PARENTESISA declaracionIndice PALABRA COMP variable PUNTOCOMA  PALABRA operador PARENTESISC  LLAVEA  instrucciones  LLAVEC; 

declaracionIndice: declaracion
                 | declarar;

operador: '++'
        | '--'
        ;
// -----------------------------ASIGNACION-------------------------------------------------------------------------------------------------------
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
// ------------------------------------OPERACIONARITMETICALOGICA------------------------------------------------------------------------------------------------
operacionesaritlogicas : variable COMP variable operadorLogico operacionesaritlogicas //check
                       | variable COMP variable 
                       ;


operadorLogico : '&&'
               | '||'
               ;

// ------------------------------------DECLARACION------------------------------------------------------------------------------------------------
declaracion: type declarar //check
           ;

declarar : PALABRA EQ variable COMA declarar
         | PALABRA COMA declarar
         | PALABRA EQ variable PUNTOCOMA
         | PALABRA PUNTOCOMA
         ;

declaracionChar: CHAR declararChar
                ;
declararChar: PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS COMA declararChar
            | PALABRA '['numerochar']' EQ COMILLAS PALABRA COMILLAS PUNTOCOMA
            | PALABRA '['numerochar']' COMA declararChar
            | PALABRA '['numerochar']' PUNTOCOMA
            ;

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
//--------------------------------AUXILIARES--------------------------------------------
type: DOUBLE
    | INT  
    | FLOAT
    ;

returnss: RETURN variable PUNTOCOMA
        | RETURN llamadoFuncion 
        ;

variable: PALABRA
        | ENTERO
        ;



