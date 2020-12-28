package refresher;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    // Assert - check that the method throws an UnsupportedOperationException with message 'Unexpected method call in Album'
    // See the CalculatorExceptionTest class in the 'examples' package for an example on how to do this
}
