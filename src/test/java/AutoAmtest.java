import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;
import pages.*;
import AutoAmPAge.AutoAmPage;

public class AutoAmtest {

    AutoAmPage autoAm;
    @Test(testName = "Avto.am test")
    public void checktesla() {
        autoAm = new AutoAmPage();
        autoAm.inputsearchbox("Auto.am");
        autoAm.webclick();
        autoAm.dismiss();
        autoAm.klini();
        autoAm.klini2("Tesla");
        autoAm.modeltesla();
        autoAm.ymodel("Model Y");
        autoAm.popoq();
        autoAm.sendyear("2018");
        autoAm.priceclik();
        autoAm.senprice("67000");
        autoAm.pricebox();
        autoAm.dolarprice("67000");
        autoAm.maxsazerclick();
        autoAm.searchclick();
    }
}