package section.second

import scala.annotation.tailrec

object testIsSorted {
  def isSorted[A] (as:Array[A], gt:(A,A)=>Boolean):Boolean={
    @tailrec
    def aux(cur: Int, next: Int):Boolean={
      if(next>=as.length) true
      else{
        if(gt(as(next),as(cur))) aux(next,next+1)
        else false
      }
    }
    aux(0,1)
  }



}
