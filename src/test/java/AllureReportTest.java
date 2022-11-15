import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReportTest {
    @Test
    public void doAllureTest() {
        Assert.assertEquals(2,2);
    }

    @Test
    public void doSecondAllureTest() {
        Assert.assertEquals(3,4);
    }
}
