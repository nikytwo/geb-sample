import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver


System.setProperty("webdriver.chrome.driver", "d:\\FreeSoft\\chromedriver\\chromedriver.exe");

driver = {
    new ChromeDriver()
}

baseUrl = "http://www.oschina.net/"

environments {

    firefox {
        driver = { new FirefoxDriver()}
    }

    chrome {
        driver = {new ChromeDriver()}
    }
}