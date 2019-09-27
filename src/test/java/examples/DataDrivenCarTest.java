package examples;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DataDrivenCarTest {

    @DataProvider
    public static Object[][] carTestData() {
        return new Object[][] {
            {"Maserati", "Ghibli", true},
            {"Ferrari","Testarossa", true},
            {"Ford","Focus", false}
        };
    }

    @Test
    @UseDataProvider("carTestData")
    public void isItalianTest(String make, String model, boolean expectedIsItalian) {

        Car myCar = new Car(make,model,"blue");
        boolean isItalian = myCar.isItalian();
        Assert.assertEquals(expectedIsItalian, isItalian);
    }
}

