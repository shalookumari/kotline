package com.ltts.myactivity

import java.util.*
fun main(args:Array<String>){
    val rd = Scanner(System.`in`)
    println("Enter number")
    var n =rd.nextInt()
    var a = 2
    var b = n

    while(a < b){
        if(isPrimeNumber(a)){
            println(a)
        }
        ++a
    }
}
fun isPrimeNumber(x:Int):Boolean{
    val res = true
    for(i in 2..x /2){
        if(x % i == 0){
            var res = false
            break
        }
    }
    return res
}