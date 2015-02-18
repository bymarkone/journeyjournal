grammar Jarvis;

phrases: ( phrase | NEW_LINE )+;

phrase: ( capabilityPhrase
        | goalsStartPhrase
        | goalPhrase
        | highlightPhrase
        | topicPhrase
        | feedbackPhrase
        | fromPhrase
        | howToPhrase
        | itemPhrase)
        '.'? NEW_LINE;

capabilityPhrase: CAPABILITY_DESCRIPTOR (IDENTIFIER) missionDescription;
goalsStartPhrase:  GOALS_DESCRIPTOR;
highlightPhrase: HIGHLIGH_DESCRIPTOR (IDENTIFIER|DIGIT|' ')+ ':';
howToPhrase: TASKS_DESCRIPTOR;
goalPhrase: ' '* DIGIT '.' ' '+  (IDENTIFIER|DIGIT|' ')+;
topicPhrase: TOPIC_DESCRIPTOR (IDENTIFIER|DIGIT|' ')+;
feedbackPhrase: (greatFeedbackPhrase|constructiveFeedbackPhase);
greatFeedbackPhrase: GREAT_FEEDBACK_DESCRIPTOR;
constructiveFeedbackPhase: CONSTRUCTIVE_FEEDBACK_DESCRIPTOR;
fromPhrase: FROM_DESCRIPTOR (IDENTIFIER|DIGIT|' ')+;
itemPhrase: ' '* '-' (IDENTIFIER|DIGIT|' '|','|'.'|':'|'('|')'|'-'|'!')+;
missionDescription: CONNECTOR (IDENTIFIER|DIGIT|' ')+;

CAPABILITY_DESCRIPTOR: ' '* 'I want to be a ' | 'I want to be an ';
GOALS_DESCRIPTOR: ' '* 'My high level goals are:';
HIGHLIGH_DESCRIPTOR: 'What I would like to highlight on what I did ' ('in ')?;
TOPIC_DESCRIPTOR: ' '* 'On topic: ';
GREAT_FEEDBACK_DESCRIPTOR: 'The great feedback that I got was:';
CONSTRUCTIVE_FEEDBACK_DESCRIPTOR: 'The constructive feedback that I got was:';
TASKS_DESCRIPTOR: ' '* 'To get there I will:';
FROM_DESCRIPTOR: ' '* 'From: ';

CONNECTOR: ' '? 'that' ' '?;
DIGIT: ('0'..'9')+;
IDENTIFIER: (NameChar|'`')+;


NEW_LINE: '\r'? '\n';
WS: (' '|'\t') -> skip;

fragment
NameChar
   : NameStartChar
   | '0'..'9'
   | '_'
   | '\u00B7'
   | '\u0300'..'\u036F'
   | '\u203F'..'\u2040'
   ;
fragment
NameStartChar
   : 'A'..'Z' | 'a'..'z'
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
   ;


// What I would like to highlight on what I did before I joined ThoughtWorks is:
// On topic: AMP Project
// The feedbacks that I got are:
// From: Linda
// To get there I will:

