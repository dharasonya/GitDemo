import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class browser {
	
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\VersionNew\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://epayuat.eftapme.com/FEESCRM/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("strUserId")).sendKeys("sdhara");
		driver.findElement(By.id("strPassword")).sendKeys("April@1234567");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		System.out.println(driver.getTitle());
  }
  
}
