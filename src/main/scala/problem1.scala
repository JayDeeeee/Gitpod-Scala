object problem1 extends App {
  val text = "Hello, Janik!"

  var charCount: Int = 0
  for (c <- text) {
    c match {
        case 'j' | 'J'  => charCount = charCount + 1
        case _          => 
    }
  }
  println(s"The character j/J appears $charCount times.")
}