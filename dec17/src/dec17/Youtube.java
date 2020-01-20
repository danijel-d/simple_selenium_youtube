package dec17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Youtube {

	public static void timeSleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "http://www.youtube.com";
		driver.get(url);

		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
		element.sendKeys("Coldplay paradise");
		
		timeSleep();
		WebElement element2 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		element2.click();
		timeSleep();

		WebElement element3 = driver.findElement(By.xpath(
				"//yt-formatted-string[@class='style-scope ytd-video-renderer'][contains(text(),'Coldplay - Paradise (Official Video)')]"));
		element3.click();
		
	}

}
