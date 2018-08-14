object curry{
  def curry[A,B,C](f:(A,B)=>C):A=>(B=>C)=
    f(a:A)=>b=>f(a,b)

  def uncurry[A,B,C](f:A=>B=>C):(A,B)=>C=
    (a,b)=>f(a)(b)

  def compose[A,B,C](f:B=>C,g:A=>B)=
    x=>f(g(x))
}