fun main(args: Array<String>) {
    var dog = Dog("black","Pub")

}

open class Animal( var color:String) {
init {
    println("From the animal init $color")
}
}

class Dog( color:String,var bread:String) : Animal("Black") {
init {
    println("From dog init: $color and $bread")
}
}


