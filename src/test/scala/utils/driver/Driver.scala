package utils.driver

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import uk.gov.hmrc.webdriver.SingletonDriver

import scala.util.Try

object Driver {

  val options = new ChromeOptions()
  options.setHeadless(true)

  lazy val driver: WebDriver = SingletonDriver.getInstance(Some(options))

  sys addShutdownHook {
    Try(SingletonDriver.closeInstance())
  }
}
