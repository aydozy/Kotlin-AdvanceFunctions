package com.aydanilozyurek.kotlinadvancefunctions

fun main(){

    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    // Filter

    /*  Return new List

    val smallNumList =   myNumList.filter {
        num -> num < 6
    }

    for (num in smallNumList){
        println(num)
    }
    */
    val smallNumList =   myNumList.filter {
           it < 6
    }

    for (num in smallNumList){
        println(num)
    }

    println()

    // Map

    val squaredNum = myNumList.map { num -> num * num  /* it * it */ }
    for(num in squaredNum){
        println(num)
    }

    println()

    // Filter and Map

    val filterAndMapCombined = myNumList.filter { it < 6  }.map { it * it }
    for(num in filterAndMapCombined){
        println(num)
    }

    println()

    val musicians = listOf<Musician>(
        Musician("James",60,"guitar"),
        Musician("Kirk",48,"drum"),
        Musician("Ed",14,"violin"),
        Musician("Sezar",65,"guitar"),
    )

    val filterMusician = musicians.filter { musician -> musician.age < 60  }
        .map { musician -> musician.instrument }

    for(element in filterMusician){
        println(element)
    }


}


data class Musician(val name: String, val age: Int, val instrument: String)