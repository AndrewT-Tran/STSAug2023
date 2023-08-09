Omikuji Form
============

Omikuji (おみくじ) is a form of fortune telling written on small pieces of paper. Because they are chosen at random from many boxes of fortunes, one can only hope that their fortune will reveal good luck. In order to provide your friends with better odds, you will make an Omikuji app that will produce fortunes based on questions you ask them, so that their fortune will never be like the one below!

### Learning Objectives:

*   Get more comfortable with POST and passing information via a form
*   Be completely comfortable referencing static CSS
*   Note the importance of making your key assignments/projects look better
*   Understand why rendering HTML on a URL that received a POST is a bad idea

* * *

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1631236034__omikuji_paper.jpeg)

Assignment:
-----------

For this assignment you may either create a new project or add this functionality to your Daikichi Assignment. You'll be adding 3 more routes, JSP, JSTL and static content.

The routes you will need:

1.  A route to render the home page that shows the Omikuji form
2.  A POST route to process the form when the user hits "send"
3.  A route to render their fortune

![](https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1640631000__omikuji_wireframeSPOrigami.png)

*   Make a request mapping for the URL '/omikuji' to render the main page showing the Omikuji form.
    
*   Render the form as shown in the wireframe.
    
*   Make a request mapping for the URL '/omikuji/show' that renders a page with a message. Include an anchor tag that goes back to '/omikuji'.
    
*   Include a request mapping to handle processing the information from the form. Use session to store the form input and redirect to the '/omikuji/show' route.
    
*   Dynamically render the template for the '/omikuji/show' route using the information saved in session.