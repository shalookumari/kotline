package com.ltts.myactivity
import java.util.*
import kotlin.math.*
val PI = 3.14

fun areaCircle(radius: Double): Double {
    return PI * radius * radius
}
fun perimeterCircle(radius: Double): Double{
    return 2* PI* radius
}
fun sideofsquare(radius:Double):Double{
    return (2* PI* radius)/4
}
fun main(){

    val sc = Scanner(System.`in`)
    println("Enter Circle Radius  : ")
    val radius = sc.nextDouble()
    val areaCircle = areaCircle(radius)
    println("Area of Circle : $areaCircle")
    val perimeterCircle = perimeterCircle(radius)
    println("Perimeter of Circle : $perimeterCircle")

    val sideofsquare = sideofsquare(radius)
    println("Length of square $radius: $sideofsquare")


}

