import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\Version101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("dharasonya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chotumanu5");
		
		//driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
		
		
		WebElement input = driver.findElement(By.id("pass"));
		boolean isEncrypted = input.getAttribute("chotumanu5").equals("chotumanu5");
		
		System.out.println(isEncrypted);
		

	}

}
