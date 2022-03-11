package pagesForPracticeTest;

import base.BaseUIHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static base.BaseUIHelper.getDriver;
import static org.testng.Assert.*;

public class PracticePage extends BasePage {
    private static final String url = "https://rahulshettyacademy.com/AutomationPractice/";
    public PracticePage() {
        super(url);
    }
    @FindBy(css = "input[value='radio1']")
    private WebElement radioButton;

    @FindBy(css = "[class='inputs ui-autocomplete-input']")
    private WebElement suggessionClassExampleWebElement;

    @FindBy(css = "[name='dropdown-class-example']")
    private WebElement dropdownExampleWebElemnt;

    @FindBy(css = "[id='checkBoxOption2']")
    private WebElement checkBoxExampleWebElement;

    @FindBy(css = "[id='openwindow']")
    private WebElement openWindowWebElement;

    @FindBy(xpath = "//a[@class= 'btn-style class1 class2']")
    private WebElement openTubWebElement;

//    @FindBy(css = "[name='enter-name']")
//    private WebElement enterName;
//
//    @FindBy(css = "[id='alertbtn']")
//    private WebElement alertWebElement;
//
//    @FindBy(css = "[id='confirmbtn']")
//    private WebElement alertConfirmWebElement;

    @FindBy(css = "[id='product'] tbody tr td")
    List<WebElement> listTableData;

    @FindBy(css = "[value='Hide']")
    private WebElement hideWebElement;

    @FindBy(css = "[name='show-hide']")
    public WebElement hideShowWebElement;

    @FindBy(css = "[value='Show']")
    private WebElement showWebElement;

    @FindBy(css = "[class=\"btn-style class1\"]")
    private WebElement popupWindowElement;

    @FindBy(css = "[class='btn-style class1 class2']")
    private WebElement switchTubWebElement;

    @FindBy(css = "[id='alertbtn']")
    private WebElement alertButtonWebElement;

    @FindBy(css = "[name='enter-name']")
    private WebElement nameAlertWebElement;

    @FindBy(css = "[id='confirmbtn']")
    private WebElement confirmAlertWebElement;

    public void selectRadioButton(){
        radioButton.click();
    }
    public void enterKey(){
        suggessionClassExampleWebElement.sendKeys("test");
    }
    public void selectDropDownExample(){
        Select selectDropDownExample = new Select(dropdownExampleWebElemnt);
        selectDropDownExample.selectByVisibleText("Option1");
    }
    public void selectCheckBoxExample(){
        checkBoxExampleWebElement.click();
    }
    public void openNewWindow(){
        openWindowWebElement.click();
    }

    public void setPopupWindow() {
        popupWindowElement.click();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!parent.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                driver.close();
                driver.switchTo().window(parent);
            }
        }
    }
    public void popupWindowElementClick(){
        switchTubWebElement.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
    public void setNameAlert() {
        nameAlertWebElement.sendKeys(" ALERT one");
    }


    public void setAlertBtn() {
        alertButtonWebElement.click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert Accepting " + alertMessage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        alert.accept();
    }


    public void setNameAlert2() {
        nameAlertWebElement.sendKeys(" ALERT Two");
    }


    public void SetAlertBtn() {
        confirmAlertWebElement.click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert Dismiss " + alertMessage);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.dismiss();
    }
    private int getTbleItem(int rowindex, int columnIndex) {
        return 3 * (rowindex - 1) + (columnIndex - 1);
    }

    public String getTableDataContent(int rowIndex, int columnIndex) {
        int tdIndexToGet = getTbleItem(rowIndex, columnIndex);
        return listTableData.get(tdIndexToGet).getText();
    }
    
    public void setText(){
        hideShowWebElement.click();
        hideShowWebElement.sendKeys("Sergo");
    }
    public void clickHide(){
        hideWebElement.click();
    }
    public void clickShow(){
        showWebElement.click();
    }
}
