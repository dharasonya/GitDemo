import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Login_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\New Chrome Driver\\Version101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://epayuat.eftapme.com/FEESCRM/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.id("strUserId")).sendKeys("");
		//driver.findElement(By.id("strPassword")).sendKeys("");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		Thread.sleep(4000);
		
		List<WebElement> msg=driver.findElements(By.xpath("//span[@class='field-validation-error']"));
		
		System.out.println(msg.size());
		
		for (int i=0;i<msg.size();i++)
		{
			System.out.println(msg.get(i).getText());
		}
		
		/*Select msgError=new Select(msg);
		
		int msgSize=((WebElement) msgError).getSize();
		
		System.out.println(msg.getSize());
		
		for(int i=0;i<=msgSize;i++)
		{
			System.out.println(msgError);
		}*/
		
		
		
		//List<WebElement> opt=msgError.getOptions();
		
		//for(WebElement optionSelect:opt)
		//{
		//	System.out.println(optionSelect.getText());
		//}
		

	}

}
