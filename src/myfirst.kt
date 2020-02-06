fun main(args:Array<String>){
    var student=Student("Sriyank")
}

class Student(_name:String){
    var name :String="dummy"
    init {
        this.name=_name
        println("Name is ${name}")
    }
}