import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UltimateQATest extends PageSetup {


    @Test
    public void testOne () {
      WebElement buttonUsingId =  driver.findElement(By.id("idExample"));
      buttonUsingId.click();

      WebElement buttonSuccessText = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success",buttonSuccessText.getText());
    }
@Test
    public void testTwo () throws InterruptedException {
        WebElement nameInput = driver.findElement(By.id("et_pb_contact_name_0"));
        nameInput.sendKeys("Tester");

    WebElement emailInput = driver.findElement(By.id("et_pb_contact_email_0"));
    emailInput.sendKeys("Tester@tester.pl");

    Thread.sleep(2000);

    WebElement emailMeButton = driver.findElement(By.name("et_builder_submit_button"));
    emailMeButton.click();

    Thread.sleep(2000);
    WebElement thanksText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
    Assertions.assertEquals("Thanks for contacting us", thanksText.getText());
    Thread.sleep(2000);
}
}
