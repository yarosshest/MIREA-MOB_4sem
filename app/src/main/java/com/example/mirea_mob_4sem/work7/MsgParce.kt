package com.example.mirea_mob_4sem.work7

import android.os.Parcel
import android.os.Parcelable
import java.time.LocalDateTime

class MsgParce(value: Int, time: LocalDateTime) : Parcelable {
    var value: Int? = value
    var time: LocalDateTime? = time

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(value!!)
        parcel.writeSerializable(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MsgParce> {
        override fun createFromParcel(parcel: Parcel): MsgParce? {
            val value = parcel.readInt()
            val time = parcel.readSerializable() as LocalDateTime?
            return time?.let { MsgParce(value, it) }
        }

        override fun newArray(size: Int): Array<MsgParce?> {
            return arrayOfNulls(size)
        }
    }

}