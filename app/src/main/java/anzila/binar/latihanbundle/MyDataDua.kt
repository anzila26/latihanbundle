package anzila.binar.latihanbundle

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

@SuppressLint("ParcelCreator")
data class MyDataDua(val name: String = readLine()!!.toString(),
                     val email: String = readLine()!!.toString(),
                     val phone: String = readLine()!!.toString(),
                     val address: String = readLine()!!.toString(),
                     val age: String = readLine()!!.toString()) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(address)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyDataDua> {
        override fun createFromParcel(parcel: Parcel): MyDataDua {
            return MyDataDua(parcel)
        }

        override fun newArray(size: Int): Array<MyDataDua?> {
            return arrayOfNulls(size)
        }
    }
}
