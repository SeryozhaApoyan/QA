package testCase1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.Random;

public class TestCase1 extends BasePage {
    private static final String url = "http://automationexercise.com/";
    public TestCase1() {
        super(url);
    }

    public void clickEmail() {
        StringBuilder str = new StringBuilder("");
        str.append(generateRandomString(12)).append("@gmail.com");
        System.out.println(str);
        emailWebElement.click();
        emailWebElement.sendKeys(str);
    }

    @FindBy(linkText = "Signup / Login")
    private WebElement loginElement;

    @FindBy(xpath = "//input[@data-qa= 'signup-name']")
    private WebElement loginName;

    @FindBy(xpath = "//input[@data-qa= 'signup-email']")
    private WebElement emailWebElement;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpButton;

    @FindBy(id = "password")
    private WebElement passwordWebElement;

    @FindBy(id = "days")
    private WebElement daysWebElement;

    @FindBy(id = "months")
    private WebElement monthsWebElement;

    @FindBy(id = "years")
    private WebElement yearsWebElement;

    @FindBy(id = "newsletter")
    private WebElement newsLetter;

    @FindBy(id = "optin")
    private WebElement option;

    @FindBy(id = "first_name")
    private WebElement first_name;

    @FindBy(id = "last_name")
    private WebElement last_name;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(id = "address1")
    private WebElement address1;

    @FindBy(id = "address2")
    private WebElement address2;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "state")
    private WebElement state;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    @FindBy(id = "mobile_number")
    private WebElement mobile_number;

    @FindBy(css = "button.btn.btn-default")
    private WebElement defaultBtn;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    private WebElement accountCreated;

    @FindBy(linkText = "Delete Account")
    private WebElement deleteAccount;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    private WebElement continue1;



    public static String generateRandomString(int strLen) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = strLen;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
    public void clickLoginElement(){
        loginElement.click();
    }
    public void clickName(){
        loginName.click();
        loginName.sendKeys("Seryozha");
    }

    public void signUPButton(){
        signUpButton.click();
    }
    public void setPassword(){
        passwordWebElement.click();
        passwordWebElement.sendKeys("mytv04021990");
    }
    public void selectDays(){
        daysWebElement.click();
        Select selectDays = new Select(daysWebElement);
        selectDays.selectByVisibleText("4");
    }
    public void selectMonths(){
        monthsWebElement.click();
        Select selectMonths = new Select(monthsWebElement);
        selectMonths.selectByVisibleText("February");
    }
    public void selectYears(){
        yearsWebElement.click();
        Select selectYears = new Select(yearsWebElement);
        selectYears.selectByVisibleText("1990");
    }
    public void register(){
        newsLetter.click();
        option.click();
        first_name.click();
        first_name.sendKeys("Seryozha");
        last_name.click();
        last_name.sendKeys("Apoyan");
        company.click();
        company.sendKeys("ACA");
        address1.click();
        address1.sendKeys("Argishti 4/1");
        address2.click();
        address2.sendKeys("Argishti 4/1, 45");
        country.click();
        Select selectCountry = new Select(country);
        selectCountry.selectByVisibleText("Canada");
        state.click();
        state.sendKeys("aaa");
        city.click();
        city.sendKeys("bbb");
        zipcode.click();
        zipcode.sendKeys("123");
        mobile_number.click();
        mobile_number.sendKeys("93600777");
        defaultBtn.click();
        continue1.click();
    }
    public void delete(){
        deleteAccount.click();
    }
}
