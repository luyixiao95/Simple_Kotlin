package com.rsk.rsk.kotlin

class Organizer {
}

fun main(args: Array<String>) {
//    var newMeeting = m ?: Meeting()

    var m: Meeting? = null
    closeMeeting(m)
    m?.let { closeMeetingNonNull(m) }
}

fun closeMeeting(m: Meeting?): Boolean? {
//    return if (m?.canClose == true) m?.close()
//    else false

    return if (m!!.canClose) m.close()
    else false
}
fun closeMeetingNonNull(m: Meeting): Boolean? {

    return if (m.canClose) m.close()
    else false
}
class Meeting {
    val canClose: Boolean = false
    lateinit var address: Address
    fun close(): Boolean {
        return false
    }
    fun save(o: Any) {
        val saveable = o as? ISaveable
    }
    fun init(addr: Address) {
        this.address = addr
    }
}

interface ISaveable {
    fun save()
}

class Address {

}