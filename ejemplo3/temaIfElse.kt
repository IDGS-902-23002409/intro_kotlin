import kotlin.math.pow

fun main(){
    println("Ingrese sueldo del empleado")
    val sueldo = readLine()!!.toDouble()
    if(sueldo > 300){
        println("Paga Impuesto")
    } else {
        println("No paga Impuesto")

    }

    val a =3
    val b =5
    val mayor = if(a > b) a else b
    println("El mayor es: $mayor")

    val base = 2.0
    val exponente = 3.0
    val res= base.pow(exponente)
    println("$base elevado a $exponente es: $res")      
}
