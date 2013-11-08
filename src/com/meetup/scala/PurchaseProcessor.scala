package com.meetup.scala

case class Item(productId : String, rupees : Int)
case class Purchase(items : List[Item])

trait Processor[T] {
  def process(t : T) : Unit
}
trait PurchaseProcessor extends Processor[Purchase]

object PurchaseProcessor {

  val forPayPal = new PurchaseProcessor {
    def process(p : Purchase) = println(p) // do real stuff here
  }

  val forVisa = new PurchaseProcessor {
    def process(p : Purchase) = println(p) // do real stuff here
  }

}