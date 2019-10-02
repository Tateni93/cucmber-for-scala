package utils.methods

import utils.driver.Driver.driver

object Navigate {

  def navigateTo(url: String) = driver.navigate().to(url)
}
