package chains

import models.Numbers

trait CalculationChain {
  def calculate(n: Numbers): Unit
  def callNextChain(calC: CalculationChain, n: Numbers): Unit
}