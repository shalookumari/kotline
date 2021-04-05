package com.ltts.myactivity

import java.util.*
import java.util.function.DoubleUnaryOperator

fun main(args:Array<String>){
    val rd = Scanner(System.`in`)
    print("Enter the Quantity Please")
    val quant = rd.nextDouble()
    print("Enter the Unit Price of a sold item")
    val up = rd.nextDouble()

    val Bill = BillAmount(quant, up)
    println("Bill Amount is : $Bill")

    var Discount :Double = (.15*Bill)
    var Total : Double = Bill-Discount

    println("Discount is: $Discount")
    println("Final Bill Amount is : $Total")
}
fun BillAmount(a:Double, b:Double): Double{
    val bill = a*b
    return bill
}