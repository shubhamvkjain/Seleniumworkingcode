import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstSeleniumCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		 WebElement username = driver.findElement(By.name("email"));
		
		 username.sendKeys("sjbhau@gmail.com");
		 
		 driver.findElement(By.id("continue")).click();
		
	WebElement password = driver.findElement(By.id("ap_password"));
		 
		 password.sendKeys("Issac@Newton1");
		
		WebElement login = driver.findElement(By.id("auth-signin-button"));
		
		login.click();
		
	
		
	}

}
