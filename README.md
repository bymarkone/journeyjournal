# Journey Journal

> Imagine that you have a virtual notebook where you take notes of **everything** related to your professional journey: plans, goals, events, evidences, feedbacks, projects, statistics, realisations, etc. Then you send this information to a language processing tool, and, as a result, you can easily and graphically visualise your journey so far, track your progress and changes, share a snapshot and even prepare a report to show in a job review you will have soon. 

> How many of actually don't do that today using perhaps Evernote or Google Spreadsheets? The problem is, after some time and lots of information, to manage all that, connecting the dots, organising and easily building a report.

> We want to use DSL's and language processing features to allow you to do that in a much more straightforward way

Journey Journal, as a **product**, is an online Journal that would help people to plan, track and share their career journeys. 

It is also an **experiment** with *Language-Driven Design (LDD)*. The idea behind LDD is using domain-specific languages as the chief conductor of the design and implementation of an application. We provided further details on it further down.

And still, is a **laboratory**. At ThoughtWorks we try to create an environment where people can exercise creativity and try new technologies, and this is one of them. Check out below what is the stuff that we are using or planning to use soon.

### Colaborators

Natalia Arsand, Filipi Pelz, Marcio Viegas, Jean Kichner, Tania Silva, Alexandre Klaser, Ana Paula Machado, Pamela Rampanelli, José Mathias Gusso, Lourenço Soares, Lucas Oliveira, Ricardo Miranda, Giordana Sfreddo, Carol Cintra - all from ThoughtWorks

### What you will find here

1. [Running the App](#running)
2. [The domain: a model for planning and achieving goals](#model)
3. [Sample Snippets](#sample)
4. [How the application works](#application)
5. [Architecture](#architecture)
6. [Technologies we are using](#technology)
7. [Language-Driven Design](#ldd)


<div id="running"/>
## Running the App

1. Fork this repository and clone to your machine
2. Execute ```./gradlew bootRun``` to start the application.
3. Go to the ```samples``` folder and execute ```./runsamples.sh```

	This should take the sample file name *jarvis-lang.jj* and send to the API. As a result you shall see a file name *twdsl.jj* that is the result of processing the Jarvis language file to the TWDSL compiled language, and also *data.js* that is a JSON representation of the domain after compiling and interpreting the TWDSL file.
	
4. Open your browser and go to ```http://localhost:8080/index.html```. You shall see the report of you language there.

<div id="model"/>
## A Model for Planning and Achieving Goals

The model right now is quite simple. We hope with time, and real needs behind, we can evolve it.

- **Capability** - One can define capabilities that she wants to grow. This concept is quite loose, so a capability can either be a *become an expert programmer* or *become proficient web developer with Ruby*. A capability should be a high level goal, that can be described with a vision statement: *Speak passionately to influence, inspire and promote change* is a good vision for the capability *become a speaker*. 
- **Objective** - An objetive is something that translates the high level concept of a *capability* into an attainable goal. You might think in it in terms of a SMART description. It is something that you would be happy to achieve in a given time frame. For example, if you want to be a speaker, an objective would be *speak in at least four different conferences in the next year*.
- **Task** - Tasks break you objective in small units of work what you can incorporate in your day-to-day calendar. Think in tasks as the 'how to get there' for your objectives. If you want to develop the capability of coaching, and your objective is to create a model or framework in which you could exercise coaching, you might consider tasks like *Reading The Great Coach* , or *Follow weekly my bookmarked list of blogs on coaching* or even *Find a person to coach and test the model (make sure she is aware of that)*. 
- **Fact** - While capabilities, objetives and tasks belongs to the planning phase, facts are the things that happens in your daily life. They belong to execution phase. You can say you *Finished reading that book*, or *Today I've spoken in that cool conference about that cool topic*, or still *Just ended my first meeting with my first coachee*.
- **Feedback** - Sometimes is good to have external opinion on the things that we do, mainly because we don't want to create a wrong image about ourselves. You might be thinking that you suck at public speaking, but them your mother says that you actually is quite good and that she is proud of you (and now you are convinced!). Feedback is very useful in order to bring evidence to your achievements. Feedback can be of the form *Today Anna said that the last presentation I did was very helpful to her and that now she is much more knowledgeable in the use of TDD*.

<div id="sample"/>
## Sample Snippets

This is a file in a high level language, intended to be processed by a natural language processor.

```
I want to be a Curious that follow the passion for learning the misteries of the Universe and mankind`s History
  1. Learn French
  2. Read History and Philosophy
  3. Study Astronomy

  To get there I will:
    - Read Les Miserables of Victor Hugo
    - Read Team of Rivals
    - Do Coursera`s Introduction to Astronomy

What I would like to highlight on what I did in 2014 at ThoughtWorks is:
  On topic: Speaking
    - Talked about The Javascript Toolkit in TDC Floripa (May, 15-18)
    - Talked about What If Your Application Could Speak in TDC Floripa (May, 15-18)
    - Talked about Lightweight Java Frameworks in TDC Porto Alegre (October, 16-18)
    - Talked about Agile inside TW for university group (November)
    - Talked about DSL`s in RSJUG (March)
    - Talked in Procergs about Restless Developer (December, 2)

The constructive feedback that I got was:
  From: Neil
    - Should develop a way of talking with client business and POs more as a consultant not one who seeks to start a nice discussion
    - Should develop a way of talking with client business and POs more as giving the client the confidence you know what you are doing (body language, intonation)

```

This file is generated from the above. It's written in the TWDSL compiled language:

```
create Capability Curious with mission 'follow the passion for learning the misteries of the Universe and mankind`s History'

add Goal 'Learn French'
add Goal 'Read History and Philosophy'
add Goal 'Study Astronomy'

add Action Item 'Read Les Miserables of Victor Hugo'
add Action Item 'Read Team of Rivals'
add Action Item 'Do Coursera`s Introduction to Astronomy'

register Fact 'Talked about The Javascript Toolkit in TDC Floripa (May, 15-18)' for topic 'Speaking' on time '2014 at ThoughtWorks'
register Fact 'Talked about What If Your Application Could Speak in TDC Floripa (May, 15-18)' for topic 'Speaking' on time '2014 at ThoughtWorks'
register Fact 'Talked about Lightweight Java Frameworks in TDC Porto Alegre (October, 16-18)' for topic 'Speaking' on time '2014 at ThoughtWorks'
register Fact 'Talked about Agile inside TW for university group (November)' for topic 'Speaking' on time '2014 at ThoughtWorks'
register Fact 'Talked about DSL`s in RSJUG (March)' for topic 'Speaking' on time '2014 at ThoughtWorks'
register Fact 'Talked in Procergs about Restless Developer (December, 2)' for topic 'Speaking' on time '2014 at ThoughtWorks'

receive Constructive Feedback from Neil: Should develop a way of talking with client business and POs more as a consultant not one who seeks to start a nice discussion
receive Constructive Feedback from Neil: Should develop a way of talking with client business and POs more as giving the client the confidence you know what you are doing (body language, intonation)

```

<div id="application"/>
## How The Application Works

The way that the application works so far is by exposing some API's that will process the natural language text that describes someone's career (as explained in the [model]("#model")) and, ultimately, convert into a JSON data model that feeds some visualization tool. The complete process is described as follows:

1. The user has a text input with the narrative of her plans, facts and feedbacks. 
2. She runs a script that will send this text to the natural language processor (a very naive one for now) via REST API and returns the information converted to a script in a more formal DSL called TWDSL.
3. Then she runs another script that will send this text to the TWDSL compiler, that, in it's turn, will return a json with the information organised ready to be consumed by the view.
4. Then the user copy this final file to the web application folder, that will automatically update the website that shows a) a timeline, b) a feedbacks section and c) an outline of the plan and objectives.

It's a simple but valuable flow that allowed us to validate lot's of the assumptions we had, actually use a language to define and evolve the domain, explore both ideas of having a natural language processor and a DSL compiler, try some technologies, and, eventually, build a basic but effective visualisation for our review process at ThoughtWorks.

We are now moving on to the next phase of work, which is actually build a product of that. After lot's of conversations and an inception, we got to the idea that what we gradually want to build is:

1. **Better visualisations** for the information we have right now. We are thinking, so far, in a more **mature timeline**, a **roadmap of plans and objectives** looking both to the future and to the accomplishment of what we had planned, a **board where you can see capabilities and missions** and easily even build some interaction with it, and a **skill map** to allow us to track our progress on several skills.

2. An **online editor** that would provide continuous feedback on the text being used to register all the information on one's journey. We are considering things as **syntax highlight, auto-complete, help tools, samples, error messaging, suggestions, etc**.

3. An **account manager** that would allow user registration and storing each one's text in a safe and private way. Eventually the user will be able to share with other specific users, and even make public if she wishes, some or all information about her journey.

4. Who knows what the future reserves us, but... we would like to explore more on natural language processing, perhaps even connection with a voice recognition device. We would like also to create new and useful visualisations. We could start playing with the loads of text and information that this can give and provide more feedback to the user on his priorities. Perhaps make suggestions on what he or she could do next. Who knows even adding time management functionalities that will bring help to micro manage our agendas to reach our plans. It is not by chance that the NLP module (as you will see below) is named Jarvis. :)

<div id="architecture"/>
## Architecture

Since this is also an experiment, we are using it to test some architectures and technologies we wanted to. That is why we decided to build a module that would process natural languages. Originally we were planning to implement on a compiled DSL with a rigid structure. 

What we have right now is:

1. A main application, also a web portal, that connects all the other modules and provide a browser experience.
2. A module (named, conveniently Jarvis) that provides functionality of converting the natural language (NLP) into the compiled language. Don't be too much impressed with this NLP, right now is just a language defined with an ugly static antlr grammar. I want to move it to a more intelligent regex matcher before moving on and adding some more advance NLP techniques.
3. Another module (TWDSL) that is actually the compiler and interpreter of the DSL. It converts the text input into a semantic model first (see Fowler, Domain-Specific Languages) and then into a domain model.

It might be useful to evolve this architecture into a Microservices one, allowing each different module for processing language run independently and have a public API that exposes it's features to the outer world. This will allow evolving the TWDSL and JARVIS independent from one another, adding other type of NLP/Intelligent system (I pretty much enjoyed Samantha after watching Her), evolving JARVIS to me more than a Journey manager (I am putting some personal agenda and research here, I know this is ugly).


<div id="technology"/>
## Technologies We Are Using

* For the **portal** module right now we are using a **Spring Boot** application that loads the other modules, exposes their **REST API's**, and serves a Javascript application. 
* If the idea is testing and mixing some technologies, we might use **Node.js** to do this job, exposes it's own API's and call other modules API's hiding them from the browser.
* On the front-end front we are using **React.js** with some **Javascript** libraries and a simple build automation with **Gulp** combined with **Bower**, **SASS** and **Lodash**. This part of the system was made pretty fast to match the dates of our review period in ThoughtWorks, so there is a lot to improve there.
* Both language processor modules right now are using **AntLR** grammars, although we recognise this tool is best suitable for the DSL only. 
* I'd like to see Jarvis written in **Clojure** that fits NLP contexts. 
* On the **testing** realm, we have unit tests and api tests. The api texts fire against JARVIS and TWDSL modules with a given input and validate the output each one is expected to give.
* As we discussed in the [architecture](#architecture) session, we want to evolve the app to a **Microservices** architecture.

Nothing os this is actually unchangeable. They are only some ideas based on what many of us want's to experiment right now.

<div id="ldd"/>
## Language-Driven Design

If you are really interested in LDD I am preparing a more detailed article telling the origin of the idea, how I am defining it, and some cool applications in which I've applied the concept in the last 5 years. Some of them become systems that are running in critical processes for some big public organisations in Brazil.

I will publish that on my [Twitter](http://twitter.com/bymarkone) when it's ready.

Right now you can check [this](http://www.slideshare.net/bymarkone/what-ifyourapplicationcouldspeak) presentation in SlideShare. And also the following definition:

> Deﬁne a DSL that is going to represent the whole set of functionalities that your application communicates with the external world. Build this DSL in top of your high-level language, this second will implement the more broad domain logic of your application. Design your architecture, UX, ubiquitous language, meetings with business, testing, external APIs… in top of that DSL. This DSL is going to be the language your application speaks










