package shoppingCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC_AddMultipleItems {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String[] itemsNeeded= {"RAMBLER 20 OZ TUMBLER WITH MAGSLIDER LID","RAMBLER 30 OZ TUMBLER WITH MAGSLIDER LID","RAMBLER 12 OZ COLSTER CAN INSULATOR","RAMBLER 14 OZ MUG WITH STANDARD LID","RAMBLER HALF GALLON JUG"};
		int j=0;	
		
		driver.get("https://www.yeti.com");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@class='background-image-hp']/header[@class='header-main']/div[@class='header-row header-row-secondary']/nav[@class='nav-main']/ul[@class='yeti-nav-level-1 show-for-medium-custom']/li/div[@class='yeti-nav-container']/div[@id='primary-nav-yeti']/ul[@class='primary-nav-list-yeti']/li[2]")).click();
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h3[class='product-name']"));
		
		for(int i=0;i<products.size();i++)
		
		{
			
			String name=products.get(i).getText();
		
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		
		if(itemsNeededList.contains(name))
		{
			j++;
			driver.findElements(By.cssSelector("button[title='Add to Cart']")).get(i).click();	
			
			if(j==5)
			{
				break;
			
			}
		}
		
		}
		
		
		
		
		
	}


}
