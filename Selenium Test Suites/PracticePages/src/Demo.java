import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create driver object for chrome browser
		
		//Class Name = ChromeDriver
		
		//Need to invoke .exe file first to invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("This is my login email");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("This is my password");
		driver.findElement(By.xpath("//table[@role='presentation']/tbody/tr[3]/td[2]/div/a")).click();
		
//		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("This is my login email");
//		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("This is my password");
		

		
	}

}
