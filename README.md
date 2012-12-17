This is the web application that runs http://cookbook.liftweb.net.

To build the site:

Checkout the cookbook source. From that directory run:

    $ cat [0-9]*asciidoc | asciidoc  -b html5 -a toc2 --theme=flask - > /path/to/cookbook.liftweb.net/src/main/webapp/index.html 
    $ cp -r images/* /path/to/cookbook.liftweb.net/src/main/webapp/images/

Commit the changes HTML and images, and the web site will be updated.




