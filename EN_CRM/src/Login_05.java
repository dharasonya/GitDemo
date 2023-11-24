import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\Version101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://epayuat.eftapme.com/FEESCRM/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("strUserId")).sendKeys("");
		driver.findElement(By.id("strPassword")).sendKeys("April@1234567");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		

		System.out.println(driver.findElement(By.xpath("//div[@class='validation-summary-errors']/ul/li")).getText());

	}

}
