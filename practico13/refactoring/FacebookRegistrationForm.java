package practico13.refactoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookRegistrationForm {

    WebDriver driver;

    public FacebookRegistrationForm(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public void fillingForm(String nombre, String apellido, String email){
        driver.findElement(By.name("firstname")).sendKeys(nombre);
        driver.findElement(By.name("lastname")).sendKeys(apellido);
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
        driver.findElement(By.xpath("//*[@name='sex'][@value='-1']")).click();


    }

}
