package com.meetup.scala

object patternMatching {

  def run(input : Any) = {
    input match {
      case s : String => println(s)
      case i : Int    => println("A number: " + i)
      case _          => println("Something else. " + input)
    }
  }                                               //> run: (input: Any)Unit

  run("A long time ago in a galaxy far far away...")
                                                  //> A long time ago in a galaxy far far away...
  run(234)                                        //> A number: 234
  run(() => 42)                                   //> Something else. <function0>

}