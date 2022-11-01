package com.example.kotlinbasics

import android.app.Person

fun main(){
    //σχόλιο
    //TODO:add new memes here
    var p1 = MobilePhone("Android","Samsung",2020)
    var p2 = MobilePhone("iOS","Apple",2022, 5)
    p1.stateHobby()
    p2.hobby = "playing soccer"
    p2.stateHobby()
}

fun myFunction(a:Int){
    var a = a
}

class MobilePhone constructor(osName: String, brand: String, year: Int){

    var age: Int? = null
    var hobby: String = "Watching netflix"
    var osName: String? = null





    constructor(osName: String, brand: String, year: Int, age: Int): this(osName,brand,year){
        this.age = age
        println("Initializing phone: $osName, $brand, $year, $age")

    }

    init {
        println("Initializing phone: $osName, $brand, $year, $age")
        this.osName = osName
    }

    fun stateHobby (){
        println("$osName hobby is: $hobby")
    }

}

