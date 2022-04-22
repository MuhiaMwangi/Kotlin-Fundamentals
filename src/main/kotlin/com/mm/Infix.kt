//Infix Functions and Operator Overloading

package com.mm

fun main(args: Array<String>) {
   val h1=Header("H1")
   val h2=Header("H2")
    val h3= h1.plus(h2)  // Without infix
    val h4= h1 plus h2 //With infix

    //As seen above, with use of infix, we make code more readable-> with simpler syntax
    println("${h3.name1}")
    println("${h4.name1}")

    //demonstrating operator overloading
    val h5 = h1 + h2
    println("${h5.name1}")

}

class Header(var name1:String){
}
//we used 'operator' keyword to the function definition to enable operator-overloading
//Only a predefined set of operators can be overloaded in Kotlin
operator infix fun Header.plus(other:Header):Header{
    return Header(this.name1+other.name1)
}