grammar SimpleGrammar;

start   :   DEF next | prev REG ;
next    :   NEW OLD;
prev    :   OLD NEW;

DEF     :   'def';
REGEX   :   ('a'..'z') ('A'..'Z')*;