grammar programa;

@header {
    package trabajopractico;
}



//fragment LETRA : [A-Za-z] ;

fragment DIGITO: [0-9];
LETRA2: [A-Za-z];
EQ : '=';
DOUBLE: 'double' ;
WHILEF: 'while';
IFF : 'if';
INT: 'int' ;
PARENTESISA : '(';
PARENTESISC : ')';
LLAVEA: '{';
LLAVEC: '}';
PUNTOCOMA: ';';
COMA: ',';

ENTERO : DIGITO+ ;
COMP : ('<'|'<=' |'==' |'>'|'>=' |'!=');
WS : [ \t\r\n]+ -> skip;
OTRO : . ->skip;


programa : 
    instruccion programa
    |
    ;

instruccion : declaracion  
            | asignacion 
            | iwhile 
            | iif
            ;


iwhile : WHILEF  PARENTESISA variable  COMP  variable  PARENTESISC  LLAVEA  instruccion  LLAVEC;
iif : IFF PARENTESISA variable COMP variable PARENTESISC LLAVEA instruccion LLAVEC ;
asignacion : LETRA2  EQ  variable  PUNTOCOMA ;
//declaracion : type  ( (LETRA2  EQ  ENTERO  (','|';') ) | (LETRA2  (','|';' ) ) )+ ;

declaracion: type declarar
           ;
declarar : LETRA2 EQ ENTERO COMA declarar
         | LETRA2 COMA declarar
         | LETRA2 EQ ENTERO PUNTOCOMA
         | LETRA2 PUNTOCOMA
         ;
type:DOUBLE
    | INT
    ;

variable: LETRA2
        | ENTERO
        ;



//iwhile -> while (x comp y) { instrucciones }
