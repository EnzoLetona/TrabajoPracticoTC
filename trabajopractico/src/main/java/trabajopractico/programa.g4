grammar programa;

@header {
    package trabajopractico;
}



fragment DIGITO : [0-9];
fragment PARES: ('0' | '2' | '4' | '6' | '8' );
FECHA : DIGITO DIGITO'/'(('0' PARES)|('1'('0' | '2' )))'/'DIGITO DIGITO DIGITO DIGITO;
HORAM : ('0'[8-9]|'1'[0-2])':'[0-5]DIGITO;
HORAT : ('18:'[3-5]DIGITO|'19:'[0-5]DIGITO|'21:30'|'21:'[0-2]DIGITO|'20:'[0-5]DIGITO);



WS : [ \n\t\r] -> skip ;
OTRO : . ->skip;

    s : 
      FECHA {System.out.println("Linea " + $FECHA.getLine() + " /TIPO DE TOKEN:" + $FECHA.getType() + "  FECHA-> "+ $FECHA.getText()); } s
    | HORAM {System.out.println("Linea " + $HORAM.getLine() + " /TIPO DE TOKEN:" + $HORAM.getType() + "  HORAM-> "+ $HORAM.getText()); } s
    | HORAT {System.out.println("Linea " + $HORAT.getLine() + " /TIPO DE TOKEN:" + $HORAT.getType() + "  HORAT-> "+ $HORAT.getText()); } s
    |
    ;

   
