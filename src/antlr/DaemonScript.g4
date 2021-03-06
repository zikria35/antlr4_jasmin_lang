grammar DaemonScript;

app:
         main functions EOF
    ;

main:
        MAIN BRACKET_START statement* BRACKET_END
    ;

functions:
      statement*
    ;


//statements
statement:
        declaration
    |   assignment
    |   console_print
    |   while_statement
    |   if_statement
    |   function_call
    |   function_declaration
    |   return_statement
    ;


arguments:
        expression ( COMMA expression )*
    ;

array:
        BRACKET_START (expression (COMMA expression)*)? BRACKET_END
    ;

console_print:
        CONSOLE POINT PRINT PARANTHESE_START expression? PARANTHESE_END SEMICOLON
    ;

console_scan_string:
        CONSOLE POINT SCANSTRING PARANTHESE_START PARANTHESE_END SEMICOLON?
    ;

console_scan_int:
        CONSOLE POINT SCANINT PARANTHESE_START PARANTHESE_END SEMICOLON?
    ;

declaration:
        OBJ_TYPE (LT objType=OBJ_TYPE GT)? ID SEMICOLON?
    ;

return_statement:
        RETURN expression SEMICOLON
    ;

function_call:
        (ID POINT)? ID PARANTHESE_START arguments? PARANTHESE_END (SEMICOLON)?
    ;

function_declaration:
        OBJ_TYPE ID PARANTHESE_START ( declaration (COMMA declaration)*)? PARANTHESE_END statement_block
    ;

assignment:
        ID EQUALS (expression | function_call) SEMICOLON
    ;

while_statement:
        WHILE expression statement_block
    ;

statement_block:
        BRACKET_START block BRACKET_END
    ;

if_statement:
    IF PARANTHESE_START expression PARANTHESE_END THEN  trueVal=statement_block  (ELSE  falseVal=statement_block)?
    ;

block:
        statement*
        return_statement?
    ;

//expressions
expression:
        MINUS expression                                    #ExMinus
    |   NOT expression                                      #ExNot
    |   expression op=(MULT | DIV | MOD) expression         #ExMultiply
    |   expression op=(PLUS | MINUS) expression             #ExAdditive
    |   expression op=(LTEQ | GTEQ | LT | GT | EQ | NEQ) expression #ExRelational
    |   expression AND expression                           #ExAnd
    |   expression OR expression                            #ExOr
    |   console_scan_string                                 #ExConsoleScanString
    |   console_scan_int                                    #ExConsoleScanInt
    |   function_call                                       #ExFunction_Call
    |   array                                               #ExArray

        |     '(' expression ')'        #ExPar
        |   (INT | FLOAT)               #AtomNumber
        |   (TRUE | FALSE)              #AtomBoolean
        |   ID                          #AtomId
        |   STRING                      #AtomString
 ;


MAIN: 'Main';

RETURN: 'return';


OBJ_TYPE:(
        NUMBER
    |   TEXT
    |   BOOLEAN
    |   LIST
    |   VOID
    )
    ;

    LIST: 'List';
    BOOLEAN: 'Boolean';
    TEXT: 'Text';
    NUMBER: 'Number';
    VOID: 'Void';
ARGS: 'args';
THEN: 'then';

//Class name start with Capital letter
//Variable name start with Lowercase letter
IF: 'if';
ELSE: 'else';
WHILE: 'while';
TRUE: 'true';
FALSE: 'false';

OR: '||';
AND: '&&';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
NOT: '!';

NULL: 'null';

CONSOLE: 'console';
PRINT: 'print';
SCANINT: 'scanNumber';
SCANSTRING: 'scanText';

POINT: '.';
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
SPECIAL_CHAR: [.+-];
INT: '0' | [1-9][0-9]*;
FLOAT: [0-9]+ '.' [0-9]*  |   '.' [0-9]+;
DIGITS: [0-9]+;
STRING:  BRACE_START ~[}\n]* BRACE_END;
SEMICOLON: ';';
COLON: ':';
PARANTHESE_START: '(';
PARANTHESE_END: ')';
BRACKET_START: '[';
BRACKET_END: ']';
EQUALS: '=';
BRACE_START: '{';
BRACE_END: '}';
COMMA: ',';


WS: [ \r\n\t]+ -> skip;
COMMENT: DIV DIV ~[\n]* -> skip;