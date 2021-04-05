package com.ltts.myactivity

import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the number: ")
    val num= sc.nextInt()
    val factorial= lambda(num)
    println("factorial of $num: $factorial")
}

fun lambda(num:Int):Long{
    if(num>=1)
        return num*lambda(num-1)
    else
        return 1
}