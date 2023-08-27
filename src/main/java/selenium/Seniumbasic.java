package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seniumbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println("hello");
				WebDriver driver = new ChromeDriver();
		
		driver.get("https://anywhere.epam.com/en/blog/selenium-automation-tester-resume-sample");
		System.out.println(driver.getTitle());
	}
	

}
