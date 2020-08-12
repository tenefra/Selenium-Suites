package SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignIn_Invalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yeti.com/en_US/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("%$^&");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
		driver.findElement(By.cssSelector("label[for='dwfrm_login_rememberme']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("label[for='dwfrm_login_rememberme']")).isEnabled());
		
		driver.findElement(By.cssSelector("button[name='dwfrm_login_login']")).click();
		
	}

}
