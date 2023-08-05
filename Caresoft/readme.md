CareSoft Interfaces
===================

You’ve joined a team of developers that has built the software for a healthcare clinic management system called CareSoft. The codebase is already fully developed, but they are working on standardizing some of their business logic to streamline reporting requirements for the Healthcare Insurance Portability and Accountability Act (HIPAA) and maintain the security of electronic Personal Health Information (PHI or ePHI).  

### Learning Objectives:

*   Become more comfortable using Spring Tool Suite (STS) tools
*   Review examples of how multiple classes may interact in a practical business scenario
*   Recognize classes and class interactions without explicitly knowing how each class is implemented
*   Become more comfortable analyzing and contributing to a codebase with unfamiliar elements
*   Implement existing interfaces in existing classes
*   Understand how interfaces and implementing interfaces differs from inheritance and extending another class

* * *

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1631900086__scrum.jpg)

New Interfaces
--------------

Related to feature requests from the business, two interfaces have been added to the application, and they have asked you to start implementing them in the appropriate classes (also provided):

*   `HIPAACompliantUser`
*   `HIPAACompliantAdmin`

Assignment
----------

Your task is to implement two given interfaces, `HIPAACompliantUser` and `HIPAACompliantAdmin` as described in two given classes, `Physician` and `AdminUser`.

Think a Lot, Code Very Little
-----------------------------

For this assignment, you will download some existing code and implement two interfaces. Ultimately you won't do too much coding in the assignment, but you will take some time to do quite a bit of analyzing.

A common joke among developers:

> "Weeks of coding can save you hours of planning."

It is advisable to develop the habit of taking the steps to really understand the problem and existing code base, lay out possible solutions and plan implementation thoroughly before ever writing a line of code.

Setup
-----

1.  Download the following file: [CareSoft](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1687986852__CareSoft.zip)
2.  Import the project into your workspace with the help of the video below.

<span id="selection-marker-1" class="redactor-selection-marker"></span>

_Remember the 20-minute rule! Don't stay stuck if you're unclear on anything._

Your Task: Implement Some Interfaces!
-------------------------------------

The codebase you are given includes two files that you'll be working in: `Physician`and`AdminUser`. You'll be adding code for the methods each class should implement from a respective interface.

Physician
---------

The `Physician` class implements the `HIPAACompliantUser` interface in the following ways:

_boolean assignPIN(int)_

Pin must be exactly 4 digits, returns false if not.  
Expected to assign the pin to the user (as a member variable)  

_boolean accessAuthorized(Integer)_

Checks the physician's id against the given id;  
returns true if they are a match, otherwise false.

AdminUser
---------

The `AdminUser` class implements the `HIPAACompliantUser` interface in the following ways:

_boolean assignPIN(int)_

Pin must be 6 digits or more; returns false if not  
Expected to assign the pin to the user (as a member variable)  

_boolean accessAuthorized(Integer)_

Compares the ids, and if they are not a match,  
creates an incident report using the `authIncident` method,  
Returns true if ids match, false if not.

The `AdminUser` class implements the `HIPAACompliantAdmin` interface in the following ways:  

_ArrayList<String> reportSecurityIncidents()_

Returns a list of strings (incidents reported)

Test
----

Your test results should look like the following:

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1687808982__1637801910careSoftTest.png)

  

_Reminder: Ask Questions!_
--------------------------

In your first role as an engineer, this kind of task is fairly typical of junior developers. These two classes would have many more methods, member variables and imports that would be unrelated to your task, and they would be part of a much larger code base. Sometimes they will give you enough background information to accomplish the task, but if not, it's okay to ask questions, after you feel you've done some digging to figure it out and don't find much to go on. For this assignment, be sure to follow that 20-minute rule, and be sure to ask if it's unclear or you hit a dead end!

  

*   Import the provided project into your workspace.
    
*   Review the code and be sure to read all comments.
    
*   Implement the required interfaces.
    
*   Test your code.