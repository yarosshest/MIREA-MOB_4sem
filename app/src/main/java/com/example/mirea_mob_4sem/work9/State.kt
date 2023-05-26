package com.example.mirea_mob_4sem.work9

class State(
    private var name: String,  // название
    private var capital: String,  // столица
    private var flagResource: Int // ресурс флага
    ) {
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCapital(): String {
        return capital
    }

    fun setCapital(capital: String) {
        this.capital = capital
    }

    fun getFlagResource(): Int {
        return flagResource
    }

    fun setFlagResource(flagResource: Int) {
        this.flagResource = flagResource
    }
}