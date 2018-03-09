package chains

import models.Numbers

class AddChain(calC: CalculationChain) extends CalculationChain {
  override def calculate(n: Numbers): Unit = {
    if(n.operation == "add") {
      println(s"${n.number1} + ${n.number2} = ${n.number1 + n.number2}")
    } else {
      callNextChain(calC, n)
    }
  }

  override def callNextChain(calC: CalculationChain, n: Numbers): Unit = calC.calculate(n)
}