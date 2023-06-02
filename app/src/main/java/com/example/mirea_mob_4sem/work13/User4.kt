package com.example.mirea_mob_4sem.work13

class User4 internal constructor(val id: Long, var name: String, var year: Int) {

    override fun toString(): String {
        return name + " : " + year
    }
}