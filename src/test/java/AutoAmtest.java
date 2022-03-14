import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;
import pages.*;
import AutoAmPAge.AutoAmPage;

import java.io.FileNotFoundException;

public class AutoAmtest {

    AutoAmPage autoAm;
    @Test(testName = "Avto.am test")
    public void checktesla() throws InterruptedException {
        autoAm = new AutoAmPage();
        autoAm.inputsearchbox("Auto.am");
        autoAm.webclick();
        autoAm.dismiss();
        autoAm.carType();
        autoAm.setCarType("Tesla");
        Thread.sleep(1000);
        autoAm.modelTesla();
        autoAm.yModel("Model Y");
        autoAm.year();
        autoAm.sendyear("2018");
        autoAm.priceclik();
        autoAm.senprice("67000");
        autoAm.pricebox();
        autoAm.dolarprice("67000");
        autoAm.maxsazerclick();
        autoAm.searchclick();
    }
}
