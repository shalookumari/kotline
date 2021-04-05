package com.ltts.myactivity

import java.util.Scanner
import java.util.*

fun main(args:Array<String>){
    val rd = Scanner(System.`in`)
    println("Enter number")
    val num = rd.nextInt()
    var a : Int = 0
    var b : Int = 1
    for (i in 1.. num){
        println("$a")
        var x : Int = a + b
        a = b
        b = x
    }
}