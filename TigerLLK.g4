grammar TigerLLK;


options {
    // antlr will generate java lexer and parser
    language = Java;
}
INT: 'int';
FLOAT: 'float';
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

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;

INTLIT: ('0'..'9') | (('1'..'9')('0'..'9')+);
FLOATLIT: (('0'..'9') | (('1'..'9')('0'..'9')+)) '.' ('0'..'9')* ;
ID: ('a' .. 'z' | 'A' .. 'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ;
WS : (' ' | '\t' | '\n')+ -> channel(HIDDEN);

hello :
        PLUS TYPE
        | PLUS VAR
        | PLUS WHILE
        | PLUS END;

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
        : typeid  # IDtype
        | ARRAY LBRACK INTLIT RBRACK OF typeid # arrayType
        | RECORD fieldlist END # recordType
        | ID  # pointerType
	;

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


stat
        : LET declarationsegment IN statseq END # letBlock
        | BREAK SEMI # breakCommand
        | RETURN expr SEMI # returnStatement
        | ID LPAREN exprlist RPAREN # callFunction
        | lvalue ASSIGN more # assignElement
        | IF expr THEN statseq statail # ifBlock
        | WHILE expr DO statseq ENDDO SEMI # whileBlock
        | FOR ID ASSIGN expr TO expr DO statseq ENDDO SEMI  #forBlock
	;

statail
        : ENDIF SEMI # ifExitBlock
        | ELSE statseq ENDIF SEMI # endBlock
	;

more
        : ID LPAREN exprlist RPAREN SEMI # function
        | ltail expr SEMI # multipleAssigment
	;

ltail
        : lvalue ASSIGN ltail
        | ;

expr
        : and (OR and)* ; 

and
        : le (AND le)*; 

le
        : me (LESSEREQ me)*; 
me
        : lesser (GREATEREQ lesser)*; 

lesser
        : greater (LESSER greater)*; 

greater
        : noteq   (GREATER noteq)*; 

noteq
        : equal (NEQ equal)*; 

equal
        : minus (EQ minus)*; 
minus
        :plus (MINUS plus)*; 
plus
        :div(PLUS div)*; 
div
        :mult (DIV mult)*; 
mult
        : exp (MULT exp)*; 
exp
        : yeet (EXP yeet)*; 

yeet
        : consta # constant
		| lvalue # varValue
		| LPAREN expr RPAREN  # expression
	;

consta
        : INTLIT # intLiteral
        | FLOATLIT  # floatLiteral
	;
         
exprlist
        : expr exprlisttail
        | ;
exprlisttail
        : COMMA expr exprlisttail
        | ;
lvalue
        : ID lvaluetail ; 

lvaluetail
        : LBRACK expr RBRACK # arrayAccess
        | PERIOD ID # idAttribute
        |  # nullTail
	;
