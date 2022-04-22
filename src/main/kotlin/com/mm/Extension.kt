//Extension Functions

package com.mm

fun main(args: Array<String>){
val text="Text     with  multiple       Whitespace  "
    println(text)
    println(replaceMultipleWhiteSpaces(text))//helper function
    println(text.replaceMultipleWhiteSpacesEx())//extension function"

}

//This is a static function
//its top-level fn here
//if it was in Java, it would be in a Utility class -- StringUtil
fun replaceMultipleWhiteSpaces(value: String):String {

    //this fun runs a regular expression over the passed in text,
    // replacing multiple whitespace characters with a single whitespace character
    var regex = Regex("\\s+")
    return  regex.replace(value," ")
}

/*EXTENSION fns BENEFITS
1. Cuts down on use of utility classes
2. Makes code easier to read
*/


//Here,we create this fn as an extension function of the String Class
fun String.replaceMultipleWhiteSpacesEx():String {

    var regex = Regex("\\s+")
    return  regex.replace(this," ")
}
