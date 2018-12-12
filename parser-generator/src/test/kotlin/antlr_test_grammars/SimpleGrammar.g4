grammar SimpleGrammar;

start   :   DEF REGEX;

DEF     :   'def';
REGEX   :   ('a'..'z') ('A'..'Z')*;