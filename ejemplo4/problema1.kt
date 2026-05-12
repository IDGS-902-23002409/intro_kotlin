/*  
Problema1 : Un programa solicita la uusario ingresar el diametro de una tuberia.
No se permiten valores negativos o cero. El programa debe oerdir el dato repetidamente hasta 
que el usuario ingrese un valor valido.
*/
fun main(){
    var diametro: Double
    do {
        println("Ingrese el diametro de la tuberia (valor positivo):")
        diametro = readLine()!!.toDouble()
        if (diametro <= 0) {
            println("Valor invalido. Por favor, ingrese un valor positivo.")
        }
    } while (diametro <= 0)
    println("El diametro ingresado es: $diametro")
}