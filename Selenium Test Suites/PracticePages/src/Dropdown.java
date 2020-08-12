import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_StudentDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_StudentDiscount']")).isEnabled());
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("uni");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("United States (USA)"))
					{
				option.click();
				break;
					}
		}
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//*[@value='GOI']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@value='MAA'])[2]")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
		{
			System.out.println("Return date is disabled.");
				Assert.assertTrue(true);
		}
		else 
		{
		Assert.assertTrue(false);	
		}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Return date is enabled.");
				Assert.assertTrue(true);
		}
		else 
		{
		Assert.assertTrue(false);	
		}
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<4) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
//		for(int i=1;i<5;i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//static dropdown for currency
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		
	}

}
