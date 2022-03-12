import base.BaseUIHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import testCase1.TestCase1;

public class Exercise {
    @Test(testName = "Test case 1")
    public void testCase1() {
        TestCase1 testCase1 = new TestCase1();
        testCase1.clickLoginElement();
        testCase1.clickName();
        testCase1.clickEmail();
        testCase1.signUPButton();
        testCase1.setPassword();
        testCase1.selectDays();
        testCase1.selectMonths();
        testCase1.selectYears();
        testCase1.register();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        BaseUIHelper.getDriver().quit();
    }
}

