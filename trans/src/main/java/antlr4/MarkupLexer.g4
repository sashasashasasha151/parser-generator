lexer grammar MarkupLexer;

OPEN                : '[' -> pushMode(BBCODE) ;
TEXT                : ~('[')+ ;

// Parsing content inside tags
mode BBCODE;

CLOSE               : ']' -> popMode ;
SLASH               : '/' ;
EQUALS              : '=' ;
STRING              : '"' .*? '"' ;
ID                  : LETTERS+ ;
WS                  : [ \t\r\n] -> skip ;

fragment LETTERS    : [a-zA-Z] ;

S -> AT
T -> |AT
T -> eps
A -> BU
U -> ^BU
U -> eps
B ->  CV
V -> &CV
V -> eps
C -> !S
C -> (S)
C -> var