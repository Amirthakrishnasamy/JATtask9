package Task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String Title= "STORE";
		if(driver.getTitle().equals(Title)) {
			System.out.println("Page landed on correct website");
		}
		else {
			System.out.println("Page not landed on correct website");
		}
			
	}

}
