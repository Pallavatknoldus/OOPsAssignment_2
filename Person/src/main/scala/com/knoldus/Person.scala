package com.knoldus

class Person(var name: String, var age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => if (this.age > that.age) 1  // this is greater
      else -1 // that is greater
      case _ => if (this.name.length > that.name.length) 1 // this is greater
      else -1 // that is greater

    }
  }
}
