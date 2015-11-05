import geb.Browser
import geb.junit4.GebReportingTest
import geb.junit4.GebTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by Administrator on 2015/11/5.
 */

@RunWith(JUnit4)
class adfaa {
    @Test
    void tttt() {
        Browser.drive {
            go "/"

            assert title.contains("开源中国")

            $("#channel_q").value('geb')
            $('form.search [type=submit]').click()

            println($("#results h3")*.text())
            assert $("#results h3")*.text().contains("浏览器自动化测试解決方案 Geb")
        }
    }
}
