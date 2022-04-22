//Tail Recursive Functions

package com.mm

import  java.math.BigInteger
fun main(args: Array<String>){
    println(fibonacci(10000000,
        BigInteger("1") ,
        BigInteger("0")
    ))
}
//Using tailrec keyword to make this function tail recursive
//Kotlin will turn this recursive fn to a loop internally inside the bytecode to avoid the StackOverflowError
tailrec fun fibonacci(n: Int, a:BigInteger,b:BigInteger):BigInteger{
return if (n==0)b else fibonacci(n-1, a+b,a)
//this fun is recursive :if is 0 return a value otherwise call itself
}