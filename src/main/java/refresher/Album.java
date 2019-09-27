package refresher;

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

    // Add a classic for loop to the first method from section 4
    // (the one where you added the array)
    // Iterate over the array and print the album info summary (from section 3) in the array to the standard output
    // Use System.out.println to print text to the standard output

    // Add a foreach loop to the second method from section 4
    // (the one where you added the list)
    // Iterate over the list and print the album info summary (from section 3) in the array to the standard output
    // Use System.out.println to print text to the standard output

    public void oops() throws Exception {

        throw new Exception("Unexpected method call in Album");
    }
}
