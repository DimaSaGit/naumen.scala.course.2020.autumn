object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    var x = 0;
    var y = 1;

    if(idx==0) return 0;

    for (i<- 2 to idx) {
      y = x + y;
      x = y - x;
    }
    return y;
  }

  def fibonacci(idx: Int): Seq[Int] = for(i<-0 to idx) yield(fibonacci4Index(i));

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    val result = text.split("").map(s =>
      if (MORSE.contains(s.toUpperCase))
        ' ' + MORSE(s.toUpperCase)
      else if (s == " ") "  "
      else s)
    result.mkString("")
  }


  def wordReverse(text: String): String = {
    val result = text.split("(?=[!. ,?])|(?<=[!. ,?])").map(s =>
      if(s.charAt(0).isUpper) s.toLowerCase.reverse.capitalize
      else s.reverse)
    result.mkString("")
  }

}
