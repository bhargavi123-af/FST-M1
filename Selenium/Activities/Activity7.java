import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity7 {
	
	public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://training-support.net/webelements/dynamic-controls");
        
        System.out.println("Page title: " + driver.getTitle());

        // Find the text field
        WebElement textbox = driver.findElement(By.id("textInput"));
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        driver.findElement(By.id("textInputButton")).click();
        
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        
        textbox.sendKeys("Example text");
        System.out.println(textbox.getDomProperty("value"));

        // Close the browser
        driver.quit();
    }

}
