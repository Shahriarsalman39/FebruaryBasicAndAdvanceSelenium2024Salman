


step -1
how to create maven project?
		create maven project--file-->new-->maven project--create simple
		project-->put group id and artifact id -- click finish

how to update java version?
    <properties>
		<maven.compiler.source>17</maven.compiler.source>
		<maven.compiler.target>17</maven.compiler.target>
	</properties>
	
	find out what java version you have in your local machine
	 open program file from this computer-->java
	 and make sure do not put higher version then your local java
	 you can put lower version
	 
	 then do maven update.
	 
how to add dependencies
	  add tag:
	  <dependencies>
	  
	  </dependencies> 
	  then add necessary dependency in the middle

how do we find dependencies
go to maven repo  https://mvnrepository.com/:
   
   search selenium-java
      get the latest version
   search WebDriverManager-->not needed any more
         get the latest version
   search TestNG
       get the latest version
   
   do a maven update
   
   in src/main/java to make sure java is working.
       build a package
       buil a class
 in src/test/java to make sure testNG is working.
        build a package
       buil a class
  create a test case with chorme and edge to test selenium
   
    WebDriverManager.chromedriver().setup();--> not needed any more
  
       WebDriverManager will find out what version browser i have in my local machine
       and then it will provide matching driver.exe file.
   
    driver.exe file job is supply the source or test code
     browser job is display supplied code properly
   
   // create a git hub account
   // push this code in github
   
   
   