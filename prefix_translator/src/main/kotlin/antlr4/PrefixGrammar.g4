grammar PrefixGrammar;

start returns [String value]
    :   expression[1]                                           {$value = "fun main(args: Array<String>) {\n${$expression.value}}"}
    |                                                           {$value = "fun main(args: Array<String>) {\n}"}
    ;


expression[Int indent] returns [String value]
    :   simple_expression[indent]                               {$value = $simple_expression.value + "\n"}
        (simple_expression[indent]                              {$value += $simple_expression.value + "\n"}
        )*
    ;


simple_expression[Int indent] returns [String value]
    :   if_expression[indent]                                   {$value = $if_expression.value}
    |   print[indent]                                           {$value = $print.value}
    |   define[indent]                                          {$value = $define.value}
    ;


if_expression[Int indent] returns [String value]
    :   IF l = logic_value
        LPAREN ex = expression[indent+1] RPAREN
        el = else_expression[indent]                            {$value = "${"\t".repeat($indent)}if (${$l.value}) {\n${$ex.value}${"\t".repeat($indent)}} ${$el.value}"}
    ;


else_expression[Int indent] returns [String value]
    :   LPAREN ex = expression[indent+1] RPAREN                 {$value = "else {\n${$ex.value}${"\t".repeat($indent)}}"}
    |                                                           {$value = ""}
    ;


print[Int indent] returns [String value]
    :   PRINT variable                                          {$value = "${"\t".repeat($indent)}println(${$variable.value})"}
    ;


define[Int indent] returns [String value]
    :   DEFINE VARS variable                                    {$value = "${"\t".repeat($indent)}var ${$VARS.text} = ${$variable.value}"}
    |   REDEF VARS variable                                     {$value = "${"\t".repeat($indent)}${$VARS.text} = ${$variable.value}"}
    ;


variable returns [String value]
    :   logic_value                                             {$value = $logic_value.value}
    |   int_value                                               {$value = $int_value.value}
    |   VARS                                                    {$value = $VARS.text!!}
    ;


logic_value returns [String value]
    :   op = logic_operation lv = logic_value rv = logic_value  {$value = "(${$lv.value} ${$op.op} ${$rv.value})"}
    |   NOT lv = logic_value                                    {$value = "!(${$lv.value})"}
    |   VARS                                                    {$value = $VARS.text!!}
    |   TRUE                                                    {$value = "true"}
    |   FALSE                                                   {$value = "false"}
    |   c_op = compare_op c_lv = int_value c_rv = int_value     {$value = "(${$c_lv.value} ${$c_op.op} ${$c_rv.value})"}
    ;


int_value returns [String value]
    :   op = int_operations lv = int_value rv = int_value       {$value = "(${$lv.value} ${$op.op} ${$rv.value})"}
    |   VARS                                                    {$value = $VARS.text!!}
    |   NUMBER                                                  {$value = $NUMBER.text!!}
    ;


logic_operation returns [String op]
    :   OR                                                      {$op = " || "}
    |   AND                                                     {$op = " && "}
    |   XOR                                                     {$op = " ^ "}
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

LPAREN                          :   '(';
RPAREN                          :   ')';

PRINT                           :   'print';

DEFINE                          :   'def';
REDEF                           :   '=';

VARS                            :   ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
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
LOWER_EQUAL                     :   '<=';
HIGHER                          :   '>';
HIGHER_EQUAL                    :   '>=';

WS                              :   [\t ]+ -> skip ;