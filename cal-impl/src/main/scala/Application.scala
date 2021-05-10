class Application {
  val ob = new Calculator

}

object main{

  def main(args: Array[String]): Unit = {

    val obj = new Application
    println("+ operator for 1 and 9 gives " + obj.ob.sum(1,9))
    println("- operator for 30 and 10 gives " + obj.ob.sub(30, 10))
    println("* operator for 10 and 3 gives " + obj.ob.multi(10,3))
    println("/ operator for 360 and 9 gives " + obj.ob.div(360, 9))

  }
}
