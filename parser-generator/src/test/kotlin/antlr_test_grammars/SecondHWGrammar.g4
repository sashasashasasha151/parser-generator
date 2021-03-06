grammar SecondHWGrammar;

start   :   a t;

t       :   OR a t | ;

a       :   b u;

u       :   XOR b u | ;

b       :   c v;

v       :   AND c v | ;

c       :   NOT d | d;

d       :   LP start RP | VAR;

OR      : '|';
XOR     : '^';
AND     : '&';
NOT     : '!';
LP      : '(';
RP      : ')';
VAR     : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

WS      : [\t ]+ -> skip ;