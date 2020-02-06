fun main(args: Array<String>) {
 var dog = Dog()
    dog.bread= "labrado"
    dog.color = "Cream"

    dog.bark()
    dog.eat()
}

open class Animal() {
    var color: String = ""
    fun eat() {
        println("Animal eats")
    }
}

class Dog:Animal() {
    var bread: String = ""
    fun bark() {
    }
}

class Cat:Animal() {
    var age: Int = -1
    fun meow() {
    }
}