package examples;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceToOriginTest() {

        Point point = new Point(3,4);

        Assert.assertEquals(5, point.distanceToOrigin(), 0);

        point.doubleDistanceToOrigin();

        Assert.assertEquals(10, point.distanceToOrigin(), 0);
    }
}
