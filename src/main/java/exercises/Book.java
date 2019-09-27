package exercises;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Book {

    /* 1 */

    // Add three properties to this Book class:
    // - A title
    // - An author
    // - A year of publishing
    // What data types do these properties have?


    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    // Add a no-argument constructor
    // Specify a default value for each property


    /* 3 */

    // Write a method that sets the year of publishing to the current year
    // You can do this by assigning the right property a hard coded value of 2019, or
    // You can do this dynamically using
    //     Calendar.getInstance().get(Calendar.YEAR);
    // Do you need parameters?
    // What is the return type of the method?

    // Write a method that allows you to overwrite the author with a specified author name
    // Do you need parameters?
    // What is the return type of the method?

    // Write a method that returns a description of the book in the form
    // '<title>' by <author> was published in <year>
    // Use either string concatenation ("" + "") or String.format()

    /* 4 */

    // Write a method that creates and fills an array of books
    // Three elements is enough!
    // You can use any title, author and year of publishing you want

    // Write a method that creates and fills a list of books
    // Three elements is enough!
    // You can use any title, author and year of publishing you want

    /* 5 */

    // Add a classic for loop to the first method from section 4
    // (the one where you added the array)
    // Iterate over the array and print the title of every book in the array to the standard output

    // Add a foreach loop to the second method from section 4
    // (the one where you added the list)
    // Iterate over the array and print the title of every book in the list to the standard output

}
