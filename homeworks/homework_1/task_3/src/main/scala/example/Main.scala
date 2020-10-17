package example

object Main extends App {
  val mainSentense = "Scala! This is Dmitry Kovalenko";
  val greetings = List("Hello ", "Hola ", "Guten tag ")

  for (greeting <- greetings) hello(mainSentense, greeting, false);
  for (greeting <- greetings) hello(mainSentense, greeting, true);

  def hello(s: String, w: String, isReverse: Boolean): Unit = {
    if(isReverse){
      println((w + s).reverse)
    } else {
      println(w + s)
    }
  }
}
