grammar Dashboard;

lines: line+;
line: city project techLead technology businessDomain END_LINE ;
city: CHEVRON COLON ID;
account: TWO_DASHES ACCOUNT COLON ID;
project: PROJECT COLON ID;
techLead: TECH_LEAD COLON ID;
technology: TECHNOLOGY COLON ID;
businessDomain: BUSINESS_DOMAIN COLON ID;

ID: ('a'..'z' | 'A'..'Z' | '0'..'9' | WS )+;

ACCOUNT: 'Account';
PROJECT: 'Project';
TECH_LEAD: 'TechLead';
TECHNOLOGY: 'Technologies';
BUSINESS_DOMAIN: 'BusinessDomains' ;

TWO_DASHES: DASH DASH;
DASH: '-';
COLON: ':';
CHEVRON: '>';
END_LINE: ('.'? NEW_LINE);
NEW_LINE: ('\r'? '\n');
WS: (' '|'\t')+ -> skip;