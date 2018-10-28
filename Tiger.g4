grammar Tiger;


options {
    // antlr will generate java lexer and parser
    language = Java;
}
INT: 'float';
FLOAT: 'int';
MAIN: 'main';
COMMA: ',';
COLON: ':';
SEMI: ';';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
PERIOD: '.';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EXP: '**';
EQ: '=';
NEQ: '<>';
LESSER: '<';
GREATER: '>';
LESSEREQ: '<=';
GREATEREQ: '>=';
AND: '&';
OR: '|';
ASSIGN: ':=';
ARRAY: 'array';
RECORD: 'record';
BREAK: 'break';
DO: 'do';
ELSE: 'else';
FOR: 'for';
FUNC: 'function';
IF: 'if';
IN: 'in';
LET: 'let';
OF: 'of';
THEN: 'then';
TO: 'to';
TYPE: 'type';
VAR: 'var';
WHILE: 'while';
ENDIF: 'endif';
BEGIN: 'begin';
ENDDO: 'enddo';
END: 'end';
RETURN: 'return';

INTLIT: ('0'..'9') | (('1'..'9')('0'..'9')+);
FLOATLIT: (('0'..'9') | (('1'..'9')('0'..'9')+)) '.' ('0'..'9')* ;
ID: ('a' .. 'z' | 'A' .. 'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ;
WS : (' ' | '\t' | '\n')+ -> channel(HIDDEN);

tigerprogram 
        : MAIN LET declarationsegment IN BEGIN statseq END ;
declarationsegment 
        : typedeclarationlist vardeclarationlist functdeclarationlist ; 
typedeclarationlist 
        : typedeclaration typedeclarationlist 
        | ;

vardeclarationlist
        : vardeclaration vardeclarationlist 
        | ;

functdeclarationlist
        : functdeclaration functdeclarationlist 
        | ;

typedeclaration 
        : TYPE ID EQ type SEMI ;
        
type 
        : typeid 
        | ARRAY LBRACK INTLIT RBRACK OF typeid 
        | RECORD fieldlist END 
        | ID ;

fieldlist 
        : ID COLON typeid SEMI fieldlist 
	    | ; 
 
typeid
        : INT 
        | FLOAT;

vardeclaration
        : VAR idlist COLON type optionalinit SEMI ; 
        
idlist 
        : ID itail ;

itail
        : COMMA idlist 
        | ;
optionalinit
        : ASSIGN consta 
        | ;

functdeclaration
        : FUNC ID LPAREN paramlist RPAREN rettype BEGIN statseq END SEMI ;  
        
paramlist 
        : param paramlisttail 
        | ;

paramlisttail
 	    : COMMA param paramlisttail
        | ; 

rettype 
        : COLON type
        | ; 

param 
        : ID COLON type ; 

statseq 
        : stat stail ;

stail
        : statseq  
        | ; 
 
ltail 
        : lvalue btail 
        | consta exprtail SEMI 
        | LPAREN expr RPAREN exprtail SEMI ;

btail 
        : ASSIGN ltail 
        | exprtail SEMI ;
        
statail 
        : ENDIF SEMI 
        | ELSE statseq ENDIF SEMI ; 


stat
        : LET declarationsegment IN statseq END
        | BREAK SEMI 
        | RETURN expr SEMI
        | ID statendy
        | IF expr THEN statseq statail
        | WHILE expr DO statseq ENDDO SEMI
        | FOR ID ASSIGN expr TO expr DO statseq ENDDO SEMI ;
statendy
        : LPAREN expr RPAREN
        | lvaluetail ASSIGN tail2 ;
tail2
        : ID tail3
        | consta exprtail SEMI
        | LPAREN expr RPAREN exprtail SEMI ;
tail3 
        : LPAREN exprlist RPAREN SEMI 
        | lvaluetail btail ;

expr 
        : consta exprtail
        | lvalue exprtail 
        | LPAREN expr RPAREN exprtail ;
exprtail
        : binaryoperator expr 
        | ;

consta
        : INTLIT 
        | FLOATLIT ; 
        
binaryoperator
        : EXP
        | PLUS 
        | MINUS 
        | MULT 
        | DIV 
        | EQ 
        | NEQ 
        | LESSER 
        | GREATER 
        | LESSEREQ 
        | GREATEREQ
        | AND 
        | OR ; 
 
exprlist
        : expr exprlisttail
        | ;
exprlisttail
        : COMMA expr exprlisttail 
        | ; 
lvalue
        : ID lvaluetail ; 

lvaluetail
        : LBRACK expr RBRACK 
        | PERIOD ID 
        | ; 
