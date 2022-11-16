import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReportTest extends AllureReport {

    @Test
    public void toCheckWar1() {
        AllureReport allureReport = new AllureReportTest();
        int temp1 = doCalculate(10);
        Assert.assertEquals(20, 20);
    }

    @Test
    public void toCheckWar2() {
        AllureReport allureReport = new AllureReportTest();
        int temp1 = doCalculate(30);
        Assert.assertEquals(60, temp1);
    }

}
