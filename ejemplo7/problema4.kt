/*  Crear un programa que permita calcular el área de 4 figuras, mostrara un menú para elegir la figura a calcular el área, pedirá los valores necesarios y mostrara el resultado, a continuación, mostrara nuevamente el menú termina al elegir opción 5 */
fun circuloArea(radio: Double): Double {
    return Math.PI * radio * radio
}

fun cuadradoArea(lado: Double): Double {
    return lado * lado
}

fun rectanguloArea(base: Double, altura: Double): Double {
    return base * altura
}
fun trianguloArea(base: Double, altura: Double): Double {
    return (base * altura) / 2
}


fun main(){
    var opcion: Int
    do {
        println("Seleccione la figura para calcular el área:")
        println("1. Cuadrado")
        println("2. Rectángulo")
        println("3. Círculo")
        println("4. Triángulo")
        println("5. Salir")
        opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Ingrese el lado del cuadrado:")
                val lado = readLine()!!.toDouble()
                val areaCuadrado = cuadradoArea(lado)
                println("El área del cuadrado es: $areaCuadrado")
            }
            2 -> {
                println("Ingrese la base del rectángulo:")
                val base = readLine()!!.toDouble()
                println("Ingrese la altura del rectángulo:")
                val altura = readLine()!!.toDouble()
                val areaRectangulo = rectanguloArea(base, altura)
                println("El área del rectángulo es: $areaRectangulo")
            }
            3 -> {
                println("Ingrese el radio del círculo:")
                val radio = readLine()!!.toDouble()
                val areaCirculo = circuloArea(radio)
                println("El área del círculo es: $areaCirculo")
            }
            4 -> {
                println("Ingrese la base del triángulo:")
                val base = readLine()!!.toDouble()
                println("Ingrese la altura del triángulo:")
                val altura = readLine()!!.toDouble()
                val areaTriangulo = trianguloArea(base, altura)
                println("El área del triángulo es: $areaTriangulo")
            }
            5 -> println("Saliendo del programa.")
            else -> println("Opción inválida. Por favor, seleccione una opción entre 1 y 5.")
        }
    } while (opcion != 5)
}   