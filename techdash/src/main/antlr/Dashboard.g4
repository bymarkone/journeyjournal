grammar Dashboard;

lines: line+;
line: (city | account | project | techLead | technology | businessDomain | type | market)? END_LINE ;
city: CHEVRON ID;
account: TWO_DASHES ACCOUNT COLON ID;
project: PROJECT COLON ID;
techLead: PIPE_DASH TECH_LEAD COLON ID (COMMA ID)*;
technology: PIPE_DASH TECHNOLOGY COLON ID (COMMA ID)*;
businessDomain: PIPE_DASH BUSINESS_DOMAIN COLON ID (COMMA ID)*;
type: PIPE_DASH TYPE COLON ID (COMMA ID)*;
market: PIPE_DASH MARKET COLON ID (COMMA ID)*;

ACCOUNT: 'Account';
PROJECT: 'Project';
TECH_LEAD: 'TechLeads';
TECHNOLOGY: 'Technologies';
BUSINESS_DOMAIN: 'BusinessDomains' ;
TYPE: 'Type';
MARKET: 'Market';

ID: ALPHANUMERIC (' '|ALPHANUMERIC)+;
ALPHANUMERIC: ('A'..'Z' | 'a'..'z' | '0'..'9'
                  | '\u00C0'..'\u00D6'
                  | '\u00D8'..'\u00F6'
                  | '\u00F8'..'\u02FF'
                  | '\u0370'..'\u037D'
                  | '\u037F'..'\u1FFF'
                  | '\u200C'..'\u200D'
                  | '\u2070'..'\u218F'
                  | '\u2C00'..'\u2FEF'
                  | '\u3001'..'\uD7FF'
                  | '\uF900'..'\uFDCF'
                  | '\uFDF0'..'\uFFFD'
            );

PIPE_DASH: '|-' ;
TWO_DASHES: DASH DASH;
DASH: '-';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
CHEVRON: '>';
END_LINE: ('.'? NEW_LINE);
NEW_LINE: ('\r'? '\n');
WS: (' '|'\t')+ -> skip;