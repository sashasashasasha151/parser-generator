grammar Grammar;

start                                       :   GRAMMAR words SEMICOLON rruless ttokenss
                                            ;

    words                                   :   (TYPE_OR_NAME | RULE_NAME | TOKEN_NAME)
                                            ;

    rruless                                 :   one_rule (one_rule)*
                                            ;

        one_rule                            :   rule_definition COLON rule_body SEMICOLON
                                            ;

            rule_definition                 :   RULE_NAME definition
                                            ;

                definition                  :   input_attrs return_expression
                                            |   return_expression
                                            ;

                    input_attrs             :   SQUARE_P_L attr (COMMA attr)* SQUARE_P_R
                                            ;

                    return_expression       :   RETURNS SQUARE_P_L attr SQUARE_P_R
                                            |
                                            ;

                        attr                :   words words
                                            ;

            rule_body                       :   rule_expression (DELIM rule_expression)*
                                            ;

                rule_expression             :   expression_name (expression_name)*
                                            ;

                    expression_name         :   RULE_NAME expression_attrs expression_code
                                            |   TOKEN_NAME expression_code
                                            |   NO_RULE expression_code
                                            ;

                    expression_attrs        :   EX_ATTR
                                            |
                                            ;

                    expression_code         :   CODE
                                            |
                                            ;

    ttokenss                                :   token (token)*
                                            ;

        token                               :   TOKEN_NAME COLON token_expression SEMICOLON
                                            ;

        token_expression                    :   TOKEN_DEF
                                            |   REGEX
                                            ;


COLON                                       :   ':';
SEMICOLON                                   :   ';';
SQUARE_P_L                                  :   '[';
SQUARE_P_R                                  :   ']';
COMMA                                       :   ',';
DELIM                                       :   '|';
NO_RULE                                     :   '~';

RETURNS                                     :   'returns';
GRAMMAR                                     :   'grammar';

RULE_NAME                                   :   ('a'..'z') ('a'..'z' | '0'..'9' | '_')*;
TOKEN_NAME                                  :   ('A'..'Z') ('A'..'Z' | '0'..'9' | '_')*;
TYPE_OR_NAME                                :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

CODE                                        :   '{' ~('\r' | '\n')* '}';
TOKEN_DEF                                   :   '\'' ~('\r' | '\n')* '\'';
REGEX                                       :   '`' ~('\r' | '\n')* '`';
EX_ATTR                                     :   '(' ~('\r' | '\n')* ')';

WS                                          :   [ \n\t\r]+ -> skip;