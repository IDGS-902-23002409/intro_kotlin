fun main(){
    val saludar="Hola Mundo" //inmutable
    var nombre: String ="Juan" //mutable
    println("$saludar, mi nombre es $nombre")
    println("Ingrese primer numero")
    val num1= readLine()!!.toInt()
    println("Ingrese segundo numero")
    val num2= readLine()!!.toInt()
    val suma=num1+num2
    println("La suma de $num1 y $num2 es: $suma")
}
