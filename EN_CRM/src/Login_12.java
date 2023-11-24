import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\Version101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://epayuat.eftapme.com/FEESCRM/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("strUserId")).sendKeys("sdhara");
		driver.findElement(By.id("strPassword")).sendKeys("April@1234");

		
		for(int count=1;count<=20;count++)
		{
			
			driver.findElement(By.id("strPassword")).sendKeys("April@1234");
			driver.findElement(By.cssSelector("input[type=submit]")).click();
			//Thread.sleep(3000);
			
			System.out.println(count+" : " +driver.findElement(By.xpath("//div[@class='validation-summary-errors']/ul/li")).getText());
			
			
		}
		

		
	}

}
