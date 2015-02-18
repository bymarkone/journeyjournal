grammar TwDsl;

phrases: ( phrase | NEW_LINE )+;
phrase: ( genericPhrase | feedbackPhrase | factPhrase ) end_line;

genericPhrase: verb object names? properties?;
feedbackPhrase: verb object property DESCRIPTION;
factPhrase: verb FACT names? (factTopic|factTime)+;

factTopic: 'for topic' QUOTED;
factTime: 'on time' QUOTED;

verb: VERBS;
object: OBJECTS;
names: name+|QUOTED;
name: IDENTIFIERS;

properties: (conjunction property)+;
property: property_name property_value;
property_name: IDENTIFIERS;
property_value: IDENTIFIERS|QUOTED;

conjunction: CONJUNCTIONS;
end_line: END_LINE;

DESCRIPTION: ':' (.)+? NEW_LINE;
VERBS: ('create' | 'set' | 'receive' | 'add' | 'register');
OBJECTS: ('Capability' | 'Area' | 'Goal' | 'Action Item' | 'Great Feedback' | 'Constructive Feedback');
CONJUNCTIONS: ('with' | 'and' | 'to be');
FACT: 'Fact';

ABOUT: 'about';
IDENTIFIERS: ('a'..'z' | 'A'..'Z' | '0'..'9')+;
QUOTED: QUOTE .*? QUOTE;

QUOTE: '"'|'\'';

END_LINE: ('.'? NEW_LINE?);
NEW_LINE: ('\r'? '\n');
WS: (' '|'\t')+ -> skip;