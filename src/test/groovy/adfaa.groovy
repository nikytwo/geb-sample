import geb.junit4.GebReportingTest
import geb.junit4.GebTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by Administrator on 2015/11/5.
 */

@RunWith(JUnit4)
class adfaa extends GebReportingTest {
    @Test
    void tttt() {
        go "/"

        assert title.contains("开源中国11")
    }
}
