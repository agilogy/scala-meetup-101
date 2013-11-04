package com.meetup.scala

object collectionProcessing {

  // type inference!
  val l = List(1, 2, 3, 4)                        //> l  : List[Int] = List(1, 2, 3, 4)

  // 1) generate a list with *2 of each item in l
  // 1.1) verbose solution
  l.map((i : Int) => {i * 2})                     //> res0: List[Int] = List(2, 4, 6, 8)

  // 1.22) remove unnecessary code
  l.map(i => i * 2)                               //> res1: List[Int] = List(2, 4, 6, 8)
  l.map(_ * 2)                                    //> res2: List[Int] = List(2, 4, 6, 8)
  
  // WARNING!!! Entering WTF zone
  l.map(2 *)                                      //> res3: List[Int] = List(2, 4, 6, 8)
  l.map(i=> 2 *(i) )                              //> res4: List[Int] = List(2, 4, 6, 8)
  l.map((2).* (_))                                //> res5: List[Int] = List(2, 4, 6, 8)

  // 2) generate a list with *3 of each item in l
  l.map(3*)                                       //> res6: List[Int] = List(3, 6, 9, 12)

}