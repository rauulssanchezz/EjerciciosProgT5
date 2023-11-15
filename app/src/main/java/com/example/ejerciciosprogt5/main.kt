package com.example.ejerciciosprogt5

fun main(){

    var cadena1=" asdfghjikl "
    var cadena2="swedrftgyhjukiolpñ"

    if(cadena1.equals(cadena2)){
        println("hola")
    }

    println(cadena1.compareTo(cadena2))

    cadena1=cadena1.uppercase()
    println(cadena1)
    cadena2=cadena2.lowercase()
    println(cadena2)
    cadena1=cadena1.trim()
    println(cadena1)
    cadena2=cadena2.substring(5,10)
    println(cadena2)
    cadena1=cadena1.replace("a","pito")
    println(cadena1)
    var array= cadena1.split("i")
    println(array)
    cadena1=cadena1+cadena2
    println(cadena1)
    var cadena3="dfghjklñ %s fhjklñ %s rftgyuhjikol".format("pito","chico")
    println(cadena3)
    println(cadena3.substring(5,cadena3.length))
}

fun longitud(cadena: String): Int {
    var res = 0
    res = cadena.length
    return res
}