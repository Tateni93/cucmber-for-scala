package utils.methods

import java.util.concurrent.TimeUnit

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.FluentWait
import Browser.Browser.driver

object Wait {

  def fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(20, TimeUnit.SECONDS)
    .pollingEvery(250, TimeUnit.MILLISECONDS)
    .ignoring(classOf[org.openqa.selenium.NoSuchElementException])
}
