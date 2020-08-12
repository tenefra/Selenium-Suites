import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create driver object for firefox browser
		
		//Class Name = FirefoxDriver
		
		//Need to invoke .exe file first to invoke browser geckodriver
		System.setProperty("webdriver.gecko.driver", "C:\\Testing\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
		
	}

}
