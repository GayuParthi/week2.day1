package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SK");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("3/04/1999");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("22");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9457861236");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Arith");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ashwin");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Alice");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123,ECR road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("TVK nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tennessee");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("640037");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05");
		driver.findElement(By.name("submitButton")).click();
		


		
		
		
		
		
	}

}
