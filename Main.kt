package ru.netology


fun main() {
    val amount = 50000
    val limitPay = 35
    val PayPercent = amount * 0.75 / 100
    if (PayPercent < limitPay){
        println("Комиссия за перевод составит " + limitPay + " рублей")
    } else{
        println("Комиссия за перевод составит " + PayPercent + " рублей")
    }




}