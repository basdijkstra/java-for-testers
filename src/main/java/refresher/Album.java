package refresher;

import java.util.ArrayList;
import java.util.List;

public class Album {

    /* 1 */

    // Add three properties to this Album class:
    // - A title
    // - An artist
    // - The number of tracks on this album
    // What data types do these properties have?


    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    // Add a no-argument constructor
    // Specify a default value for each property


    /* 3 */

    // Write a method addTrack() that increments the number of tracks on the album by 1
    // (to be used in case a hidden track is found)
    // Do you need parameters?
    // What is the return type of the method?


    // Write a method toString() that returns a summary of the album info
    // Use String.format() to construct the following sentence:
    // The album '<title>' by <author> has <number of tracks> tracks
    // Do you need parameters?
    // What is the return type of the method?

    /* 4 */

    // Write a method that creates and fills an array of albums
    // Three elements is enough!
    // You can use any title, artist and number of tracks you want

    public void anArrayOfAlbums() {
    }

    // Write a method that creates and fills a list of albums
    // Three elements is enough!
    // You can use any title, artist and number of tracks you want

    public void aListOfAlbums() {
    }

    /* 5 */

    // Add an enhanced loop to both methods from section 4
    // Iterate over the array and the list and print the result of the toString()
    // method to the standard output for each album in the array c.q. the list.

    public void oops() throws UnsupportedOperationException {

        throw new UnsupportedOperationException("Unexpected method call in Album");
    }
}
