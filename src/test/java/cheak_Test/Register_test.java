package cheak_Test;

import org.testng.annotations.Test;

import cheak_Base.Base_class;
import cheak_Page.Register_page;
import cheak_util.Excelutils;

public class Register_test extends Base_class {

    @Test
    public void Register_Account() throws InterruptedException {

        Register_page rp = new Register_page(driver);
        rp.buttn_click();

        String xl = "C:\\Users\\lenovo\\OneDrive\\Desktop\\selenium works\\Cheak.xlsx";
        String sheet = "Cheak";

        int rowCount = Excelutils.getRowCount(xl, sheet);
        System.out.println("Total rows in sheet: " + rowCount);

        if (rowCount <= 0) {
            System.out.println("No data found in Excel sheet: " + sheet);
            return;
        }

        for (int i = 1; i <= rowCount; i++) { 
            String firstName = Excelutils.getCellValString(xl, sheet, i, 0);
            String lastName  = Excelutils.getCellValString(xl, sheet, i, 1);
            String email     = Excelutils.getCellValString(xl, sheet, i, 2);
            String password  = Excelutils.getCellValString(xl, sheet, i, 3);

            System.out.println("First Name: " + firstName);
            System.out.println("Last Name : " + lastName);
            System.out.println("Email     : " + email);
            System.out.println("Password  : " + password);

            rp.SetValues(firstName, lastName, email, password);
            Thread.sleep(1000);
            rp.Register();
            Thread.sleep(2000);

            driver.get("https://cheak.com/account/register");
        }
    }
}
