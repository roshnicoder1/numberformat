## Problem Statement: Find the number format of given a 3 digits positive number. Let us use the letter H to mean "hundred", the letter T to mean "ten" and “1, 2, . . . n” to represent the ones digit n (<10) in number format. ##

**Given a 3 digits positive number, find the number format of given a 3 digits positive number **

**This exercise should be completed by writing unit test cases. Create the following classes under the package com.stackroute.basics inside test folder:**


    +NumberFormatTests
        -Should check findNumberFormat method for three digit positive number
        -Should check findNumberFormat method for three digit positive number ending with zero 
        -Should check findNumberFormat method for three digit positive number with zero in the middle
        -Should check findNumberFormat method does not return null
------------------------------------------------------
    +NumberFormatAppTests
        -Should check inputValidator method prints error message "Please give proper positive number not negative number" if input is negative number 
        -Should check inputValidator method prints error message "Please give proper positive number not zero" if input is zero
        -Should check inputValidator method prints error message "Please give proper positive number less than 1000 and greater than 99" if input is greater than 999
        -Should check inputValidator method prints error message "Please give proper positive number greater than 99 and less than 1000" if input less than 100 and greater than zero
        -Should check findNumberFormat method with input and prints result the result or not 

## Example
    Sample Input:
    123
    
    Expected Output:   
    HTT123
--------------------------------------------------------
    Sample Input:
    444
    
    Expected Output:
    HHHHTTTT1234
--------------------------------------------------------
    Sample Input:
    -20
    
    Expected Output:
    Please give proper positive number not negative number
--------------------------------------------------------
    Sample Input:
    300
    
    Expected Output:
    HHH
--------------------------------------------------------
    Sample Input:
    1000
    
    Expected Output:
    Please give proper positive number less than 1000 and greater than 99
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding