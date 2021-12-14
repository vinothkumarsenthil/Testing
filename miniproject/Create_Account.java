package adactinhotel.miniproject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\new
		// project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement NewUserregistration = driver.findElement(By.xpath("//td[@class='login_register']"));
		NewUserregistration.click();
		WebElement Username = driver.findElement(By.xpath("//input[@type='text']"));
		Username.sendKeys("vinoth6383");
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("kumar123");
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@name='re_password']"));
		confirmpassword.sendKeys("kumar123");
		WebElement fullname = driver.findElement(By.xpath("//input[@name='full_name']"));
		fullname.sendKeys("vinothkumar");
		WebElement emailaddress = driver.findElement(By.xpath("//input[@name='email_add']"));
		emailaddress.sendKeys("vinovinoth.sk12@gmail.com");
		WebElement captcha = driver.findElement(By.xpath("//input[@id='captcha-form']"));
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the captcha");
		String captchavalue = scan.nextLine();
		captcha.sendKeys(captchavalue);
		scan.close();

		// captcha.sendKeys(arg0);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		WebElement register = driver.findElement(By.xpath("//input[@id='Submit']"));
		register.click();

	}

}
