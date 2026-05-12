/*  
problema 3: Un controlador de PLC bloquea el acceso tras 3 intentos fallidos de ingresar una clave de seguridad. Escriba un programa que simule este comportamiento, solicitando al usuario ingresar la clave y contando los intentos. El programa debe finalizar con un mensaje indicando si el acceso fue concedido o bloqueado.
 */

fun main(){
    val claveSeguridad = "1234"
    var intentos = 0
    var accesoConcedido = false

    while (intentos < 3) {
        println("Ingrese la clave de seguridad:")
        val claveIngresada = readLine()!!

        if (claveIngresada == claveSeguridad) {
            accesoConcedido = true
            break
        } else {
            intentos++
            println("Clave incorrecta. Intento $intentos de 3.")
        }
    }

    if (accesoConcedido) {
        println("Acceso concedido.")
    } else {
        println("Acceso bloqueado. Demasiados intentos fallidos.")
    }
}