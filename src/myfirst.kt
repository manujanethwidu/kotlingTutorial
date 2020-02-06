fun main(args: Array<String>) {
 var dog = Dog()

    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.eat()

    println(dog.color)
}

open class Animal() {
    open var color: String = "White"
    open fun eat() {
        println("Animal eats")
    }
}

class Dog:Animal() {
    override var color:String = "Black"
    var bread: String = ""
    fun bark() {
    }

   override fun eat() {
        println("Dog eats")
    }
}

class Cat:Animal() {
    var age: Int = -1
    fun meow() {
    }

    override fun eat() {
        super<Animal>.eat()
        println("Cat eats")
    }
}