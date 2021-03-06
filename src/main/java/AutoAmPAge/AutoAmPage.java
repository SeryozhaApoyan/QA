package AutoAmPAge;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AutoAmPage extends BasePage{
        private static final String url = "https://www.google.com/";
        public AutoAmPage() {
        super(url);
        }

        @FindBy(name = "q")
        WebElement searchbox;
        @FindBy(css = "#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3")
        WebElement webopage;
        @FindBy(id = "ppialog-popover-cancel-button")
        WebElement but;
        @FindBy(css = "#home-filters > div:nth-child(1) > label > span > span.selection > span")
        WebElement carTypeButton;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement inputCarType;
        @FindBy(css = "[id='select2-v-model-container']")
        WebElement carModelButton;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement modelSend;
        @FindBy(css = "#home-filters > div:nth-child(3) > label:nth-child(1) > span > span.selection > span > span.select2-selection__arrow")
        WebElement selectYear;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement yearsend;
        @FindBy(css = "#home-filters > div:nth-child(4) > label:nth-child(1) > span > span.selection > span > span.select2-selection__arrow")
        WebElement selprice;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement pricesend;
        @FindBy(css = "#home-filters > div:nth-child(4) > label:nth-child(2) > span > span.selection > span > span.select2-selection__arrow")
        WebElement finalprice;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement sendfindalprice;
        @FindBy(css = "#home-filters > div.col.s12.m12.l12.home-filters-switch > div:nth-child(1) > label > span")
        WebElement maxsazertvac;
        @FindBy(id = "search-btn")
        WebElement searchbut;

        public void inputsearchbox(String tesla) {
            searchbox.sendKeys(tesla);
            searchbox.submit();
        }

        public void webclick() {
            webopage.click();
        }

        public void dismiss() {
            but.click();
        }

        public void carType() {
            carTypeButton.click();

        }

        public void setCarType(String box) {
            inputCarType.sendKeys(box);
            inputCarType.sendKeys(Keys.ENTER);

        }

        public void modelTesla() {
            carModelButton.click();
        }

        public void yModel(String ogl) {
            modelSend.sendKeys(ogl);
            modelSend.sendKeys(Keys.ENTER);
        }

        public void year() {
            selectYear.click();
        }

        public void sendyear(String olf) {
            yearsend.sendKeys(olf);
            yearsend.sendKeys(Keys.ENTER);
        }

        public void priceclik() {
            selprice.click();
        }

        public void senprice(String oil) {
            pricesend.sendKeys(oil);
            pricesend.sendKeys(Keys.ENTER);
        }

        public void pricebox() {
            finalprice.click();
        }

        public void dolarprice(String oill) {
            sendfindalprice.sendKeys(oill);
            sendfindalprice.sendKeys(Keys.ENTER);
        }

        public void maxsazerclick() {
            maxsazertvac.click();
        }

        public void searchclick() {
            searchbut.click();
        }
}
