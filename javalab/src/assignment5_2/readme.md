# Assignment 5 Part 2

In this assignment the 'Employee' class is the base class file which is extended by 'NormalEmployee' and 'BonusEmployee' classes.

### _Employee.java_
The Employee class contains all the variables which stores employee information and is kept private. The getter and setters are 
used to access these variables. It contains also an abstract method called theMonthly which returns the net salary of an employee.

### _NormalEmployee.java_
The NormalEmployee class contains the calculations required for calculating the net salary of a normal employee. It has the 
implementation of the abstract class theMonthly to return the net Salary.

### _BonusEmployee.java_
The BonusEmployee class contains the calculations required for calculating the net salary of a bonus employee. It has the 
implementation of the abstract class theMonthly to return the net Salary.

### _TestEmployee.java_
It contains the main class which calls the different object based on the user's choice of Employee Type. It takes in the input 
from the users and outputs the Net Salary.

