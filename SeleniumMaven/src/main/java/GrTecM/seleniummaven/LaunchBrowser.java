package GrTecM.seleniummaven;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser
{
   public static void main(String[] args)
   {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
   }
}
