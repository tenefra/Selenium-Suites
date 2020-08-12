import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create driver object for chrome browser
		
		//Class Name = ChromeDriver
		
		//Need to invoke .exe file first to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("This is the login");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	    System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
	}

}
