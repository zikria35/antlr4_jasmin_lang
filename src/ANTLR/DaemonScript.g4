grammar DaemonScript;

app: program;

program:
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
        expression
    |   declaration
    |   declaration_array
    |   assignment
    |   console_print
    |   while_statement
    |   if_statement
    |   function_call
    |   function_declaration
    ;

function_call:
        (ID POINT)? ID PARANTHESE_START arguments? PARANTHESE_END (SEMICOLON)?
    ;

function_declaration:
        ID PARANTHESE_START ((       NUMBER
                                 |   TEXT
                                 |   BOOLEAN
                                 |   LIST
                                 ) ID (COMMA (       NUMBER
                                                 |   TEXT
                                                 |   BOOLEAN
                                                 |   LIST
                                                 ) ID)*)? PARANTHESE_END statement_block
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

declaration_array:
        LIST LT ((       NUMBER
                     |   TEXT
                     |   BOOLEAN
                     |   LIST
                     ))? GT ID (EQUALS expression)? SEMICOLON
    ;

declaration:
        (       NUMBER
            |   TEXT
            |   BOOLEAN
            |   LIST
            ) ID SEMICOLON
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
        ('return' ID SEMICOLON)?
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

        //TODO add Visitors CodeGenerator
    |   array                                               #ExArray

        |     '(' expression ')'        #ExPar
        |   (INT | FLOAT)               #AtomNumber
        |   (TRUE | FALSE)              #AtomBoolean
        |   ID                          #AtomId
        |   STRING                      #AtomString
 ;

LIST: 'List';
BOOLEAN: 'Boolean';
TEXT: 'Text';
NUMBER: 'Number';

MAIN: 'Main';

OBJ_TYPE:(
        NUMBER
    |   TEXT
    |   BOOLEAN
    |   LIST
    )
    ;
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