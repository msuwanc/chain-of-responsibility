import chains._
import models.Numbers

object Main extends App {
  val divideChain: CalculationChain = new DivideChain
  val multiplyChain: CalculationChain = new MultiplyChain(divideChain)
  val subtractChain: CalculationChain = new SubtractChain(multiplyChain)
  val addChain: CalculationChain = new AddChain(subtractChain)

  val n: Numbers = Numbers(4, 2, "pow")

  addChain.calculate(n)
}