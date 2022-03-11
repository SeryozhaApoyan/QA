import base.BaseUIHelper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.*;
import pagesForPracticeTest.PracticePage;

import static org.testng.AssertJUnit.assertEquals;

public class PracticePageTest {
    @Test(testName = "Practice Test")
    public void fillPage(){
        PracticePage practicePageTest = new PracticePage();
        practicePageTest.selectRadioButton();
        practicePageTest.enterKey();
        practicePageTest.selectDropDownExample();
        practicePageTest.selectCheckBoxExample();
        practicePageTest.openNewWindow();
        practicePageTest.setPopupWindow();
        practicePageTest.popupWindowElementClick();
        practicePageTest.setNameAlert();
        practicePageTest.setAlertBtn();
        practicePageTest.setNameAlert2();
        practicePageTest.SetAlertBtn();
        String expectedText = "Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C";
        String actualText = practicePageTest.getTableDataContent(9, 2);
        assertEquals(expectedText, actualText, "Texts doesn't matching -> "
                + expectedText + " doesn't matching " + actualText);
        practicePageTest.setText();
        practicePageTest.clickHide();
        practicePageTest.clickShow();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        BaseUIHelper.getDriver().quit();
    }

}
