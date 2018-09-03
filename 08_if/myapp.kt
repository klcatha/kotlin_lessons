fun main(args: Array<String>) {
  // if
  val score = 45
  // > >= < <= == !=
  /*if (score > 80) {
    println("great!")
  }else if (score > 60){
    println("good!")
  }else{
    println("so so ...")
  }*/
  val result = if (score > 80) "Great" else "so so ..." // 式として表現
  println(result)
}
