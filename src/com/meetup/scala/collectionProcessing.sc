package com.meetup.scala

object collectionProcessing {

  // type inference!
  val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)     //> l  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)



 // 1) generate a list with *2 of each item in l
 // 1.1) verbose solution
 l.map( (i:Int) => i*2)                           //> res0: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
 
 // 1.22) remove unnecessary code
 l.map( i => i*2)                                 //> res1: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
 l.map( _*2)                                      //> res2: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
 // WARNING!!! Entering WTF zone
 l.map( 2 *)                                      //> res3: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)



	// 2) generate a list with *3 of each item in l
	l.map( 3*)                                //> res4: List[Int] = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
	
	
	
	// 3) deferr operation
	def twice= (i:Int)=> 2*i                  //> twice: => Int => Int
	def thrice= (i:Int)=> 3*i                 //> thrice: => Int => Int
	
	l map {twice}                             //> res5: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
	l map {thrice}                            //> res6: List[Int] = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30)
	
	// dot is replaceable with whitespace
	// parens are optional and usually replaceable tih curly braces
	// Luke, I'm your father.
	// functions can be declared inline
}