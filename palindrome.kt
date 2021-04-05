package com.ltts.myactivity

import java.util.*

fun Palindrome(n:Int):Boolean{
    var x : Int = n
    var rev = 0
    while(x != 0){
        val rem = x % 10
        rev = rev * 10 + rem
        x /=10
    }
    val res = true

    for( i in 1..n){
        if(n  != rev){
            var res = false
        }
    }
    return res
}
fun main(args:Array<String>) {
    val rd = Scanner(System.`in`)
    println("Enter number")
    var num = rd.nextInt();
    var a = 0
    val b = num
    while (a < b) {
        if (Palindrome(a)) {
            println("Palindrome $a")
        }
        ++a
    }
}