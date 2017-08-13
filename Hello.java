import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hello {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\genral softwares\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.scala-lang.org/");
	    driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div[2]/nav/ul/li[1]/a")).click();
	    Thread.sleep(10000);
	    WebElement e = driver.findElement(By.xpath("//*[@id=\"inner-main\"]/section[2]/div/div/div/div[1]/a[1]/div[1]/h5"));
	    Thread.sleep(10000);
	    Actions action = new Actions(driver);
	    action.moveToElement(e).build().perform();
	    WebElement a=driver.findElement(By.xpath("//*[@id=\"inner-main\"]/section[2]/div/div/div"));
	    
		
		System.out.println(a.findElements(By.tagName("a")).size());   
	 
	}

}