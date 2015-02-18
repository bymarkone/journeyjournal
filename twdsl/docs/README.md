## Thoughtworker Journey DSL

### Purpose

The purpose of this project is to build a language for the professional journey of a person. At a high level, we want a way a person could express, with this language, the areas in which she wants to develop, what capabilities she want to make grow, what are the targets and aims for a specific topic, what are the activities she has been doing to get there, what other people are saying about her progress.. and much more.
In the end, after running some precessing tool for this language, this person could be able to see her progress, timeline, actual status, etc. 

### Domain

As of August 21th, we were working with the following domain objects:

- Planning Phase:
  - Area: an area in which a person wants to develop
  - Capability: as specific topic/knowledge/actitude/skill within an area
  - Expectation: a measurable, timeboxed target someone want to achieve 
  - Action: what actions must be undertaken to reach the expectation

- Execution Phase:
  - Facts: what facts happened that helps you to understand and measure the progress on some capability.

- Feedback Phase:
  - Feedback: what feedback could you catch from things that happened - both from other, public and yourselfe.
  - Trajetory: what was you trajetory for a specific period of time.  

### Grammar

- @see TwDsl.g4
- @see Dsls And Journey.pdf

### Setup

- install antlr: ```brew install antlr```
- generate parser: ```antlr4 TwDsl --no-listener -visitor TwDsl``` 
- compile generated java sources: ```javac *.java -classpath /usr/local/Cellar/antlr/4.4/antlr-4.4-complete.jar```
- to test your app use: ```grun TwDsl phrases --gui``` 

### Using AntlrWorks
- download AntlrWorks and use it! 
