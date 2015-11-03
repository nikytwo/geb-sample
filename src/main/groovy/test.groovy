/**
 * Created by Administrator on 2015/10/22.
 */
import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver


//Browser.drive {
//    go "http://gebish.org"
//
//    assert title == "Geb - Very Groovy Browser Automation"
//
//    $("#sidebar .sidemenu a", text: "jQuery-like API").click()
//
//    assert $("#main h1")*.text() == ["Navigating Content", "Form Control Shortcuts"]
//    assert $("#sidebar .sidemenu a", text: "jQuery-like API").parent().hasClass("selected")
//}



Browser.drive {
    go "http://www.oschina.net/"

    assert title.contains("开源中国")

    $("#channel_q").value('geb')
    $('form.search [type=submit]').click()

    println($("#results h3")*.text())
    assert $("#results h3")*.text().contains("浏览器自动化测试解決方案 Geb")

}

//def loader = new ConfigurationLoader("GebConfig1.groovy")

def browser


//browser = new Browser()
//browser.go("http://www.oschina.net/")

//browser = new Browser(loader.conf)
//browser = new Browser()
browser = new Browser(driver: new FirefoxDriver())
//browser = new Browser(driver: new ChromeDriver())
//browser = new Browser(driver: new InternetExplorerDriver())
browser.go("project")

//
//browser.driver = new HtmlUnitDriver()
