package SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignIn_ShowPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yeti.com/en_US/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password12345");
		driver.findElement(By.cssSelector("button[class='toggle-password']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("button[class='toggle-password']")).isDisplayed());
		
		
		
	}

}
