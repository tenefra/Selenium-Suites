package shoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC_RemoveItem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yeti.com");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@class='background-image-hp']/header[@class='header-main']/div[@class='header-row header-row-secondary']/nav[@class='nav-main']/ul[@class='yeti-nav-level-1 show-for-medium-custom']/li/div[@class='yeti-nav-container']/div[@id='primary-nav-yeti']/ul[@class='primary-nav-list-yeti']/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[title='Rambler 12 oz Colster Can Insulator']")).click();
		
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		driver.findElement(By.cssSelector("a[title='keep shopping']")).click();
	
		
		
		driver.findElement(By.cssSelector("a[title='View Cart']")).click();
		driver.findElement(By.cssSelector("button[class='link-primary button-remove']")).click();
	
		
		
		
		
	}

}
