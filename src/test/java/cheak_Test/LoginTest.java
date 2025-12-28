package cheak_Test;

import org.testng.annotations.Test;

import cheak_Base.Base_class;
import cheak_Page.Login_page;
import cheak_util.Excelutils;

public class LoginTest extends Base_class {

    @Test
    public void loginFromExcel() throws Exception {

        Login_page lp = new Login_page(driver);

        String xl = "C:\\Users\\lenovo\\OneDrive\\Desktop\\selenium works\\Cheak_login.xlsx";
        String sheet = "Cheak_login";

        int rowCount = Excelutils.getRowCount(xl, sheet);

        for (int i = 1; i <= rowCount; i++) {

            String email = Excelutils.getCellValString(xl, sheet, i, 0);
            String password = Excelutils.getCellValString(xl, sheet, i, 1);

            System.out.println("Email ---- " + email);
            System.out.println("Password ---- " + password);

            driver.get("https://www.cheak.com/");

            lp.bttn_click();
            lp.SetValues(email, password);
            lp.button_click();

            Thread.sleep(2000);

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.cheak.com/account";

            if (actualUrl.equals(expectedUrl)) {
                System.out.println("Login successful");
            } else {
                System.out.println(" Login failed  " );
                driver.get("https://www.cheak.com/account/login?return_url=%2Faccount");
            }
        }
    }
}
