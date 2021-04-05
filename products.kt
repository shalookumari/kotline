package com.ltts.myactivity

import java.util.*
import kotlin.collections.ArrayList
class POS
{
    var rd = Scanner(System.`in`)
    fun register()
    {
        print("Enter Customer's Name: ")
        println()
        var customerName = readLine()
        print("Enter Customer's Contact Number: ")
        println()
        var mob = rd.nextLong()
        print("Enter Customer's Address : ")
        println()
        var address = readLine()
        rd.nextLine()
        print("Enter Total items in cart: ")
        println()
        var itemno = rd.nextInt()
        val list = ArrayList<Any>()
        var TotalBill = 0.toFloat()
        for (i in 1..itemno)
        {
            println("Enter sale detail of $i item")
            print("Enter Item ID : ")
            println()
            var itemid = rd.nextInt()
            list.add(itemid)
            print("Enter Item Name: ")
            println()
            var itemname = readLine()
            if (itemname != null) {
                list.add(itemname)
            }
            print("Enter Price : ")
            println()
            var price = rd.nextFloat()
            list.add(price)
            print("Enter Quantity : ")
            println()
            var quant = rd.nextLong()
            list.add(quant)
            TotalBill += price * quant
        }
        println("BILL DETAILS")
        println("Customer's Name : $customerName")
        println("Customer's Contact: $mob")
        println("Customer's Address: $address")
        println("SALE DETAILS")
        for (i in list)
        {
            when(i){
                is Int -> print("Item ID: $i \n")
                is String -> print("Item name: $i \n")
                is Float -> print("Price: $i \n")
                is Long -> print("Quantity : $i \n")
            }
        }
        println()
        println("TOTAL BILL AMOUNT: $TotalBill")
    }
}
fun main(args:Array<String>)
{
    var obj = POS()
    obj.register()
}