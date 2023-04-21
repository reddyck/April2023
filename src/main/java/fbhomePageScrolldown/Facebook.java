package fbhomePageScrolldown;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class Facebook {
static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	}

		@BeforeTest
		void chromeLaunch()
		{
			driver.get("http://gmail.com");		
			}
	

}
