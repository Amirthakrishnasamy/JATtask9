package Task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9p3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("History")).click();
		System.out.println("The title of the page is:"+driver.getTitle());
	}

}
