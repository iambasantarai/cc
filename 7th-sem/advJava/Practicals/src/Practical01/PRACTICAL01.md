<p align="center">Practical 1 (Basic Programming)</p>

1. Write a program to create a class, instance variable, constructor and method. After this create a
   class FirstDemo with main method and access the member of above class
2. Create a class Calculate which contains data member num1 and num2 both in integer and methods
   setCalc() to set the data, calcSum() that calculate the sum of num1 and num2 and display the result,
   calcMulti() that calculate the multiplication of num1 and num2 and returns the result, calcDifference
   that calculate the difference between num1 and num2 and display the result. Now, create some
   instance of Calculate and invoke all the methods.
3. Create a class Product with name, qty and price. Create a parameterized constructor to set the
   product details. Provide the method getName(), getQty() and getPrice() that return product name,
   qty and price. Also create method getTotal() that returns the total price. Then create a class
   ProductDemo with main method that creates two object of Product and find the total price of both
   products.
4. Write a program to demonstrate method overloading condition.
5. Write a program to demonstrate single level, multi-level inheritance.
6. Provide an example of single inheritance of your choice. (Two child class inheriting single parent class)
7. Provide an example of multi-level inheritance of your choice.
8. Provide example on how constructor of super class is called.
9. Provide example on method overriding condition
10. Provide example on dynamic method dispatch
11. Create a class BankAccount that have data member accNo, Name, address, phone, gender,
    constructor to set the bank details and showDetails() method to display the account details. Create
    subclass SavingAccount which inherits BankAccount and have data member currentAmount and
    month, constructor to set the data member, methods calcTotal() that update the currentAmount by
    adding the bonus amount and return the result. (if saving month is below 3 mnth bonus is 2%, if
    saving month is between 3 to 6 month bonus is 5%, if saving month is between 6 to 12 month bonus
    is 8% and if saving month is above 1 year bonus is 11.03%). Now create the object of SavingAccount
    and demonstrate the scenario.
12. Create an abstract class Calculation which has one normal method int add(int x, int y) which will
    calculate the sum of x and y and return the results and one abstract method int mul (int x, int y) that
    performs multiplication. Create a class Demo that inherit abstract class that implement all the
    abstract method, and it have its own method int calcDiv(int x, int y) that calculates the division
    between x and y and return the result. Now create the object of Demo and demonstrate the above
    scenario. After this access the method of abstract class using reference of abstract class.
13. Demonstrate multiple inheritance using interface
14. Demonstrate inheritance in interface (extending the interface)
15. Write a program to demonstrate multithreading using both Thread class and Runnable interface.