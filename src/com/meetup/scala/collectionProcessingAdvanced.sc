package com.meetup.scala

object collectionProcessingAdvanced {
  val l = List(1, 2, 3, 4)                        //> l  : List[Int] = List(1, 2, 3, 4)

  // 3) deferr operation
  val twice = (i : Int) => 2 * i                  //> twice  : Int => Int = <function1>
  val thrice = (i : Int) => 3 * i                 //> thrice  : Int => Int = <function1>
  def nice(n:Int) = (i:Int) => n * i              //> nice: (n: Int)Int => Int

  l.par.map { i => {
     println(i)
     i
  }}                                              //> 4
                                                  //| 2
                                                  //| 1
                                                  //| 3
                                                  //| res0: scala.collection.parallel.immutable.ParSeq[Int] = ParVector(1, 2, 3, 4
                                                  //| )

}