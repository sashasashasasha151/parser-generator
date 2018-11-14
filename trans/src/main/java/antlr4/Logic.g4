grammar Logic;

expression          :n_expression add_or;

add_or              :OR n_expression add_or
                    |
                    ;

n_expression        :n_n_expression add_xor;

add_xor             :XOR n_n_expression add_xor
                    |
                    ;

n_n_expression      :l_expression add_and;

add_and             :AND l_expression add_and
                    |
                    ;

l_expression        :NOT l_expression
                    | LPAREN expression RPAREN
                    | VAR
                    ;

OR                  :'|' ;

XOR                 :'^' ;

AND                 :'&' ;

NOT                 :'!' ;

LPAREN              :'(';

RPAREN              :')';

VAR                 :[a-z];

WHITESPACE          : ' ' -> skip;