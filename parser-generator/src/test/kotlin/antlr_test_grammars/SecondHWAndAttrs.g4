grammar SecondHWAndAttrs;

start returns [int vall]               :   b u[$b.vall] {$vall = $u.vallue;}
                                      ;

u[int vall] returns [int vallue]        :   ADD b {$vallue = $vall + $b.vall;}
                                          u[$b.vall]
                                      |   {$vallue = $vall;}
                                      ;

b returns [int vall]                   :   c v[$c.vall] {$vall = $v.vallue;}
                                      ;

v[int vall] returns [int vallue]        :   MUL c {$vallue = $vall * $c.vall;}
                                          v[$vallue]
                                      |   {$vallue = $vall;}
                                      ;

c returns [int vall]                   : UN d {$vall = $d.vall*-1;}
                                      | d {$vall = $d.vall;}
                                      ;

d returns [int vall]                   : LP start RP {$vall = $start.vall;}
                                      | VAR         {$vall = Integer.parseInt($VAR.text);}
                                      ;

ADD                 : '+';
MUL                 : '*';
UN                  : '-';
LP                  : '(';
RP                  : ')';
VAR                 : ('1'..'9') ('0'..'9')*;

WS                  : [\t ]+ -> skip ;