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
            | bloque  
            ;

// IF FOR Y WHILE
bloque : LLAVEA  instrucciones  LLAVEC;

iwhile : WHILEF  reglaParentesisA operacionesaritlogicas  PARENTESISC  bloque; //check
iif : IFF reglaParentesisA operacionesaritlogicas PARENTESISC bloque ; //check
ifor : FORR PARENTESISA declaracionIndice variable COMP variable PUNTOCOMA  variable operador PARENTESISC  bloque; 

declaracionIndice: declararIndice;

declararIndice:  variable EQ variable COMA declararIndice
               | variable EQ variable PUNTOCOMA
               | variable COMA declararIndice
               | variable PUNTOCOMA
               ;

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

declarar : declararConDef
         | declararSinDef
         ;

declararConDef : PALABRA EQ variable COMA declarar
               | PALABRA EQ variable PUNTOCOMA
               ;
declararSinDef : PALABRA COMA declarar
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
declaracionfuncion: typeFunctions nombreFuncion reglaParentesisA parametrosSinDef reglaParentesisC PUNTOCOMA
                  ;

reglaParentesisA: PARENTESISA
                | ;

reglaParentesisC: PARENTESISC
                | ;

nombreFuncion : PALABRA;
parametrosSinDef: type COMA parametrosSinDef
                | type
                |
                ;
parametros: type nombreParametro COMA parametros
          | type nombreParametro
          |
          ;
nombreParametro : PALABRA;

llamadoFuncion : PALABRA reglaParentesisA concatenacionPalabras PARENTESISC PUNTOCOMA;
concatenacionPalabras: PALABRA COMA concatenacionPalabras
                     | PALABRA
                     |
                     ;

definicionFunciones: typeFunctions nombreFuncion reglaParentesisA parametros PARENTESISC bloque ;
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



