package org.alpha;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingSwitchTo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Pyro\\SeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.youtube.com/playlist?list=PLoBxKk9n0UWdzkoKKnD0nYTN06ApoEtMS");
		//List<WebElement> a=driver.findElements(By.id("video-title"));
	//	for(int i=0;i<=a.size();i++) {
			//String tex=i.getText(a);
			//System.out.println(tex);//*[@id="video-title"]
			
		}
			
		
				
	}

	
