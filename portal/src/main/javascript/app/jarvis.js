"use strict";
var React = require("react");
var Codemirror = require("codemirror");

if (!Array.prototype.find) {
  Array.prototype.find = function(predicate) {
    if (this === null) {
      throw new TypeError('Array.prototype.find called on null or undefined');
    }
    if (typeof predicate !== 'function' ) {
      throw new TypeError('predicate must be a function');
    }
    var list = Object(this);
    var length = list.length >>> 0;
    var thisArg = arguments[1];
    var value;

    for (var i = 0; i < length; i++) {
      value = list[i];
      if (predicate.call(thisArg, value, i, list)) {
        return value;
      }
    }
    return undefined;
  };
}

var StateGuesser = (function() {

  var actualStates = {
    'CAPABILITY_DESCRIPTOR': 'capabilityPhrase',
    'GOALS_DESCRIPTOR': 'goalsStartPhrase',
    'HIGHLIGH_DESCRIPTOR': 'highlightPhrase',
    'TASKS_DESCRIPTOR': 'howToPhrase',
    'DIGIT': 'goalPhrase',
    'TOPIC_DESCRIPTOR': 'topicPhrase',
    'GREAT_FEEDBACK_DESCRIPTOR': 'greatFeedbackPhrase',
    'CONSTRUCTIVE_FEEDBACK_DESCRIPTOR': 'constructiveFeedbackPhase',
    'FROM_DESCRIPTOR': 'fromPhrase',
    'DASH': 'itemPhrase',
    'IDENTIFIER': 'itemPhrase',
    'CONNECTOR': 'missionDescription'
  };

  return {
    find: function(token) {
      return actualStates[token];
    }
  }

})();

var Jarvis = function(options, modeOptions) {
  var NameChar = new RegExp(['[0-9|_|\u00B7|\u0300-\u036F|\u203F-\u2040',
        '|A-Z|a-z|\u00C0-\u00D6|\u00D8-\u00F6|\u00F8-\u02FF',
        '|\u0370-\u037D|\u037F-\u1FFF|\u200C-\u200D|\u2070-\u218F',
        '|\u2C00-\u2FEF|\u3001-\uD7FF|\uF900-\uFDCF|\uFDF0-\uFFFD]+'].join(''));

  var tokensDef = [
    {name: "CAPABILITY_DESCRIPTOR", regex: /\s*I want to be a |I want to be an /},
    {name: "GOALS_DESCRIPTOR", regex: /\s*My high level goals are:/},
    {name: "HIGHLIGH_DESCRIPTOR", regex: /What I would like to highlight on what I did (in )?/},
    {name: "TOPIC_DESCRIPTOR", regex: /\s*On topic: /},
    {name: "GREAT_FEEDBACK_DESCRIPTOR", regex: /The great feedback that I got was:/},
    {name: "CONSTRUCTIVE_FEEDBACK_DESCRIPTOR", regex: /The constructive feedback that I got was:/},
    {name: "TASKS_DESCRIPTOR", regex: /\s*To get there I will:/},
    {name: "FROM_DESCRIPTOR", regex: /\s*From: /},
    {name: "CONNECTOR", regex: /\s?that ?/},
    {name: "DIGIT", regex: /[0..9]+/},
    {name: "DASH", regex: /-/},
    {name: "IDENTIFIER", regex: NameChar },
    {name: "NEW_LINE", regex: /\r? \n/},
    {name: "WS", regex: /( |\t) -> skip/}
  ]
  var tokenizer = function(stream, state) {
    var knownToken = tokensDef.find(function(tokenDef) {
      if (stream.match(tokenDef.regex)) {
        stream.eatWhile(tokenDef.regex);
        return true;
      }
    });
    if (knownToken) return StateGuesser.find(knownToken.name);
    stream.next();
    return null;
  }

  return {
    startState: function(base) {
      return {};
    },
    token: function(stream, state) {
      var type = tokenizer(stream, state);
      console.log(type);
      return type;

    }
  }

};

Codemirror.defineMode("jarvis", Jarvis);
