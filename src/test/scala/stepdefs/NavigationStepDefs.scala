package stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import utils.methods.Navigate._

class NavigationStepDefs extends ScalaDsl with EN {

  //implement navigate stepdef using code from the util/page classes
  When("""^I go to (.*)$""") { (url: String) =>
    navigateTo(url)
  }

}
