//LAMBDA
package com.mm

//class Person (var name:String) {
class Person (){
    var name:String?=null

    fun display(){
        println("Display name: $name")
}
    //working with lambda
    //the fn displayWithLambda is taking a function declaration as a parameter
    //For the function declaration, we name it func
    //func takes a parameter s which  of type String
    //return type pf func is Unit
    // we then call func as the body of displayWithLambda and passing it 'name'

fun displayWithLambda(func: (s: String) ->Unit){
    //func(name)

}

}