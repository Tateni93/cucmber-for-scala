package stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import utils.methods.Input._

class BaseStepDefs extends ScalaDsl with EN {

  And("""^I type (.*) in (.*)$""") { (text: String, id: String) =>
    sendKeysByName(id, text)
  }

  Then("""^I click (.*)$""") { (id: String) =>
    clickByName(id)
  }
}
