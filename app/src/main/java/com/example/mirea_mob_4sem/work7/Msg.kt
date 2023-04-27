package com.example.mirea_mob_4sem.work7

import java.io.Serializable
import java.time.LocalDateTime


class Msg : Serializable {
    var value: Int? = null
    var time: LocalDateTime? = null

    constructor(value: Int, time: LocalDateTime) {
        this.value = value
        this.time = time
    }
}