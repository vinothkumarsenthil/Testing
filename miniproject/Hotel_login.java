package adactinhotel.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_login {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\new
		// project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement username1 = driver.findElement(By.xpath("//input[@id='username']"));
		username1.sendKeys("vinoth6383");
		WebElement password1 = driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys("kumar123");
		WebElement login1 = driver.findElement(By.xpath("//input[@id='login']"));
		login1.click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		location.click();
		Select s = new Select(location);
		s.selectByIndex(8);
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		hotels.click();
		Select h = new Select(hotels);
		h.selectByIndex(2);
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select r = new Select(room);
		r.selectByIndex(1);
		WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("28/11/2021");
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("29/11/2021");
		WebElement adultroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select a = new Select(adultroom);
		a.selectByIndex(1);
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select c = new Select(childroom);
		c.selectByIndex(0);
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\new project\\Screenshot\\login.png");
		FileUtils.copyFile(Source, destination);

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		select.click();
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		WebElement fn = driver.findElement(By.xpath("//input[@id='first_name']"));
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the firstname");
		String firstname = scan.nextLine();
		fn.sendKeys(firstname);

		WebElement ln = driver.findElement(By.xpath("//input[@id='last_name']"));

		System.out.println("Enter the lastname");
		String lastname = scan.nextLine();
		ln.sendKeys(lastname);

		WebElement billingareas = driver.findElement(By.xpath("//textarea[@id='address']"));
		System.out.println("Enter the billing");
		String billing = scan.nextLine();
		billingareas.sendKeys(billing);

		WebElement crno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		System.out.println("Enter credit number");
		String cn = scan.nextLine();
		crno.sendKeys(cn);

		WebElement cretype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select ct = new Select(cretype);
		ct.selectByIndex(2);
		WebElement selectmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select sm = new Select(selectmonth);
		sm.selectByIndex(3);
		WebElement selectyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select sy = new Select(selectyear);
		sy.selectByIndex(11);
		WebElement ccvno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		System.out.println("Enter CCV number");
		String ccv = scan.nextLine();
		ccvno.sendKeys(ccv);
		scan.close();
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
		WebElement my_itinerary = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		my_itinerary.click();
		TakesScreenshot st = (TakesScreenshot) driver;
		File So = st.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\new project\\Screenshot\\booking.png");
		FileUtils.copyFile(So, dest);

	}

}
