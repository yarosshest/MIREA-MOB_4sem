package com.example.mirea_mob_4sem.work11

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class Work111MyViewModel : ViewModel() {
    private val isStarted = MutableLiveData(false)
    private var value: MutableLiveData<Int>? = null
    fun getValue(): LiveData<Int> {
        if (value == null) {
            value = MutableLiveData(0)
        }
        return value as MutableLiveData<Int>
    }

    fun execute() {
        if (!isStarted.value!!) {
            isStarted.postValue(true)
            val runnable = Runnable {
                for (i in value!!.value!!..100) {
                    try {
                        value!!.postValue(i)
                        Thread.sleep(400)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }
            val thread = Thread(runnable)
            thread.start()
        }
    }
}