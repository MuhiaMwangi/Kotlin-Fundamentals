//SEALED Classes CONCEPT

package com.mm

sealed class PersonEvent{
    class Awake:PersonEvent()
    class Asleep:PersonEvent()
    class Eating(val food:String):PersonEvent()
}

fun handlePersonEvent(event:PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Wide Awake")
        is PersonEvent.Asleep -> println("Dead Asleep")
        is PersonEvent.Eating-> println("Eating ${event.food}")
    }
}