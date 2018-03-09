package chains

import models.Numbers

class DivideChain extends CalculationChain {
  override def calculate(n: Numbers): Unit = {
    if(n.operation == "divide") {
      println(s"${n.number1} / ${n.number2} = ${n.number1 / n.number2}")
    } else {
      println("We only support add, subtract, multiply and divide operations only")
    }
  }

  override def callNextChain(calC: CalculationChain, n: Numbers): Unit = calC.calculate(n)
}