package refresheranswers;

import java.util.ArrayList;
import java.util.List;

public class Album {

    /* 1 */

    // Add three properties to this Album class:
    // - A title
    // - An artist
    // - The number of tracks on this album
    // What data types do these properties have?

    private String title;
    private String artist;
    private int numberOfTracks;

    /* 2 */

    // Add a constructor that enables you to pass
    // a value for each property as an argument

    // Add a no-argument constructor
    // Specify a default value for each property

    public Album() {
        this.title = "Default title";
        this.artist = "Default artist";
        this.numberOfTracks = 10;
    }

    public Album(String title, String artist, int numberOfTracks) {
        this.title = title;
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    /* 3 */

    // Write a method addTrack() that increments the number of tracks on the album by 1
    // (to be used in case a hidden track is found)
    // Do you need parameters?
    // What is the return type of the method?

    public void addTrack() {
        this.numberOfTracks++;
    }

    public String toString() {
        return String.format("The album '%s' by %s has %d tracks", this.title, this.artist, this.numberOfTracks);
    }

    public int getNumberOfTracks() {
        return this.numberOfTracks;
    }

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

        Album[] albumArray = new Album[3];

        albumArray[0] = new Album("Sunday 8 PM", "Faithless", 10);
        albumArray[1] = new Album("Reverence", "Faithless", 10);
        albumArray[2] = new Album("Nevermind", "Nirvana", 11);

        for(int i = 0; i < albumArray.length; i++) {
            System.out.println(albumArray[i].toString());
        }
    }

    // Write a method that creates and fills a list of albums
    // Three elements is enough!
    // You can use any title, artist and number of tracks you want

    public void aListOfAlbums() {

        List<Album> albumList = new ArrayList<Album>();
        albumList.add(new Album("Sunday 8 PM", "Faithless", 10));
        albumList.add(new Album("Reverence", "Faithless", 10));
        albumList.add(new Album("Nevermind", "Nirvana", 11));

        for(Album album: albumList) {
            System.out.println(album.toString());
        }
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
