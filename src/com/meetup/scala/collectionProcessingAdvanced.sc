package com.meetup.scala

object collectionProcessingAdvanced {
  // type inference!
  val l = List(1, 2, 3, 4)                        //> l  : List[Int] = List(1, 2, 3, 4)

  // 3) deferr operation
  val twice = (i : Int) => 2 * i                  //> twice  : Int => Int = <function1>
  val thrice = (i : Int) => 3 * i                 //> thrice  : Int => Int = <function1>
  def ice(n:Int) = (i:Int) => n * i               //> ice: (n: Int)Int => Int
  
  val byFour = ice(4)                             //> byFour  : Int => Int = <function1>

  l map { twice }                                 //> res0: List[Int] = List(2, 4, 6, 8)
  l map { thrice }                                //> res1: List[Int] = List(3, 6, 9, 12)
  l map { byFour }                                //> res2: List[Int] = List(4, 8, 12, 16)

  l map { twice.andThen(thrice) }                 //> res3: List[Int] = List(6, 12, 18, 24)
}