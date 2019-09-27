package refresher;

import org.junit.Test;

public class AlbumTest {

    // These tests can be used to test the implementation of Section 4 and 5 in src/main/java/refresher/Album.java

    @Test
    public void testAnArrayOfAlbums() {

        Album myAlbum = new Album();
        myAlbum.anArrayOfAlbums();
    }

    @Test
    public void testAListOfBooks() {

        Album myAlbum = new Album();
        myAlbum.aListOfAlbums();
    }

    // Write a test method that does the following:
    // Arrange - create a new album that represents Faithless - Sunday 8PM with 11 tracks
    // Act - call the addTrack() method you defined earlier
    // Assert - use an appropriate JUnit assertion method to check that the number of tracks equals 12

    // Write a test method that does the following:
    // Arrange - create a new album that represents Alanis Morissette - Jagged Little Pill with 13 tracks
    // Act - call the oops() method that is defined in the Album class
    // Assert - check that the method throws an Exception
    // You can do this in two ways:
    // 1) Only check that an Exception is thrown using the 'expected =' notation, see
    // https://www.baeldung.com/junit-assert-exception for an example under bullet 3.
    // 2) Check not only the type of exception but also its message, using ExpectedException and the JUnit @Rule
    // https://junit.org/junit4/javadoc/4.12/org/junit/rules/ExpectedException.html
}
