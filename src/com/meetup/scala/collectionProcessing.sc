package com.meetup.scala

object collectionProcessing {

  // type inference!
  val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)     //> l  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)


  // 1) generate a list with *2 of each item in l
  // 1.1) verbose solution
  l.map((i : Int) => {i * 2})                     //> res0: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

  // 1.22) remove unnecessary code
  l.map(i => i * 2)                               //> res1: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  l.map(_ * 2)                                    //> res2: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  // WARNING!!! Entering WTF zone
  l.map(2 *)                                      //> res3: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  l.map(i=> 2 *(i) )                              //> res4: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  l.map((2).* (_))                                //> res5: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

  // 2) generate a list with *3 of each item in l
  l.map(3*)                                       //> res6: List[Int] = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)

  // 3) deferr operation
  val twice = (i : Int) => 2 * i                  //> twice  : Int => Int = <function1>
  val thrice = (i : Int) => 3 * i                 //> thrice  : Int => Int = <function1>
  def ice(n:Int) = (i:Int) => n * i               //> ice: (n: Int)Int => Int
  
  
  
  val byFour = ice(4)                             //> byFour  : Int => Int = <function1>

  l map { twice }                                 //> res7: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
  l map { thrice }                                //> res8: List[Int] = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
  l map { byFour }                                //> res9: List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40)


  l map { twice.andThen(thrice) }                 //> res10: List[Int] = List(6, 12, 18, 24, 30, 36, 42, 48, 54, 60)

  // dot is replaceable with whitespace
  // parens are optional and usually replaceable tih curly braces
  // Luke, I'm your father.
  // functions can be declared inline
}