fileReader.java:
A submodule used to be able to read in a file and return an array of values. Due to directory issues to have a successful readfile
the code folder and code must be run in this folder, to be able to read specified file.

lengthConverter.java: 
This Submodule is used for inches to cm, m to feet conversions. This submodule will read a file and take in the values through an array, then execute the desired calculations. 
Then the new results will be placed into a new array then will be returned to a new array. The new array will be imported into a writetofile method, to be outputted in a new file.

MainMenu.java: 
This was created to display that the production code works. It will ask the user to pick from options, such as validating a string to check if it is numerical or not.

numericalString.java:
This submodule is used to identify numbers within a string. The input will be imported as a parameter and will be placed into an array. If the input contains a number it will print out 
the number to the terminal. 

removeNumbers.java: 
This submodule is used to remove numbers within a string. Input is obtained through user input and will be checked. If the input contains a number it will be removed. If the string is 
lowercase for example then it will converted to uppercase without the number. 

StringCOnverter.java: 
This submodule is used to convert strings from uppercase to lowercase and vice versa. User input is utilised, thus an IF statement will be used to check if the input is lowercase or uppercase
and the opposite conversion will be executed

stringValidation.java: 
This submodule is used to check if a string is numerical, the use of boolean can be seen. If user input is a valid numerical string the boolean variable will equal true otherwise if not valid 
it will return false. 

utils.java: 
Contains the conversion calculations to improve modularity within my production code. Also contains the writetofile submodule. The calculations will are specified to each conversion 
for example inches to cm or m to feet. 

WBtestFile.java: 
This is my test implementation of isNumeric() and convertString() for whiteBox testing without a unit testing framework

numericalStringTest.java: 
This is my test implementation of identifyNumbers() for blackBox testing without using a unit testing framework

removeNumbersTest.java: 
This is my test implementation of removingNumbers() for blackBox testing without using a unit testing framework

StringConverterTest.java: 
This is my test implementation of convertString() for blackBox testing without using a unit testing framework

StringValidationTest.java: 
This is my test implementation of isNumeric() for blackBox testing without using a unit testing framework

conversion1Test.java: 
This is my test implementation of conversion1() for blackBox testing without using a unit testing framework

conversion2Test.java: 
This is my test implementation of conversion2() for blackBox testing without using a unit testing framework

file.txt: 
The test data for the length converter submodule

testFile.java:
This file is located in the lib folder that is used for JUnit testing, this file contains al my test files above. However thsi test implementation uses JUnit as the unit testing framework
