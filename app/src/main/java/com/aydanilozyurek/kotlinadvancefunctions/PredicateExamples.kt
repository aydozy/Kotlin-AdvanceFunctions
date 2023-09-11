package com.aydanilozyurek.kotlinadvancefunctions

fun main() {


    val myNumList = listOf<Int>(1, 3, 5, 7, 9, 11, 13, 15)

    val allCheck = myNumList.all { it > 5 }
    println(allCheck)

    println()

    val anyCheck = myNumList.any { it > 5 }
    println(anyCheck)

    println()

    val totalCount = myNumList.count { it > 5 }
    println(totalCount)

    println()

    val findFirst = myNumList.find { it > 5 }
    println(findFirst)

    println()

    val findLast = myNumList.findLast { it > 5 }
    println(findLast)

    println()

    // One time predicate
    val myPredicate = {num : Int -> num > 5}
    val allCheckPredicate = myNumList.all(myPredicate)
    println(allCheckPredicate)

}