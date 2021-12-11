package com.knoldus

object PersonObj extends App {
  var personOne = new Person("Pallav", 22)
  var personTwo = new Person("Pallav", 23)
  println(personOne < personTwo)

  var personThree = new Person("Test",25)
  var personFour = new Person("Testagain",24)
  println(personThree < personFour)

}