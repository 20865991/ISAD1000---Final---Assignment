# Cover Page 

Final Assessment 
Name: Jonathan Taylor 
StudentID: 20865991
Practical class: Thursday/12pm/314.218

## Introduction

I have choosen to implement the modules listed below:
1. Convert a given String to upper case or lower case 
2. Identify whether numeric values are in a given string 
3. Identify whether a given String is a valid number or not 
4. Remove any numerica values in a given String and then convert the string to upper or lower case 
5. Converting a number which represents a length given in meters to feet and vice versa and centimeter to inches and vice versa

### Module Descriptions

Preliminary description of your modules: 

1.  Converting a given string to upper case or lower case
		a. This submodule, StringConverter() can use default import parameters or user input. For this specific modules user input will be used. User will be prompted to choose between a lowercase or uppercase conversion. An "IF" statement is used to execute desired code of lowercase or uppercase conversion. User will be prompted to enter a word  User input will be imported as a parameter then the word is converted to desired format. Then the result will be outputted to the terminal.

2. Identify whether numeric values are in a given string 

		a. This submodule, IdentifyNumbers() can use default import parameters or user input. For this specific modules import parameters will be used. The module will import in a string as a parameter and will identify numbers in the string, by placing each character into an array. Then a for loop will check each index value, if it is a number or not and isolate them. The number/s will be returned to main and printed in the terminal. 

3. Identify whether a given string is a valid number or not 

		a. This submodule, StringValidation() can use default import parameters or user input. For this specific modules user input will be used. User will be prompted with a message to enter a string, with our without numbers. It will run through an If statement and print to the terminal the entered input if contains numbers. Does not contain numbers then prints, not a valid numerical string 

4. Remove any numeric values in a given string and then convert the string to upper case or lowercase 

		a. This submodule, removingNumbers() can use default import parameters or user input. For this specific modules import parameters will be used. A string will be imported in containing numbers, the code will remove the numbers. This is done by placing the individual characters and letters into an array and replacing the numeric values with " ". Once the word/string will be converted to lowercase or uppercase. Result will be printed to the terminal. 

5. Converting a number which represents length in meters to feet and vice versa and centimetre to inches and vice versa

		a. This submodule, conversions() will use a read file and write to file method. This will read a file and print results to another file. The conversions are placed in a menu, where the user is prompted to choose the desired conversion, either feet to meters or centimetres to inches.  The results of the conversion is then printed to a new file. 

#### Modularity 

Checklist: **bold text** 
	1. Does this method have high coupling? 
	2. Does this method have low cohesion? 
	3. Is there any redundant code in the method? 
	4. Are global variables being used inefficiently? 
	5. Is a control flag being imported? 
	6. Does the method accept different data type? 
	7. Are sequential tasks being used in the method? 
	8. Does the class/methods have a common task with one another? 
	9. Are the submodules free of control flags? 
	10. Is there any repetitive code in the submodules? 
	11. Are submodules free of differing data imports?
	12. Are any sequential tasks being used in the submodules?
	13. Is the program free of global variables? 
	14. Do submodules return their values instead of storing them in global variable? 
	15. Are the submodules only performing one task? 
	16. Can any of the submodules use another method in its submodule?

Above is a checklist used to improve the modularity of my production code. 


##### Black-Box test cases 

| isNumeric() test cases | 
| category | test data | expected result |
| ---------------------------- | ------ | ---------------------- | 
| input is a string of numbers | "5991" | "true, input is valid" | 
| input is a string of chars   | "batman" | "false, input is invalid" |
| input is a combination of string + numbers | "taylor22" | "false, input is invalid" | 

| convertString() test cases | 
| category | test data | expected result |
| ----------------------------- | ------ | ------------ | 
| input is lowercase | "taylor" | "TAYLOR" | 
| input is uppercase | "TAYLOR" | "taylor" |
| input contains a lowercase char | "BATMAn" | " " |  
| input contains an uppercase char | "Batman" | " " | 
| input contains a number | "5991" | " " | 

| removingNumbers() test cases | 
| category | test data | expected result |
| ----------------------------- | ------ | ------------ | 
| str contains a number | "TAY22" | "tay" | 
| str contains a number | "tay22" | "TAY" | 
| str contains no numbers | "TAYLOR" | "taylor" | 
| str only contains numbers | "5991" | " " | 
| str contains a number | "spiderman3" | "SPIDERMAN" | 

| identifyNumbers() test cases | 
| category | test data | expected result |
| ---------------------------- | ------ | ------ | 
| numID is a string of numbers | "5991" | "5991" | 
| numID has no numbers | "taylor" | " " | 
| numID contains a number | "taylor22" | "22" | 
| numID contains a number | "spiderman3" | "3" | 

For black 

###### White-Box test case 

| isNumeric() WB test cases | 
| Path | Tesst data | expected result |
| -------------------- | --------- | ----------------- | 
| Enter try statement | "5991" | "true" | 
| Enter catch statement | "batman" | "false" |
| Enter IF statement | "5991" | "input is valid" |
| Enter ELSE statement | "batman" | "input is invalid" |

| convertString() WB test cases | 
| Path | test data | expected result |
| ------------------ | -------- | ------------- | 
| Enter IF statement | "taylor" | "TAYLOR" | 
| Enter ELSE IF statement | "TAYLOR" | "taylor" |

###### Test Implementation and execution 


| Modeule name | BB test design(EP) |  BB test (BVP) | WB test design | EP test code (implementation/run) | BVA test code (implementation/run) | White box testing (Implementation/run) |
| ---------------------------- | ------ | ---------------------- | 


# Version Control 

To start this project by creating a local and remote repository and read over the requirements of assignment. After creating the repositories, I require a minimum of 4 branches for, production code, black box and white box testing then test implementation. These 4 branches is where most of the work will be done as the master branch will hold the final code for each section. I would typically want to try and merge at the end, once all code is finished. I prefer to merge my sub branch with the main branch once all the work has been completed. However all working on one branch at a time.

## Ethics

**bold text**
Scenario: 
You are developing a software that is used for Space craft launching. The company has many research facilities around the world, meaning facilities within the United States compared to Australia would use the imperial system. The research is done in Australia thus calculations are done in meters. The launch is done be performed in the US as Australia lacks the resources to do so. The software created is to convert meters to feet. Once completed the US scientists use the software and find faults in the conversion, being one decimal off. The software has rounded the numbers too early before the final calculation, which can cause critical rounding errors in the final result. As a consequence the men aboard the spacecraft may be place in a fatal position. 

**bold text**
a. Discuss how lack of ethical and professionalism can result in harmful effects using the code you have designed and implemented. You may refer to lecture 9, seven points useful in identifying ethical issues, as a guidance.

Acting with ethics is a result of professionalism, as it is assumed that doing a job "properly" results in working with ethics. However ethics are subjective and depends on the context of what is right and wrong. A lack of ethics is present, the faulty software has affected the safety of the "public", specifically the men who are aboard the spacecraft. Due to this the software developer's integrity may come into question, resulting in a termination of duties. The developer has put the  "public" lives at risks. As with calculations done within space, a minor rounding error can be costly, thus the criticality of rounding increases. The developer of the software has not acted ethically as this mistake has caused harm to the "public" and may affect the reputation of the company in addition to great financial losses, resulting in becoming  unable to perform another launch. The principle of deontology, is a duty or obligation that is upheld by software engineers. The developer of this conversion software had an obligation to the company and the men boarding the spacecraft, but due to this mistake it would portray the developer as negligent. Thus the integrity of the developer is compromised. In reference to consequentialism, the developer is acting unethical, as they did not understand the consequences of their actions to the greatest degree of accuracy due to the context. The programmer for the software is a new developer that has little experience with big companies. Thus once the developer is tasked with the job, they are offered a bonus of $15 000 when completed within a specified time limit. The developer completes it in time. Believing their code is flawless. The developer was too focused on the bonus and did not execute proper error checking. This is a clear conflict of interest as he is prioritising his personal gain over the safety of the "public".  

**bold text**
b. Using ACS or IEEE-CS Ethical guidelines, give two suggestions to avoid ethical and professional issues in your software proposed in this assignment. 

To avoid the conflict of interest that can be seen above; personal gain over the safety of the public. In the ACS code of ethics, the first value is primacy of public interest. The developer should be placing the interests above those of personal gain/interests. To combat this the developer may undergo various types of self-reflection and morality reflection. The integrity of the developer and the code have come under question, a lack of professionalism and incompetence, as they have ruined the reputation of the company. Employees could look at and memorise moral exemplars that are made specific to their company, to act in ethically in the eyes of their employer. For example the ACS guidelines hope to improve professionalism, enhancing the integrity of the company. As each person may have their own morals and may justify all their actions as ethical, it becomes essential that things such as the ACS guidelines exist. These are a set of guidelines for the employees to follow. If an employee followed the guidelines it can result professional development, meaning greater professionalism thus working in a way that is ethical. 

### Discussion

The overall assig