package com.rsk

class LightBulb {
}
sealed class PersonEvent {
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eathing(val food: String) : PersonEvent()
}
fun handlePersonEvent(event: PersonEvent) {
    when(event) {
         is PersonEvent.Awake -> println("Aeake")
        is PersonEvent.Asleep -> println("Sleep")
        is PersonEvent.Eathing -> println(event.food)
    }
}