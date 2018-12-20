grammar ThirdHWGrammar;

start returns [String value]
    :   expression[1]                                           {$value = "fun main(args: Array<String>) {\n${$expression.value}}"}
    |                                                           {$value = "fun main(args: Array<String>) {\n}"}
    ;


expression[Int indent] returns [String value]
    :   simple_expression[indent] {$value = $simple_expression.value + "\n"}
        expression[indent]        {$value += $expression.value + "\n"}
    |
    ;


simple_expression[Int indent] returns [String value]
    :   if_expression[indent]                                   {$value = $if_expression.value}
    |   print[indent]                                           {$value = $print.value}
    |   define[indent]                                          {$value = $define.value}
    |   while_expression[indent]                                {$value = $while_expression.value}
    ;

while_expression[Int indent] returns [String value]
    :   WHILE logic_value LPAREN expression[indent+1] RPAREN   {$value = "${"\t".repeat($indent)}while (${$logic_value.value}) {\n${$expression.value}${"\t".repeat($indent)}}"}
    ;


if_expression[Int indent] returns [String value, String valr]
    :   IF logic_value
        LPAREN ex = expression[indent+1] RPAREN
        else_expression[indent]                            {$value = "${"\t".repeat($indent)}if (${$logic_value.value}) {\n${$expression.value}${"\t".repeat($indent)}} ${$else_expression.value}"}
    ;


else_expression[Int indent] returns [String value]
    :   LPAREN expression[indent+1] RPAREN                 {$value = "else {\n${$expression.value}${"\t".repeat($indent)}}"}
    |                                                           {$value = ""}
    ;


print[Int indent] returns [String value]
    :   PRINT variable                                          {$value = "${"\t".repeat($indent)}println(${$variable.value})"}
    ;


define[Int indent] returns [String value]
    :   vars_var VARS variable                                    {$value = "${"\t".repeat($indent)}${$vars_var.value}${$VARS.text} = ${$variable.value}"}
    ;

vars_var returns [String value]
    :   DEFINE {$value = "var "}
    |   REDEF  {$value = ""}
    ;


variable returns [String value]
    :   logic_value                                             {$value = $logic_value.value}
    |   int_value                                               {$value = $int_value.value}
    |   VARS                                                    {$value = $VARS.text!!}
    ;


logic_value returns [String value]
    :   logic_operation logic_value {$value = "(${$logic_value.value} ${$logic_operation.op}"}
        logic_value  {$value += "${$logic_value.value})"}
    |   NOT logic_value                                    {$value = "!(${$logic_value.value})"}
    |   VARS                                                    {$value = $VARS.text!!}
    |   TRUE                                                    {$value = "true"}
    |   FALSE                                                   {$value = "false"}
    |   compare_op int_value int_value            {$value = "(${$int_value.value} ${$compare_op.op} ${int_value.value})"}
    ;


int_value returns [String value]
    :   int_operations int_value int_value                      {$value = "(${$int_value.value} ${$int_operations.op} ${$int_value.value})"}
    |   VARS                                                    {$value = $VARS.text!!}
    |   NUMBER                                                  {$value = $NUMBER.text!!}
    ;


logic_operation returns [String op]
    :   OR                                                      {$op = " || "}
    |   AND                                                     {$op = " && "}
    |   EQUAL                                                   {$op = " == "}
    |   NOT_EQUAL                                               {$op = " != "}
    ;


int_operations returns [String op]
    :   PLUS                                                    {$op = " + "}
    |   MINUS                                                   {$op = " - "}
    |   MULL                                                    {$op = " * "}
    |   DIV                                                     {$op = " / "}
    ;


compare_op returns [String op]
    :   EQUAL                                                   {$op = " == "}
    |   NOT_EQUAL                                               {$op = " != "}
    |   LOWER                                                   {$op = " < "}
    |   LOWER_EQUAL                                             {$op = " <= "}
    |   HIGHER                                                  {$op = " > "}
    |   HIGHER_EQUAL                                            {$op = " >= "}
    ;


IF                              :   'if';
WHILE                           :   'while';

LPAREN                          :   '(';
RPAREN                          :   ')';

PRINT                           :   'print';

DEFINE                          :   'def';
REDEF                           :   '=';

VARS                            :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
NUMBER                          :   ('-'? ('1'..'9') ('0'..'9')*) | '0';

NOT                             :   '!';
OR                              :   '|';
AND                             :   '&';

TRUE                            :   'true';
FALSE                           :   'false';

PLUS                            :   '+';
MINUS                           :   '-';
MULL                            :   '*';
DIV                             :   '/';

EQUAL                           :   '==';
NOT_EQUAL                       :   '!=';
LOWER                           :   '<';
LOWER_EQUAL                     :   '<=';
HIGHER                          :   '>';
HIGHER_EQUAL                    :   '>=';