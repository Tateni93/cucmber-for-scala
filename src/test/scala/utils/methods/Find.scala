package utils.methods

import java.nio.channels.Selector

import org.openqa.selenium.By.ById
import org.openqa.selenium.{By, WebElement}
import utils.driver.Driver.driver

object Find {

  def findById(id: String) = ???
  def findByName(id: String) = driver.findElement(By.name(id))
  def findByCss: WebElement = ???
  def findByXpath: WebElement = ???
  def findByClass: WebElement = ???
}
