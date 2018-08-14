package section.third
object List{

}

class List{
  sealed trait List[+A]
  case object Nil extends List[Nothing]
  case class Cons[+A](head:A,tail:List[A]) extends List[A]

  def sum(ints: List[Int]):Int = ints match{
    case Nil=>0
    case Cons(x,b)=>x+sum(b)
  }

  def drop[A] (l:List[A],n:Int):List[A]=
    if(n<=0) l
    else l match{
      case Nil=>Nil
      case Cons(x,xs)=>drop(xs,n-1)

    }

  def init[A](l:List[A]):List[A]= l match{
    case Nil=>Nil
    case Cons(_,Nil)=>Nil
    case Cons(x,y)=>Cons(x,init(y))
  }

  def dropWhile[A](l:List[A],f:A=>Boolean):List[A] = l match{
    case Cons(x,y) if(f(x)) =>dropWhile(y,f)
    case _=>l
  }

  def foldRight[A,B](a:List[A],z:B)(f:(A,B)=>B):B = a match{
    case Nil=>z
    case Cons(x,xs)=>f(x,foldRight(xs,z)(f))
  }

  def sum2[Int](a:List[Int])=
    foldRight(a,0)((x,y)=>x+y)

  def product2(a:List[Double]):Double=
    foldRight(a,1.0)((x,y)=>x*y)




}

