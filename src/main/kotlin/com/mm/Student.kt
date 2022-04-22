//DATA Classes CONCEPT

package com.mm

fun main(args:Array<String>){
    var mary =Student(1,"Mary")
    var  claire=Student(1,"Mary")
    var robert= claire.copy(name="Robert")

    if (mary==claire){
        println("Equal")
    }else{
        println("Not equal")
        }
    println(mary)

    println(robert)

}
data class Student(val id: Int, val name:String){

}
