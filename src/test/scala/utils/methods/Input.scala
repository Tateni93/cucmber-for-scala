package utils.methods

import Find._

object Input {


  def clickById(id: String) = ???
  def clickByName(id: String) = findByName(id).submit()
  def clickByCss = ???
  def clickByXpath = ???
  def clickByClass = ???

  def sendKeysById(id: String, text: String)  = ???
  def sendKeysByName(id: String, text: String)  = findByName(id).sendKeys(text)
  def sendKeysByCss = ???
  def sendKeysByXpath = ???
  def sendKeysByClass = ???


}
