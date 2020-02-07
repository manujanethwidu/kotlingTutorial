fun main(args: Array<String>) {
   // var dog = Dog("black", "Pub")

}

open class Animal{
    var color: String = ""

    constructor(color: String){
        this.color = color
    }
}

class Dog: Animal{
    var bread: String = ""

    constructor(color: String, bread: String) : super(color = color) {
        this.bread = bread
    }
}


