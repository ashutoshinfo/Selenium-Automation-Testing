import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//Download and add jar to class path 
//https://www.selenium.dev/downloads/
//Edge Driver
//https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#downloads

public class LoginTest {
	public static void main(String[] args) {
		// Set the system property for the Edge driver
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashutosh Patel\\Desktop\\Selinium\\msedgedriver.exe");

		// Create an instance of the Edge driver
		WebDriver driver = new EdgeDriver();

		// Navigate to the site
		driver.get("http://192.168.0.2:8090/");

		// Find the login elements
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement submitButton = driver.findElement(By.id("loginbutton"));

		// Enter login details
		username.sendKeys("ashutosh.patel");
		password.sendKeys("PassworHere");

		// Submit the form
		submitButton.click();

		// Verify login
		String pageTitle = driver.getTitle();
		if (pageTitle.contains("You are signed in as ashutosh.patel")
				|| pageTitle.contains("Software Development Company USA | iFour Technolab")) {
			// System.out.println("Login successful");
			// Close the browser
			driver.quit();
		}
//		else {
//			System.out.println("Login failed");
//		}

	}
}
