package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_UNNoMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yeti.com/en_US/login");
		driver.findElement(By.cssSelector("input[id='dwfrm_profile_customer_firstname")).sendKeys("Scott");
		driver.findElement(By.cssSelector("input[id='dwfrm_profile_customer_lastname")).sendKeys("Tenefrancia");
		driver.findElement(By.cssSelector("input[id='dwfrm_profile_customer_email")).sendKeys("validusername@gmail.com");
		driver.findElement(By.cssSelector("input[id='dwfrm_profile_customer_emailconfirm")).sendKeys("alidusername@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[3]/div[1]/input[1]")).sendKeys("Ksdfjkh123$$");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[4]/div[1]/input[1]")).sendKeys("Ksdfjkh123$$");
		
		driver.findElement(By.cssSelector("button[name='dwfrm_profile_confirm']")).click();
		
	
		
		
		
		
	}

}
