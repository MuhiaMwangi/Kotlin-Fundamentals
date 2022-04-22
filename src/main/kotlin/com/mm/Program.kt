

package com.mm
fun main (args:Array<String>){
    display1("Hello world")
    println(max(4,2))
}
fun display1(message:String):Boolean{
    println(message)
    return true
}
//Function expression
fun max(a:Int, b:Int): Int=if(a>b)a else b


