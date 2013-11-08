package com.meetup.scala


object patternMatching {

case class Foo(bar:String, baz:Int)
 println("hello")                                 //> hello

  def run(input : Any) = {
    input match {
      case s : String => println(s)
      case i : Int    => println("A number: " + i)
      case Foo(s,i)   if (i==5) => println (s)
      case _          => println("Something else. " + input)
    }
  }                                               //> run: (input: Any)Unit

  run("A long time ago in a galaxy far far away...")
                                                  //> A long time ago in a galaxy far far away...
  run(234)                                        //> A number: 234
  run(() => 42)                                   //> Something else. <function0>

  run(Foo("str", 42))                             //> Something else. Foo(str,42)
  run(Foo("str1234", 5))                          //> str1234


}