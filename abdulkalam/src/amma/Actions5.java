package amma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions5 {

	public static void main(String[] args) throws Exception {
		//launch site
		System.setProperty("webdriver.chrome.driver", "F:\\SADIQ\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jqueryui.com/slider");
		
		//verticla slider
		
				driver.findElement(By.xpath("//div[@class='demo-list']/descendant::*[23]")).click();//click on vertical link in demo list
				driver.switchTo().frame(0);
				WebElement e = driver.findElement(By.xpath("//div[@id='slider-vertical']/descendant::*[2]"));
				Actions a= new Actions(driver);
				a.dragAndDropBy(e,0,100).build().perform();;
				Thread.sleep(5000);
				a.dragAndDropBy(e,0,-100).build().perform();;
				driver.switchTo().defaultContent();
				//close site
				driver.close();
	}

}
