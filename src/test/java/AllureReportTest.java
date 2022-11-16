import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureReportTest extends AllureReport {

    @Test
    @Step("eugene first test")
    public void toCheckMultiply() {
        AllureReport allureReport = new AllureReportTest();
        int temp1 = doCalculate(10);
        Assert.assertEquals(20, 20);
    }

    @Test
    @Step("eugene suka nahui next step")
    public void toCheckSecondMultiply() {
        AllureReport allureReport = new AllureReportTest();
        int temp1 = doCalculate(20);
        Assert.assertEquals(42, 40);
    }

}
