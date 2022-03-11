import base.BaseUIHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



import java.util.Base64;

public class Dummy {

    @Test
    public void dummy(){
        BaseUIHelper.getDriver().get("https://www.saucedemo.com/");
        String text =  BaseUIHelper.getDriver().findElement(By.cssSelector("[id='login_credentials']")).getText();
    }

}
