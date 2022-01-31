package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
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
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Find Contacts")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
	driver.close();
	
	
}
}
