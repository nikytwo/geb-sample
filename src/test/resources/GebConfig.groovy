import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

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