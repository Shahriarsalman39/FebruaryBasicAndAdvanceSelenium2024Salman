
how do you build testNG xml file ?
how do you build package/project level xml file
how does xml file determine which calss should be in the xml file
how do you run fail test cases in testng or how do you run sanity test
how do you see testng report
what index.html
what is fail.xml
what is annotations
how they work
what is the hirerache/order of annotation
what is testng attributes
what is priority
what is the highest priority=0
if you do not set priority how it run == alphabatical order
what is description
what is depndsonMehtood

how do you design smoke, regression suites?
  step #1
     design TestNg class file with attributes as groups="smoke" or  groups="regression"
  step #2
   build a group tag in the xml file such as 
			   <groups>
				<run>
					<include name="smoke"></include>
				</run>
			   </groups>

how do you run different test from different classes on the same xml suites 

 step #1
     design TestNg class file with attributes as groups="smoke" or  groups="regression"
  step #2
   build a group tag in the xml file such as 
			   <groups>
				<run>
					<include name="regression"></include>
				</run>
			   </groups>
			   
  step #3
      add package name and class name appropriately. 
      formula== package name . class name
			   <test  name="regresssion Tests">
			    <classes>
			      <class name="com.facebook_testNG.TestNgFaceBookGrouping"/>
			      <class name="com.facebook_testNG.TestNgGrouping"/>
			    </classes>
			  </test> 
			  
how do you design one test part of multiple groups

step #1
     design TestNg class file with attributes as @Test(groups={"smoke","regression"})
     
how do you design exclude or what is exclude tag in testNG xml file
  exclude will run everything but that group of tag 
  step #3  
				  <groups>
					<run>
						<exclude name="regression"></exclude>
					</run>
				   </groups>