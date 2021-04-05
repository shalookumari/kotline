package com.ltts

import java.util.*
fun main() {
    val courseName = arrayOf<String>("Physics", "Chemistry", "Maths")
    val scanner = Scanner(System.`in`)
    val scoreArray = DoubleArray(3)
    println("Enter the Marks:")
    for (i in scoreArray.indices) {
        print("${courseName[i]} : ")
        scoreArray[i] = scanner.nextDouble()
    }
    val total = scoreArray.sum()
    val percentage = scoreArray.average()
    println("Total of All subjects Marks : $total")
    println("Percentage : $percentage")
}
