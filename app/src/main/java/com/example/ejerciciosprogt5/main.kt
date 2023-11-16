package com.example.ejerciciosprogt5

import java.lang.Exception

fun main(){

    var cadena1=" asdfghjikl "
    var cadena2="swedrftgyhjukiolpñ"

    println(longitud(cadena1))

    if(cadena1.equals(cadena2)){
        println("hola")
    }else{
        println("no coinciden")
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

    //13 y 14
    var n1:Int?=null
    var n2:Int?=null
    var res=(n1?:2)+ (n2?:3)
    println(res)

    //15
    comprobacion("asdfghjklñ")

    //16 y 17
    println("Introduce numeros:")
    var num1= readLine()
    var num2 = readLine()
    println(division(num1,num2))



}

fun longitud(cadena: String): Int {
    var res = 0
    res = cadena.length
    return res
}

//15
fun comprobacion(nose:Any) {
    if(nose is String) {
        println(nose.length)
    }

}

//16 y 17,18
fun division(s1:String?,s2:String?):Double{
    var n1=s1?.toDouble()?:10.0
    var n2=s2?.toDouble()?:2.0
    var res=0.0
    if(n1==0.0 || n2==0.0){
        throw Exception("El valor de algún número es 0")
    }
    res=n1/n2

    return res



}