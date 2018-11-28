grammar PrefixGrammar;

start returns [StringBuilder sb]
    :   {$sb = new StringBuilder();}
        expression[$sb]
    ;

expression[StringBuilder sb]
    :   simple_expression[sb]
        {sb.append(System.lineSeparator());}
        (
            simple_expression[sb]
            {sb.append(System.lineSeparator());}
        )*
    ;

simple_expression[StringBuilder sb]
    :   if_expression[sb]
    |   print[sb]
    |   define[sb]
    ;

if_expression[StringBuilder sb]
    :   IF
            {sb.append("if (");}
        logic_value[sb]
            {sb.append(")");}
        LPAREN
            {sb.append(" {").append(System.lineSeparator());}
        expression[sb]
        RPAREN
            {sb.append("}");}
        else_expression[sb]
    ;

else_expression[StringBuilder sb]
    :   {sb.append(" else");}
        LPAREN
            {sb.append(" {").append(System.lineSeparator());}
        expression[sb]
        RPAREN
            {sb.append("}");}
    |
    ;

print[StringBuilder sb]
    :   PRINT
            {sb.append("print(");}
        var[sb]
            {sb.append(");");}
    ;

define[StringBuilder sb]
    :   DEFINE
        VAR
            {sb.append($VAR.text).append(" = ");}
        var[sb]
            {sb.append(";");}
    ;

var[StringBuilder sb]
    :   logic_value[sb]
    |   int_value[sb]
    |   VAR {sb.append("VAR");}
    ;

logic_value[StringBuilder sb]
    :   logic_operation[sb] logic_value[sb] logic_value[sb]
    |   NOT {sb.append("!");} logic_value[sb]
    |   VAR {sb.append("VAR");}
    |   TRUE {sb.append("true");}
    |   FALSE {sb.append("false");}
    |   compare[sb] int_value[sb] int_value[sb]
    ;

int_value[StringBuilder sb]
    :   {sb.append(" ");} int_operations int_value[sb] {sb.append($int_operations.op);} int_value[sb] {sb.append(" ");}
    |   VAR {sb.append($VAR.text);}
    |   NUMBER {sb.append($NUMBER.text);}
    ;

logic_operation returns [String op]
    :   OR          {$op = " || ";}
    |   AND         {$op = " && ";}
    |   XOR         {$op = " ^ ";}
    |   EQUAL       {$op = " == ";}
    |   NOT_EQUAL   {$op = " != ";}
    ;

int_operations returns [String op]
    :   PLUS   {$op = " + ";}
    |   MINUS  {$op = " - ";}
    |   MULL   {$op = " * ";}
    |   DIV    {$op = " / ";}
    ;

compare returns [String op]
    :   EQUAL           {$op = " == ";}
    |   NOT_EQUAL       {$op = " != ";}
    |   LOWER           {$op = " < ";}
    |   LOWER_EQUAL     {$op = " <= ";}
    |   HIGHER          {$op = " > ";}
    |   HIGHER_EQUAL    {$op = " >= ";}
    ;

IF                              :   'if';

LPAREN                          :   '(';
RPAREN                          :   ')';

PRINT                           :   'print';

DEFINE                          :   'def';

VAR                             :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
NUMBER                          :   ('-'? ('1'..'9') ('0'..'9')*) | '0';

NOT                             :   'not';
OR                              :   'or';
AND                             :   'and';
XOR                             :   'xor';

TRUE                            :   'true';
FALSE                           :   'false';

PLUS                            :   '+';
MINUS                           :   '-';
MULL                            :   '*';
DIV                             :   '/';

EQUAL                           :   '==';
NOT_EQUAL                       :   '!=';
LOWER                           :   '<';
LOWER_EQUAL                     :   '>=';
HIGHER                          :   '>';
HIGHER_EQUAL                    :   '>=';

WS                              :   [ \t\r\n] -> skip;