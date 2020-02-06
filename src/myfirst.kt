fun main(args:Array<String>){
    var student=Student("Sriyank",10)
    print(student.id)
}

class Student(_name:String){
    var name :String="dummy"
    var id:Int= -1
    init {
        this.name=_name
        println("Name is ${name}")
    }

    constructor(name:String,id:Int):this(name){
        this.id=id

    }
}