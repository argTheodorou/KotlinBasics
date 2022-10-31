package com.example.kotlinbasics

fun main(){
    //σχόλιο
    //TODO:add new memes here

    var roomTemp = 10
    var feltTemp = "Cold"

    while(feltTemp == "Cold"){
         roomTemp++
        if(roomTemp >= 20){
            feltTemp = "Comfy"
            println("Its Comfy now")
        }
    }
    println("finished")





}

