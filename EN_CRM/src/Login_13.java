import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\Version101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("dharasonya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chotumanu5");
		
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
		
		String ExpectedMsg="Welcome";
		
		String actualMsg=driver.getTitle();
		
		System.out.println(actualMsg);
		
		if(actualMsg.contains(ExpectedMsg))
		{
			System.out.println("welcome message displayed after successfully login into application.");
		}
		else
		{
			System.out.println("welcome message not displayed after successfully login into application.");
		}
		
		//driver.close();
		
	}

}
