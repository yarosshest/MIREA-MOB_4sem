package com.example.mirea_mob_4sem.work7

import java.io.Serializable
import java.time.LocalDateTime


class Msg(value: Int, time: LocalDateTime) : Serializable {
    var value: Int? = value
    var time: LocalDateTime? = time

}