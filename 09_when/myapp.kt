fun main(args: Array<String>){
  // when
  val num = 5

  /*when(num){
    0 -> println("Zero")
    1 -> println("One")
    2,3 -> println("Two or Three")
    in 4..10 -> println("Many")
    else -> println("Other")
  }*/
  val result =  when (num){
    0 -> ("Zero")
    1 -> ("One")
    2, 3 -> ("Two or Thee")
    in 4..10 -> ("Many")
    else -> ("Other")
  }
  println(result)
}
