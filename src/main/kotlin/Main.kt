import com.mm.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val Kevin = Person()
    Kevin.name
    println("Name is ${Kevin.name}")

   // val Student=Person("James")
    //println(Student.name)
    //Student.display()


    fun printName(name:String){
        println("Name is: $name")
    }

//calling a lambda
    //Student.displayWithLambda (::printName)
}