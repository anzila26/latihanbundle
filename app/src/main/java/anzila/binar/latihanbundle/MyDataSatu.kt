package anzila.binar.latihanbundle

import java.io.Serializable

data class MyDataSatu(val name : String = readLine()!!.toString(),
                      val email : String = readLine()!!.toString(),
                      val phone : String = readLine()!!.toString(),
                      val address : String = readLine()!!.toString(),
                      val age : String = readLine()!!.toString()) : Serializable
