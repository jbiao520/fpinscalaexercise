package section.second
object fib{
  def main(args: Array[String]): Unit = {
    println(fib(5))
  }
  def fib(n: Int): Int={
    @annotation.tailrec
    def go(n:Int,pre:Int,cur:Int):Int=
      if(n<=0)  pre
      else go(n-1,cur,cur+pre)
    go(n,0,1)
  }


}

