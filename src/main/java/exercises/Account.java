package exercises;

public class Account {

    /* 1 */

    // Add three properties to this Account class:
    // - one that represents the balance (for now, assume that a balance is expressed in whole euros (no cents))
    // - one that represents the account number (a number value)
    // - one that stores the type of account (either 'checking' or 'savings')
    // What data types do these properties have?


    /* 2 */

    // Add a constructor that enables you to pass
    // a value for the properties as arguments

    // Add a no-argument constructor
    // Specify a default value for each property
    // The account number can be a fixed value for now, such as 12345


    /* 3 */

    // Add a method getBalance() that returns the account balance
    // Do you need parameters?
    // What is the return type of the method?


    // Write a method deposit() that allows you to deposit money (whole euros only, again) into an account
    // Do you need parameters?
    // What is the return type of the method?


    // Write a method withdraw() that allows you to withdraw money (whole euros only, again) from an account
    // Do you need parameters?
    // What is the return type of the method?



    // Write a method toString() that returns a description of the account in the form
    // The account with number <account number> is of type '<account type>' and has a balance of <balance>
    // Use either string concatenation ("" + "") or String.format()
    // Do you need parameters?
    // What is the return type of the method?


    /* 4 */

    // Complete the method anArrayOfAccounts() that creates and fills an array of accounts
    // Three elements is enough!
    // You can use any balance, type and account number you want
    public void anArrayOfAccounts() {

    }

    // Write a method that creates and fills a list of accounts
    // Three elements is enough!
    // You can use any balance, type and account number you want
    public void aListOfAccounts() {

    }

    /* 5 */

    // Add an enhanced loop to both methods from section 4
    // Iterate over the array and the list and print the result of the toString()
    // method to the standard output for each account in the array c.q. the list.

    /* 6 */

    // Create an enumeration called AccountType and add possible values CHECKING or SAVINGS
    // Modify your account class so that the account type can only have a value included in this enum.

    /* 7 */

    // Modify the implementation of the withdraw() method so that you can only overdraw on CHECKING accounts
    // If you try and overdraw on an account of type SAVINGS, print a message to the standard output.
    // DON'T perform the overdraw in this case!

    /* 8 */

    // Modify the implementation of the withdraw() method again, but now so that it
    // throws an ArithmeticException when you try and overdraw on a savings account.
}
